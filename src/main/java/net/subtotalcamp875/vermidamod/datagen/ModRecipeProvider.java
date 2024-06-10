package net.subtotalcamp875.vermidamod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.item.ModItems;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUMMONING_CRYSTAL, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SUMMONING_ESSENCE)
                .criterion(hasItem(ModItems.SUMMONING_ESSENCE), conditionsFromItem(ModItems.SUMMONING_ESSENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SUMMONING_CRYSTAL)));
    }
}
