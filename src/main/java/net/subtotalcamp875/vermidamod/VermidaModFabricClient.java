package net.subtotalcamp875.vermidamod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.subtotalcamp875.vermidamod.entity.ModEntities;
import net.subtotalcamp875.vermidamod.entity.client.*;
import net.subtotalcamp875.vermidamod.screen.BloodCondensingScreen;
import net.subtotalcamp875.vermidamod.screen.ModScreenHandlers;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class VermidaModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.BLOOD_CONDENSING_SCREEN_HANDLER, BloodCondensingScreen::new);

        EntityRendererRegistry.register(ModEntities.MAGIC_ORB, FlyingItemEntityRenderer::new);

        EntityRendererRegistry.register(ModEntities.LEATHER_SUMMON, LeatherSummonRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.LEATHER_SUMMON, LeatherSummonModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.BRONZE_SHAMAN, BronzeShamanRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BRONZE_SHAMAN, BronzeShamanModel::getTexturedModelData);
    }
}