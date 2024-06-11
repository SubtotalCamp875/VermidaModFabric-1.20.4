package net.subtotalcamp875.vermidamod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;
import net.subtotalcamp875.vermidamod.entity.custom.BronzeShamanEntity;
import net.subtotalcamp875.vermidamod.entity.custom.LeatherSummonEntity;

public class BronzeShamanRenderer extends MobEntityRenderer<BronzeShamanEntity, BronzeShamanModel<BronzeShamanEntity>> {
    private static final Identifier TEXTURE = new Identifier(VermidaModFabric.MOD_ID, "textures/entity/bronze_shaman.png");

    public BronzeShamanRenderer(EntityRendererFactory.Context context) {
        super(context, new BronzeShamanModel<>(context.getPart(ModModelLayers.BRONZE_SHAMAN)), 0.5f);
    }

    @Override
    public Identifier getTexture(BronzeShamanEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(BronzeShamanEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f, 1f, 1f);


        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}