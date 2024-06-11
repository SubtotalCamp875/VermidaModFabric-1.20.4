package net.subtotalcamp875.vermidamod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.subtotalcamp875.vermidamod.entity.animation.ModAnimations;
import net.subtotalcamp875.vermidamod.entity.custom.BronzeShamanEntity;
import net.subtotalcamp875.vermidamod.entity.custom.LeatherSummonEntity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class BronzeShamanModel<T extends BronzeShamanEntity> extends SinglePartEntityModel<T> {
	private final ModelPart bronze_shaman;
	private final ModelPart head;

	public BronzeShamanModel(ModelPart root) {
		this.bronze_shaman = root.getChild("bronze_shaman");
		this.head = bronze_shaman.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bronze_shaman = modelPartData.addChild("bronze_shaman", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = bronze_shaman.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData hat = head.addChild("hat", ModelPartBuilder.create().uv(24, 42).cuboid(-5.0F, -10.0F, -5.0F, 10.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData base4_r1 = hat.addChild("base4_r1", ModelPartBuilder.create().uv(18, 45).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -16.0F, 3.0F, -0.1745F, 0.0F, 0.1745F));

		ModelPartData base3_r1 = hat.addChild("base3_r1", ModelPartBuilder.create().uv(18, 44).cuboid(-3.0F, -3.0F, -1.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -13.0F, 0.0F, -0.1309F, 0.0F, 0.0873F));

		ModelPartData base2_r1 = hat.addChild("base2_r1", ModelPartBuilder.create().uv(34, 31).cuboid(-7.0F, -4.0F, -1.0F, 8.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -9.0F, -2.0F, -0.0873F, 0.0F, 0.0436F));

		ModelPartData body = bronze_shaman.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData left_arm = bronze_shaman.addChild("left_arm", ModelPartBuilder.create().uv(24, 16).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

		ModelPartData right_arm = bronze_shaman.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

		ModelPartData right_arm_r1 = right_arm.addChild("right_arm_r1", ModelPartBuilder.create().uv(24, 16).mirrored().cuboid(-8.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(5.0F, 11.0F, -19.0F, -1.0472F, 0.0F, 0.0F));

		ModelPartData bronze_staff = right_arm.addChild("bronze_staff", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, 4.0F, -7.0F));

		ModelPartData staffbase_r1 = bronze_staff.addChild("staffbase_r1", ModelPartBuilder.create().uv(0, 42).cuboid(-1.0F, -16.0F, -1.0F, 2.0F, 20.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 8.0F, 3.0F, 0.2618F, 0.0F, 0.0F));

		ModelPartData orb_r1 = bronze_staff.addChild("orb_r1", ModelPartBuilder.create().uv(0, 37).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0F, -2.0F, 0.2618F, 0.0F, 0.0F));

		ModelPartData staff_arch = bronze_staff.addChild("staff_arch", ModelPartBuilder.create().uv(9, 43).cuboid(-7.0F, -31.0F, -6.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, 18.0F, 7.0F));

		ModelPartData arch6_r1 = staff_arch.addChild("arch6_r1", ModelPartBuilder.create().uv(18, 52).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -34.0F, -9.0F, 1.4399F, 0.0F, 0.0F));

		ModelPartData arch5_r1 = staff_arch.addChild("arch5_r1", ModelPartBuilder.create().uv(18, 58).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -32.0F, -6.0F, 0.9163F, 0.0F, 0.0F));

		ModelPartData arch4_r1 = staff_arch.addChild("arch4_r1", ModelPartBuilder.create().uv(9, 36).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -30.0F, -5.0F, 0.48F, 0.0F, 0.0F));

		ModelPartData arch2_r1 = staff_arch.addChild("arch2_r1", ModelPartBuilder.create().uv(9, 50).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -26.0F, -6.0F, -0.4363F, 0.0F, 0.0F));

		ModelPartData arch1_r1 = staff_arch.addChild("arch1_r1", ModelPartBuilder.create().uv(9, 57).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -24.0F, -10.0F, -1.1345F, 0.0F, 0.0F));

		ModelPartData left_leg = bronze_shaman.addChild("left_leg", ModelPartBuilder.create().uv(32, 0).mirrored().cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(1.9F, -12.0F, 0.0F));

		ModelPartData right_leg = bronze_shaman.addChild("right_leg", ModelPartBuilder.create().uv(32, 0).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, -12.0F, 0.0F));

		ModelPartData healing = bronze_shaman.addChild("healing", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -19.0F, 0.0F));

		ModelPartData circle = healing.addChild("circle", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle_1 = circle.addChild("circle_1", ModelPartBuilder.create().uv(48, 0).cuboid(-3.0F, -2.0F, 7.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle_2 = circle.addChild("circle_2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle2_r1 = circle_2.addChild("circle2_r1", ModelPartBuilder.create().uv(50, 0).cuboid(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 5.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData circle_3 = circle.addChild("circle_3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle3_r1 = circle_3.addChild("circle3_r1", ModelPartBuilder.create().uv(48, 0).cuboid(-4.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData circle_4 = circle.addChild("circle_4", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle4_r1 = circle_4.addChild("circle4_r1", ModelPartBuilder.create().uv(50, 0).cuboid(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, -5.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData circle_5 = circle.addChild("circle_5", ModelPartBuilder.create().uv(48, 0).cuboid(-3.0F, -2.0F, -9.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle_6 = circle.addChild("circle_6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle6_r1 = circle_6.addChild("circle6_r1", ModelPartBuilder.create().uv(50, 0).cuboid(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, -7.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData circle_7 = circle.addChild("circle_7", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle7_r1 = circle_7.addChild("circle7_r1", ModelPartBuilder.create().uv(48, 0).cuboid(-4.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-8.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData circle_8 = circle.addChild("circle_8", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData circle8_r1 = circle_8.addChild("circle8_r1", ModelPartBuilder.create().uv(50, 0).cuboid(-4.0F, -2.0F, -1.0F, 5.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 0.0F, 7.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData healing_particles = healing.addChild("healing_particles", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_1 = healing_particles.addChild("particle_1", ModelPartBuilder.create().uv(58, 1).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_2 = healing_particles.addChild("particle_2", ModelPartBuilder.create().uv(58, 1).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_3 = healing_particles.addChild("particle_3", ModelPartBuilder.create().uv(58, 1).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_4 = healing_particles.addChild("particle_4", ModelPartBuilder.create().uv(58, 1).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_5 = healing_particles.addChild("particle_5", ModelPartBuilder.create().uv(58, 1).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_6 = healing_particles.addChild("particle_6", ModelPartBuilder.create().uv(58, 1).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData attacking = bronze_shaman.addChild("attacking", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -17.0F, 0.0F));

		ModelPartData attacking_particles = attacking.addChild("attacking_particles", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_7 = attacking_particles.addChild("particle_7", ModelPartBuilder.create().uv(60, 6).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_8 = attacking_particles.addChild("particle_8", ModelPartBuilder.create().uv(60, 6).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_9 = attacking_particles.addChild("particle_9", ModelPartBuilder.create().uv(60, 6).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_10 = attacking_particles.addChild("particle_10", ModelPartBuilder.create().uv(60, 6).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_11 = attacking_particles.addChild("particle_11", ModelPartBuilder.create().uv(60, 6).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData particle_12 = attacking_particles.addChild("particle_12", ModelPartBuilder.create().uv(60, 6).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(entity.getHeadYaw(), headPitch);

		this.animateMovement(ModAnimations.BRONZE_SHAMAN_WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.BRONZE_SHAMAN_IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.BRONZE_SHAMAN_ATTACKING, ageInTicks, 1f);
		this.updateAnimation(entity.healAnimationState, ModAnimations.BRONZE_SHAMAN_HEALING, ageInTicks, 1f);

	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bronze_shaman.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return bronze_shaman;
	}
}