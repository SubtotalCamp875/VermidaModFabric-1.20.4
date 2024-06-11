package net.subtotalcamp875.vermidamod.entity.ai;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.goal.ProjectileAttackGoal;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.subtotalcamp875.vermidamod.entity.custom.BronzeShamanEntity;
import net.subtotalcamp875.vermidamod.entity.custom.MagicOrbProjectileEntity;


public class BronzeShamanAttackSpellGoal extends ProjectileAttackGoal {
    private final BronzeShamanEntity entity;
    private int attackDelay = 20;
    private int attackTick = 0;
    private int ticksUntilNextAttack = 80;
    private boolean shouldCountTillNextAttack = false;

    public BronzeShamanAttackSpellGoal(RangedAttackMob mob, double mobSpeed, int intervalTicks, float maxShootRange) {
        super(mob, mobSpeed, intervalTicks, maxShootRange);
        entity = ((BronzeShamanEntity) mob);
    }


    @Override
    public void start() {
        super.start();
        attackDelay = 20;
        attackTick = 0;
        ticksUntilNextAttack = 80;
    }

    protected void checkAndPerformAttack(LivingEntity pEnemy) {
        if (isEnemyWithinAttackDistance(pEnemy)) {
            shouldCountTillNextAttack = true;

            if(isTimeToStartAttackAnimation()) {
                entity.setAttacking(true);
            }

            if(isTimeToAttack()) {
                this.entity.getLookControl().lookAt(pEnemy.getX(), pEnemy.getEyeY(), pEnemy.getZ());
                performRangedAttack(pEnemy);
            }
        } else {
            attackTick = 0;
            resetAttackCooldown();
            shouldCountTillNextAttack = false;
            entity.setAttacking(false);
            entity.attackAnimationTimeout = 0;
        }
    }

    private boolean isEnemyWithinAttackDistance(LivingEntity pEnemy) {
        return this.entity.distanceTo(pEnemy) <= 35f; // TODO
    }

    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = this.getTickCount(attackDelay * 8);
    }

    protected boolean isTimeToStartAttackAnimation() {
        return this.ticksUntilNextAttack <= attackDelay;
    }

    protected boolean isTimeToAttack() {
        return this.ticksUntilNextAttack <= 0;
    }

    protected void performRangedAttack(LivingEntity pEnemy) {
        ++attackTick;
        if (attackTick <= 40) {
            if (attackTick == 40 || attackTick == 30 || attackTick == 20 || attackTick == 10) {
                double d = this.entity.squaredDistanceTo(pEnemy.getX(), pEnemy.getY(), pEnemy.getZ());
                float f = (float) Math.sqrt(d) / 35;
                float g = MathHelper.clamp(f, 0.1f, 1.0f);
                this.shootAt(pEnemy, g);
            }
        } else {
            this.resetAttackCooldown();
            attackTick = 0;
        }
    }

    public void shootAt(LivingEntity target, float pullProgress) {
        MagicOrbProjectileEntity magicOrbProjectileEntity = new MagicOrbProjectileEntity(this.entity, this.entity.getWorld());
        double d = target.getEyeY() - (double)1.1f;
        double e = target.getX() - this.entity.getX();
        double f = d - magicOrbProjectileEntity.getY();
        double g = target.getZ() - this.entity.getZ();
        double h = Math.sqrt(e * e + g * g) * (double)0.2f;
        magicOrbProjectileEntity.setVelocity(e, f + h, g, 1.6f, 6.0f);
        this.entity.playSound(SoundEvents.ITEM_FIRECHARGE_USE, 1.0f, 0.4f / (this.entity.getRandom().nextFloat() * 0.4f + 0.8f));
        this.entity.getWorld().spawnEntity(magicOrbProjectileEntity);
    }

    @Override
    public void tick() {
        super.tick();
        if(shouldCountTillNextAttack) {
            this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
        }
        if (ticksUntilNextAttack == 140) {
            this.entity.setAttacking(false);
        }
        this.checkAndPerformAttack(this.entity.getTarget());
    }

    @Override
    public void stop() {
        entity.setAttacking(false);
        super.stop();
    }
}