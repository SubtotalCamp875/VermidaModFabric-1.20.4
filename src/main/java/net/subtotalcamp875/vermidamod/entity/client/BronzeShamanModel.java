import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
/**
// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class modded_entity extends EntityModel<Entity> {
	private final ModelPart bronze_shaman_entity;
	private final ModelPart head;
	private final ModelPart hat;
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart bronze_staff;
	private final ModelPart staff_arch;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart healing;
	private final ModelPart circle;
	private final ModelPart circle_1;
	private final ModelPart circle_2;
	private final ModelPart circle_3;
	private final ModelPart circle_4;
	private final ModelPart circle_5;
	private final ModelPart circle_6;
	private final ModelPart circle_7;
	private final ModelPart circle_8;
	private final ModelPart healing_particles;
	private final ModelPart particle_1;
	private final ModelPart particle_2;
	private final ModelPart particle_3;
	private final ModelPart particle_4;
	private final ModelPart particle_5;
	private final ModelPart particle_6;
	private final ModelPart attacking;
	private final ModelPart attacking_particles;
	private final ModelPart particle_7;
	private final ModelPart particle_8;
	private final ModelPart particle_9;
	private final ModelPart particle_10;
	private final ModelPart particle_11;
	private final ModelPart particle_12;
	public modded_entity(ModelPart root) {
		this.bronze_shaman_entity = root.getChild("bronze_shaman_entity");
		this.head = root.getChild("head");
		this.hat = root.getChild("hat");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.bronze_staff = root.getChild("bronze_staff");
		this.staff_arch = root.getChild("staff_arch");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.healing = root.getChild("healing");
		this.circle = root.getChild("circle");
		this.circle_1 = root.getChild("circle_1");
		this.circle_2 = root.getChild("circle_2");
		this.circle_3 = root.getChild("circle_3");
		this.circle_4 = root.getChild("circle_4");
		this.circle_5 = root.getChild("circle_5");
		this.circle_6 = root.getChild("circle_6");
		this.circle_7 = root.getChild("circle_7");
		this.circle_8 = root.getChild("circle_8");
		this.healing_particles = root.getChild("healing_particles");
		this.particle_1 = root.getChild("particle_1");
		this.particle_2 = root.getChild("particle_2");
		this.particle_3 = root.getChild("particle_3");
		this.particle_4 = root.getChild("particle_4");
		this.particle_5 = root.getChild("particle_5");
		this.particle_6 = root.getChild("particle_6");
		this.attacking = root.getChild("attacking");
		this.attacking_particles = root.getChild("attacking_particles");
		this.particle_7 = root.getChild("particle_7");
		this.particle_8 = root.getChild("particle_8");
		this.particle_9 = root.getChild("particle_9");
		this.particle_10 = root.getChild("particle_10");
		this.particle_11 = root.getChild("particle_11");
		this.particle_12 = root.getChild("particle_12");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bronze_shaman_entity = modelPartData.addChild("bronze_shaman_entity", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = bronze_shaman_entity.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData hat = head.addChild("hat", ModelPartBuilder.create().uv(24, 42).cuboid(-5.0F, -10.0F, -5.0F, 10.0F, 2.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData base4_r1 = hat.addChild("base4_r1", ModelPartBuilder.create().uv(18, 45).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -16.0F, 3.0F, -0.1745F, 0.0F, 0.1745F));

		ModelPartData base3_r1 = hat.addChild("base3_r1", ModelPartBuilder.create().uv(18, 44).cuboid(-3.0F, -3.0F, -1.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -13.0F, 0.0F, -0.1309F, 0.0F, 0.0873F));

		ModelPartData base2_r1 = hat.addChild("base2_r1", ModelPartBuilder.create().uv(34, 31).cuboid(-7.0F, -4.0F, -1.0F, 8.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -9.0F, -2.0F, -0.0873F, 0.0F, 0.0436F));

		ModelPartData body = bronze_shaman_entity.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -24.0F, 0.0F));

		ModelPartData left_arm = bronze_shaman_entity.addChild("left_arm", ModelPartBuilder.create().uv(24, 16).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -22.0F, 0.0F));

		ModelPartData right_arm = bronze_shaman_entity.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, -22.0F, 0.0F));

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

		ModelPartData left_leg = bronze_shaman_entity.addChild("left_leg", ModelPartBuilder.create().uv(32, 0).mirrored().cuboid(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(1.9F, -12.0F, 0.0F));

		ModelPartData right_leg = bronze_shaman_entity.addChild("right_leg", ModelPartBuilder.create().uv(32, 0).cuboid(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.9F, -12.0F, 0.0F));

		ModelPartData healing = bronze_shaman_entity.addChild("healing", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -19.0F, 0.0F));

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

		ModelPartData attacking = bronze_shaman_entity.addChild("attacking", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -17.0F, 0.0F));

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
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		bronze_shaman_entity.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
 **/