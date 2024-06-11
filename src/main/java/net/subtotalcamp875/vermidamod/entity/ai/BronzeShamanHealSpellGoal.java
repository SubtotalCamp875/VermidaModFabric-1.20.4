package net.subtotalcamp875.vermidamod.entity.ai;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.goal.ProjectileAttackGoal;
import net.minecraft.util.math.MathHelper;
import net.subtotalcamp875.vermidamod.entity.custom.BronzeShamanEntity;


public class BronzeShamanHealSpellGoal extends ProjectileAttackGoal {
    private final BronzeShamanEntity entity;
    private int healDelay = 70;

    private int ticksUntilNextHeal = 80;
    private boolean shouldCountTillNextHeal = false;

    public BronzeShamanHealSpellGoal(RangedAttackMob mob, double mobSpeed, int intervalTicks, float maxShootRange) {
        super(mob, mobSpeed, intervalTicks, maxShootRange);
        entity = ((BronzeShamanEntity) mob);
    }

    @Override
    public boolean canStart() {
        if (!super.canStart()) {
            return false;
        } else {
            return this.entity.getHealth() < this.entity.getMaxHealth() / 2;
        }
    }

    @Override
    public void start() {
        super.start();
        healDelay = 70;
        ticksUntilNextHeal = 80;
    }

    protected void checkAndPerformHeal(LivingEntity pEntity) {
        if (isHealthBelowHalf(pEntity)) {
            shouldCountTillNextHeal = true;

            if(isTimeToStartHealAnimation()) {
                entity.setHealing(true);
            }

            if(isTimeToHeal()) {
                performHeal(pEntity);
            }
        } else {
            resetHealCooldown();
            shouldCountTillNextHeal = false;
            entity.setHealing(false);
            entity.healAnimationTimeout = 0;
        }
    }

    private boolean isHealthBelowHalf(LivingEntity pEntity) {
        return this.entity.getHealth() < this.entity.getMaxHealth() / 2;
    }

    protected void resetHealCooldown() {
        this.ticksUntilNextHeal = this.getTickCount(healDelay * 4);
    }

    protected boolean isTimeToStartHealAnimation() {
        return this.ticksUntilNextHeal <= healDelay;
    }

    protected boolean isTimeToHeal() {
        return this.ticksUntilNextHeal <= 0;
    }

    protected void performHeal(LivingEntity pEntity) {
        this.resetHealCooldown();
        this.entity.setHealth(this.entity.getHealth() + 20);
    }

    @Override
    public void tick() {
        super.tick();
        if(shouldCountTillNextHeal) {
            this.ticksUntilNextHeal = Math.max(this.ticksUntilNextHeal - 1, 0);
        }
        this.checkAndPerformHeal(this.entity);
    }

    @Override
    public void stop() {
        entity.setHealing(false);
        super.stop();
    }
}