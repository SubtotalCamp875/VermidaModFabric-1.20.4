package net.subtotalcamp875.vermidamod.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;

public class ModModelLayers {
    public static final EntityModelLayer LEATHER_SUMMON =
            new EntityModelLayer(new Identifier(VermidaModFabric.MOD_ID, "leather_summon"), "main");

    public static final EntityModelLayer BRONZE_SHAMAN =
            new EntityModelLayer(new Identifier(VermidaModFabric.MOD_ID, "bronze_shaman"), "main");
}