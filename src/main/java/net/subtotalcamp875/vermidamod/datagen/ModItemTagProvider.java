package net.subtotalcamp875.vermidamod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.subtotalcamp875.vermidamod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MAGIC_HELMET, ModItems.MAGIC_CHESTPLATE, ModItems.MAGIC_LEGGINGS, ModItems.MAGIC_BOOTS);


        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.ECHOS_OF_SUMMONS_MUSIC_DISC)
                .add(ModItems.BRONZE_SHAMAN_CAMP_AMBIENCE_MUSIC_DISC);
    }
}