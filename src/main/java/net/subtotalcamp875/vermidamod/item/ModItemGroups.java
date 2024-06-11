package net.subtotalcamp875.vermidamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;
import net.subtotalcamp875.vermidamod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SAPPHIRE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VermidaModFabric.MOD_ID, "sapphire"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sapphire"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModItems.SUMMONING_ESSENCE);
                        entries.add(ModItems.SUMMONING_CRYSTAL);

                        entries.add(ModItems.BRONZE_KEY);
                        entries.add(ModItems.BRONZE_CORE);
                        entries.add(ModItems.COMPACT_BRONZE_CORE);
                        entries.add(ModItems.REINFORCED_BRONZE_CORE);
                        entries.add(ModItems.REINFORCED_COMPACT_BRONZE_CORE);

                        entries.add(ModItems.SHAMAN_BLOOD);
                        entries.add(ModItems.SLIGHTLY_CONDENSED_SHAMAN_BLOOD);
                        entries.add(ModItems.LIGHTLY_CONDENSED_SHAMAN_BLOOD);
                        entries.add(ModItems.CONDENSED_SHAMAN_BLOOD);
                        entries.add(ModItems.VERY_CONDENSED_SHAMAN_BLOOD);
                        entries.add(ModItems.EXTREMELY_CONDENSED_SHAMAN_BLOOD);

                        entries.add(ModItems.MAGIC_HELMET);
                        entries.add(ModItems.MAGIC_CHESTPLATE);
                        entries.add(ModItems.MAGIC_LEGGINGS);
                        entries.add(ModItems.MAGIC_BOOTS);
                        entries.add(ModItems.MAGIC_ORB);

                        entries.add(ModItems.ECHOS_OF_SUMMONS_MUSIC_DISC);
                        entries.add(ModItems.BRONZE_SHAMAN_CAMP_AMBIENCE_MUSIC_DISC);

                        entries.add(ModItems.GLASS_DUST);
                        entries.add(ModItems.SCROLL);

                        entries.add(ModBlocks.SUMMONING_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.BRONZE_REFINER_BLOCK);
                        entries.add(ModBlocks.SEAL_BREAKER_BLOCK);
                        entries.add(ModBlocks.BLOOD_CONDENSING_STATION_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        VermidaModFabric.LOGGER.info("Registering Item Groups for " + VermidaModFabric.MOD_ID);
    }
}