package net.subtotalcamp875.vermidamod.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;

public class ModScreenHandlers {
    public static final ScreenHandlerType<BloodCondensingScreenHandler> BLOOD_CONDENSING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(VermidaModFabric.MOD_ID, "blood_condensing"),
                    new ExtendedScreenHandlerType<>(BloodCondensingScreenHandler::new));

    public static void registerScreenHandlers() {
        VermidaModFabric.LOGGER.info("Registering Screen Handlers for " + VermidaModFabric.MOD_ID);
    }
}