package net.subtotalcamp875.vermidamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.subtotalcamp875.vermidamod.VermidaModFabric;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.item.custom.MetalDetectorItem;
import net.subtotalcamp875.vermidamod.sound.ModSounds;

public class ModItems {
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item SUMMONING_ESSENCE = registerItem("summoning_essence", new Item(new FabricItemSettings()));
    public static final Item SUMMONING_CRYSTAL = registerItem("summoning_crystal", new Item(new FabricItemSettings()));


    public static final Item BRONZE_KEY = registerItem("bronze_key", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BRONZE_CORE = registerItem("bronze_core", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item COMPACT_BRONZE_CORE = registerItem("compact_bronze_core", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item REINFORCED_BRONZE_CORE = registerItem("reinforced_bronze_core", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item REINFORCED_COMPACT_BRONZE_CORE = registerItem("reinforced_compact_bronze_core", new Item(new FabricItemSettings().maxCount(1)));


    public static final Item SHAMAN_BLOOD = registerItem("shaman_blood",
            new Item(new FabricItemSettings().food(ModFoodComponents.SHAMAN_BLOOD).maxCount(16)));
    public static final Item SLIGHTLY_CONDENSED_SHAMAN_BLOOD = registerItem("slightly_condensed_shaman_blood",
            new Item(new FabricItemSettings().food(ModFoodComponents.SLIGHTLY_CONDENSED_SHAMAN_BLOOD).maxCount(16)));
    public static final Item LIGHTLY_CONDENSED_SHAMAN_BLOOD = registerItem("lightly_condensed_shaman_blood",
            new Item(new FabricItemSettings().food(ModFoodComponents.LIGHTLY_CONDENSED_SHAMAN_BLOOD).maxCount(16)));
    public static final Item CONDENSED_SHAMAN_BLOOD = registerItem("condensed_shaman_blood",
            new Item(new FabricItemSettings().food(ModFoodComponents.CONDENSED_SHAMAN_BLOOD).maxCount(16)));
    public static final Item VERY_CONDENSED_SHAMAN_BLOOD = registerItem("very_condensed_shaman_blood",
            new Item(new FabricItemSettings().food(ModFoodComponents.VERY_CONDENSED_SHAMAN_BLOOD).maxCount(16)));
    public static final Item EXTREMELY_CONDENSED_SHAMAN_BLOOD = registerItem("extremely_condensed_shaman_blood",
            new Item(new FabricItemSettings().food(ModFoodComponents.EXTREMELY_CONDENSED_SHAMAN_BLOOD).maxCount(16)));


    public static final Item MAGIC_HELMET = registerItem("magic_helmet",
            new ArmorItem(ModArmorMaterials.SUMMONING_CRYSTAL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item MAGIC_CHESTPLATE = registerItem("magic_chestplate",
            new ArmorItem(ModArmorMaterials.SUMMONING_CRYSTAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item MAGIC_LEGGINGS = registerItem("magic_leggings",
            new ArmorItem(ModArmorMaterials.SUMMONING_CRYSTAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item MAGIC_BOOTS = registerItem("magic_boots",
            new ArmorItem(ModArmorMaterials.SUMMONING_CRYSTAL, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    public static final Item GLASS_DUST = registerItem("glass_dust", new Item(new FabricItemSettings()));
    public static final Item SCROLL = registerItem("scroll", new Item(new FabricItemSettings()));


    public static final Item ECHOS_OF_SUMMONS_MUSIC_DISC  = registerItem("echos_of_summons_music_disc",
            new MusicDiscItem(6, ModSounds.ECHOS_OF_SUMMONS, new FabricItemSettings().maxCount(1), 2120));
    public static final Item BRONZE_SHAMAN_CAMP_AMBIENCE_MUSIC_DISC   = registerItem("bronze_shaman_camp_ambience_music_disc",
            new MusicDiscItem(6, ModSounds.BRONZE_SHAMAN_CAMP_AMBIENCE, new FabricItemSettings().maxCount(1), 3300));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SUMMONING_ESSENCE);
        entries.add(SUMMONING_CRYSTAL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VermidaModFabric.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VermidaModFabric.LOGGER.info("Registering Mod Items for " + VermidaModFabric.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}