package net.subtotalcamp875.vermidamod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.subtotalcamp875.vermidamod.block.ModBlocks;
import net.subtotalcamp875.vermidamod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUMMONING_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SEAL_BREAKER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_REFINER_BLOCK);
        blockStateModelGenerator.registerSimpleState(ModBlocks.BLOOD_CONDENSING_STATION_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.SUMMONING_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUMMONING_ESSENCE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BRONZE_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COMPACT_BRONZE_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_BRONZE_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REINFORCED_COMPACT_BRONZE_CORE, Models.GENERATED);

        itemModelGenerator.register(ModItems.SHAMAN_BLOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLIGHTLY_CONDENSED_SHAMAN_BLOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHTLY_CONDENSED_SHAMAN_BLOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONDENSED_SHAMAN_BLOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.VERY_CONDENSED_SHAMAN_BLOOD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXTREMELY_CONDENSED_SHAMAN_BLOOD, Models.GENERATED);

        itemModelGenerator.register(ModItems.ECHOS_OF_SUMMONS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_SHAMAN_CAMP_AMBIENCE_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLASS_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCROLL, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGIC_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGIC_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGIC_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MAGIC_BOOTS));
    }
}