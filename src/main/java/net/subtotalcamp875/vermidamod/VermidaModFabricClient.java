package net.subtotalcamp875.vermidamod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.subtotalcamp875.vermidamod.screen.BloodCondensingScreen;
import net.subtotalcamp875.vermidamod.screen.ModScreenHandlers;

public class VermidaModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.BLOOD_CONDENSING_SCREEN_HANDLER, BloodCondensingScreen::new);
    }
}