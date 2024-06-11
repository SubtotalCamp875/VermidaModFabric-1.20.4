package net.subtotalcamp875.vermidamod.entity.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.subtotalcamp875.vermidamod.entity.ai.BronzeShamanAttackSpellGoal;
import net.subtotalcamp875.vermidamod.entity.ai.BronzeShamanHealSpellGoal;
import net.subtotalcamp875.vermidamod.entity.ai.LeatherSummonAttackGoal;
import net.subtotalcamp875.vermidamod.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class BronzeShamanEntity extends HostileEntity implements RangedAttackMob {
    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(BronzeShamanEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    private static final TrackedData<Boolean> HEALING =
            DataTracker.registerData(BronzeShamanEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;

    public final AnimationState healAnimationState = new AnimationState();
    public int healAnimationTimeout = 0;

    public BronzeShamanEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.dropXp();
    }

    @Override
    public int getXpToDrop() {
        return 10;
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }

        if(this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 80;
            attackAnimationState.start(this.age);
            this.setPose(EntityPose.SHOOTING);
            this.idleAnimationState.stop();
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
        } else {
            --this.attackAnimationTimeout;
        }

        if(!this.isAttacking()) {
            attackAnimationState.stop();
            this.setPose(EntityPose.STANDING);
        }

        if(this.isHealing() && healAnimationTimeout <= 0) {
            healAnimationTimeout = 80;
            healAnimationState.start(this.age);
            this.setPose(EntityPose.SHOOTING);
            this.idleAnimationState.stop();
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
        } else {
            --this.healAnimationTimeout;
        }

        if(!this.isHealing()) {
            healAnimationState.stop();
            this.setPose(EntityPose.STANDING);
        }
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();
        if(this.getWorld().isClient()) {
            setupAnimationStates();
        }
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new FleeEntityGoal<PlayerEntity>(this, PlayerEntity.class, 2.0f, 0.6, 1.0));

        this.goalSelector.add(2, new BronzeShamanHealSpellGoal(this, 1.0, 80, 25));
        this.goalSelector.add(3, new BronzeShamanAttackSpellGoal(this, 1.0, 80, 35));
        this.goalSelector.add(4, new WanderAroundGoal(this, 1.0, 32));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 32.0F));

        this.targetSelector.add(1, new RevengeGoal(this));
        this.targetSelector.add(2, new ActiveTargetGoal<PlayerEntity>((MobEntity)this, PlayerEntity.class, true));

    }

    public static DefaultAttributeContainer.Builder createBronzeShamanAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 40.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 0.0)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 0.0)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.1)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 0.5)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 15.0F);
    }

    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING, attacking);
    }

    public void setHealing(boolean healing) {
        this.dataTracker.set(HEALING, healing);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    public boolean isHealing() {
        return this.dataTracker.get(HEALING);
    }


    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false);
        this.dataTracker.startTracking(HEALING, false);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SNOW_GOLEM_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ITEM_DYE_USE;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLOCK_LAVA_EXTINGUISH;
    }

    @Override
    public void shootAt(LivingEntity target, float pullProgress) {
    }
}