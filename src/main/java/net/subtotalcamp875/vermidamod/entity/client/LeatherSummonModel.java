package net.subtotalcamp875.vermidamod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.subtotalcamp875.vermidamod.entity.animation.ModAnimations;
import net.subtotalcamp875.vermidamod.entity.custom.LeatherSummonEntity;

// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class LeatherSummonModel<T extends LeatherSummonEntity> extends SinglePartEntityModel<T> {
	private final ModelPart leather_summon;
	private final ModelPart head;
	public LeatherSummonModel(ModelPart root) {
		this.leather_summon = root.getChild("leather_summon");
        this.head = leather_summon.getChild("head");
    }

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData leather_summon = modelPartData.addChild("leather_summon", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = leather_summon.addChild("head", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData body = leather_summon.addChild("body", ModelPartBuilder.create().uv(28, 28).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData left_arm = leather_summon.addChild("left_arm", ModelPartBuilder.create().uv(32, 0).mirrored().cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

		ModelPartData right_leg = leather_summon.addChild("right_leg", ModelPartBuilder.create().uv(0, 32).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, -12.0F, 0.0F));

		ModelPartData left_leg = leather_summon.addChild("left_leg", ModelPartBuilder.create().uv(0, 32).mirrored().cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(1.9F, -12.0F, 0.0F));

		ModelPartData right_arm = leather_summon.addChild("right_arm", ModelPartBuilder.create().uv(32, 0).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}


	@Override
	public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(entity.getHeadYaw(), headPitch);

		this.animateMovement(ModAnimations.WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.MELEE_LAUNCH_ATTACK, ageInTicks, 1f);

	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}


	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		leather_summon.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return leather_summon;
	}
}