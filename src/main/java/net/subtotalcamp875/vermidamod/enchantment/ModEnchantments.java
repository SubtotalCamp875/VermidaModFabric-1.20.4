package net.subtotalcamp875.vermidamod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;

public class ModEnchantments {
    private static final EquipmentSlot[] ALL_ARMOR = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

    public static Enchantment MAGIC_RESISTANCE = register("magic_resistance",
            new MagicResistanceEnchantment(Enchantment.Rarity.UNCOMMON,
                    MagicResistanceEnchantment.Type.MAGIC, ALL_ARMOR));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(VermidaModFabric.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + VermidaModFabric.MOD_ID);
    }
}