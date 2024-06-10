package net.subtotalcamp875.vermidamod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.block.ModBlocks;
import net.subtotalcamp875.vermidamod.item.ModItems;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SUMMONING_ESSENCE, RecipeCategory.MISC,
                ModItems.SUMMONING_CRYSTAL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SUMMONING_CRYSTAL_BLOCK, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SUMMONING_CRYSTAL)
                .criterion(hasItem(ModItems.SUMMONING_CRYSTAL), conditionsFromItem(ModItems.SUMMONING_CRYSTAL))
                .offerTo(exporter, new Identifier("summoning_crystal_block_from_summoning_crystal"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUMMONING_CRYSTAL, 2)
                .pattern("GEG")
                .pattern("EBE")
                .pattern("GEG")
                .input('E', ModItems.SUMMONING_ESSENCE)
                .input('B', ModItems.CONDENSED_SHAMAN_BLOOD)
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ModItems.SUMMONING_CRYSTAL), conditionsFromItem(ModItems.SUMMONING_CRYSTAL))
                .offerTo(exporter, new Identifier("summoning_crystal_from_essence_and_blood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUMMONING_CRYSTAL, 8)
                .pattern(" G ")
                .pattern("GBG")
                .pattern(" G ")
                .input('B', ModItems.EXTREMELY_CONDENSED_SHAMAN_BLOOD)
                .input('G', Blocks.GLASS)
                .criterion(hasItem(ModItems.SUMMONING_CRYSTAL), conditionsFromItem(ModItems.SUMMONING_CRYSTAL))
                .offerTo(exporter, new Identifier("summoning_crystal_from_glass_and_blood"));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GLASS_DUST, 1)
                .pattern(" BB")
                .pattern(" BB")
                .input('B', Items.GLASS_BOTTLE)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GLASS_DUST)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GLASS, 1)
                .pattern(" BB")
                .pattern(" BB")
                .input('B', ModItems.GLASS_DUST)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.GLASS)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIC_HELMET, 1)
                .pattern("CCC")
                .pattern("C C")
                .input('C', ModItems.SUMMONING_CRYSTAL)
                .criterion(hasItem(ModItems.SUMMONING_CRYSTAL), conditionsFromItem(ModItems.SUMMONING_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIC_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIC_CHESTPLATE, 1)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', ModItems.SUMMONING_CRYSTAL)
                .criterion(hasItem(ModItems.SUMMONING_CRYSTAL), conditionsFromItem(ModItems.SUMMONING_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIC_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIC_LEGGINGS, 1)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.SUMMONING_CRYSTAL)
                .criterion(hasItem(ModItems.SUMMONING_CRYSTAL), conditionsFromItem(ModItems.SUMMONING_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIC_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGIC_BOOTS, 1)
                .pattern("C C")
                .pattern("C C")
                .input('C', ModItems.SUMMONING_CRYSTAL)
                .criterion(hasItem(ModItems.SUMMONING_CRYSTAL), conditionsFromItem(ModItems.SUMMONING_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MAGIC_BOOTS)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BRONZE_REFINER_BLOCK, 1)
                .pattern("CCC")
                .pattern("CBC")
                .pattern("CCC")
                .input('C', Blocks.COPPER_BLOCK)
                .input('B', ModItems.COMPACT_BRONZE_CORE)
                .criterion(hasItem(ModItems.BRONZE_CORE), conditionsFromItem(ModItems.BRONZE_CORE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BRONZE_REFINER_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_CORE, 1)
                .pattern(" C ")
                .pattern("CBC")
                .pattern(" C ")
                .input('C', Blocks.COPPER_BLOCK)
                .input('B', ModItems.EXTREMELY_CONDENSED_SHAMAN_BLOOD)
                .criterion(hasItem(ModItems.SHAMAN_BLOOD), conditionsFromItem(ModItems.SHAMAN_BLOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BRONZE_CORE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COMPACT_BRONZE_CORE)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.BRONZE_CORE)
                .criterion(hasItem(ModItems.BRONZE_CORE), conditionsFromItem(ModItems.BRONZE_CORE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COMPACT_BRONZE_CORE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_BRONZE_CORE)
                .pattern("BBB")
                .pattern("BCB")
                .pattern("BBB")
                .input('C', ModItems.BRONZE_CORE)
                .input('B', ModBlocks.SUMMONING_CRYSTAL_BLOCK)
                .criterion(hasItem(ModItems.BRONZE_CORE), conditionsFromItem(ModItems.BRONZE_CORE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.REINFORCED_BRONZE_CORE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_COMPACT_BRONZE_CORE)
                .pattern("BBB")
                .pattern("BCB")
                .pattern("BBB")
                .input('C', ModItems.COMPACT_BRONZE_CORE)
                .input('B', ModBlocks.SUMMONING_CRYSTAL_BLOCK)
                .criterion(hasItem(ModItems.BRONZE_CORE), conditionsFromItem(ModItems.BRONZE_CORE))
                .offerTo(exporter, new Identifier("reinforced_compact_bronze_core_from_compact_bronze_core_and_crystal_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REINFORCED_COMPACT_BRONZE_CORE)
                .pattern("CCC")
                .pattern("CRC")
                .pattern("CCC")
                .input('C', ModItems.BRONZE_CORE)
                .input('R', ModItems.REINFORCED_BRONZE_CORE)
                .criterion(hasItem(ModItems.BRONZE_CORE), conditionsFromItem(ModItems.BRONZE_CORE))
                .offerTo(exporter, new Identifier("reinforced_compact_bronze_core_from_bronze_core_and_reinforced_bronze_core"));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SLIGHTLY_CONDENSED_SHAMAN_BLOOD)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.SHAMAN_BLOOD)
                .criterion(hasItem(ModItems.SHAMAN_BLOOD), conditionsFromItem(ModItems.SHAMAN_BLOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SLIGHTLY_CONDENSED_SHAMAN_BLOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHTLY_CONDENSED_SHAMAN_BLOOD)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.SLIGHTLY_CONDENSED_SHAMAN_BLOOD)
                .criterion(hasItem(ModItems.SHAMAN_BLOOD), conditionsFromItem(ModItems.SHAMAN_BLOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHTLY_CONDENSED_SHAMAN_BLOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CONDENSED_SHAMAN_BLOOD)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.LIGHTLY_CONDENSED_SHAMAN_BLOOD)
                .criterion(hasItem(ModItems.SHAMAN_BLOOD), conditionsFromItem(ModItems.SHAMAN_BLOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CONDENSED_SHAMAN_BLOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VERY_CONDENSED_SHAMAN_BLOOD)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.CONDENSED_SHAMAN_BLOOD)
                .criterion(hasItem(ModItems.SHAMAN_BLOOD), conditionsFromItem(ModItems.SHAMAN_BLOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.VERY_CONDENSED_SHAMAN_BLOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EXTREMELY_CONDENSED_SHAMAN_BLOOD)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.VERY_CONDENSED_SHAMAN_BLOOD)
                .criterion(hasItem(ModItems.SHAMAN_BLOOD), conditionsFromItem(ModItems.SHAMAN_BLOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EXTREMELY_CONDENSED_SHAMAN_BLOOD)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOOD_CONDENSING_STATION_BLOCK)
                .pattern("CBC")
                .pattern("S#S")
                .input('B', ModItems.COMPACT_BRONZE_CORE)
                .input('C', ModItems.SUMMONING_CRYSTAL)
                .input('#', ModItems.SHAMAN_BLOOD)
                .input('S', Blocks.SMOOTH_STONE)
                .criterion(hasItem(ModItems.SHAMAN_BLOOD), conditionsFromItem(ModItems.SHAMAN_BLOOD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLOOD_CONDENSING_STATION_BLOCK)));
    }
}
