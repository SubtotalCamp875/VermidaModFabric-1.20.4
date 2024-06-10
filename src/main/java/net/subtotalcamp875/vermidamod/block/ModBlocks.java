package net.subtotalcamp875.vermidamod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.subtotalcamp875.vermidamod.VermidaModFabric;

public class ModBlocks {
    public static final Block SUMMONING_CRYSTAL_BLOCK = registerBlock("summoning_crystal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.LODESTONE)));
    public static final Block SEAL_BREAKER_BLOCK = registerBlock("seal_breaker_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.CHAIN)));
    public static final Block BRONZE_REFINER_BLOCK = registerBlock("bronze_refiner_block",
            new bronze_reginer_block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.COPPER)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(VermidaModFabric.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(VermidaModFabric.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        VermidaModFabric.LOGGER.info("Registering ModBlocks for " + VermidaModFabric.MOD_ID);
    }
}