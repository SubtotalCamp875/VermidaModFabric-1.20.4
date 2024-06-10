package net.subtotalcamp875.vermidamod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;
import net.subtotalcamp875.vermidamod.block.ModBlocks;
import net.subtotalcamp875.vermidamod.block.custom.BloodCondensingStationBlock;

public class ModBlockEntities {
    public static final BlockEntityType<BloodCondensingStationBlockEntity> BLOOD_CONDENSING_STATION_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(VermidaModFabric.MOD_ID, "blood_condensing_be"),
                    FabricBlockEntityTypeBuilder.create(BloodCondensingStationBlockEntity::new,
                            ModBlocks.BLOOD_CONDENSING_STATION_BLOCK).build());

    public static void registerBlockEntities() {
        VermidaModFabric.LOGGER.info("Registering Block Entities for " + VermidaModFabric.MOD_ID);
    }
}