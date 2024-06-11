package net.subtotalcamp875.vermidamod.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import net.subtotalcamp875.vermidamod.entity.ModEntities;
import net.subtotalcamp875.vermidamod.item.ModItems;

public class MagicOrbProjectileEntity extends ThrownItemEntity {
    public MagicOrbProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public MagicOrbProjectileEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.MAGIC_ORB, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.MAGIC_ORB;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        if (!this.getWorld().isClient) {
            this.discard();
        }
        super.onBlockHit(blockHitResult);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity) entity;
            if (!(entity instanceof BronzeShamanEntity)) {
                entityHitResult.getEntity().damage(this.getDamageSources().lightningBolt(), 25.0f);
            }
        }

    }
}