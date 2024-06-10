package net.subtotalcamp875.vermidamod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.subtotalcamp875.vermidamod.block.ModBlocks;
import net.subtotalcamp875.vermidamod.block.entity.ModBlockEntities;
import net.subtotalcamp875.vermidamod.enchantment.ModEnchantments;
import net.subtotalcamp875.vermidamod.item.ModItemGroups;
import net.subtotalcamp875.vermidamod.item.ModItems;
import net.subtotalcamp875.vermidamod.screen.ModScreenHandlers;
import net.subtotalcamp875.vermidamod.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VermidaModFabric implements ModInitializer {
	public static final String MOD_ID = "vermida_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();
		ModEnchantments.registerModEnchantments();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}