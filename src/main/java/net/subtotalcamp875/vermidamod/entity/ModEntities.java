package net.subtotalcamp875.vermidamod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;
import net.subtotalcamp875.vermidamod.entity.custom.MagicOrbProjectileEntity;

public class ModEntities {
    public static final EntityType<MagicOrbProjectileEntity> MAGIC_ORB = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(VermidaModFabric.MOD_ID, "magic_orb"),
            FabricEntityTypeBuilder.<MagicOrbProjectileEntity>create(SpawnGroup.MISC, MagicOrbProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

}