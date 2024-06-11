package net.subtotalcamp875.vermidamod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;
import net.subtotalcamp875.vermidamod.VermidaModFabricClient;
import net.subtotalcamp875.vermidamod.entity.custom.LeatherSummonEntity;

public class LeatherSummonRenderer extends MobEntityRenderer<LeatherSummonEntity, LeatherSummonModel<LeatherSummonEntity>> {
    private static final Identifier TEXTURE = new Identifier(VermidaModFabric.MOD_ID, "textures/entity/leather_summon.png");

    public LeatherSummonRenderer(EntityRendererFactory.Context context) {
        super(context, new LeatherSummonModel<>(context.getPart(ModModelLayers.LEATHER_SUMMON)), 0.5f);
    }

    @Override
    public Identifier getTexture(LeatherSummonEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(LeatherSummonEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1.5f, 1.5f, 1.5f);


        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}