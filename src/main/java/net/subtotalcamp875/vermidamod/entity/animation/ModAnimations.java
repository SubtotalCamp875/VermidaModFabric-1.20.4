package net.subtotalcamp875.vermidamod.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {
        public static final Animation IDLE = Animation.Builder.create(4f).looping()
                .addBoneAnimation("head",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(4f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("head",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 5f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(3f, AnimationHelper.createRotationalVector(0f, -5f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(4f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("head",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(3f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(4f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(3f, AnimationHelper.createRotationalVector(-5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(4f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_leg",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_leg",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_leg",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR))).build();
        public static final Animation MELEE_LAUNCH_ATTACK = Animation.Builder.create(1.5f).looping()
                .addBoneAnimation("head",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createTranslationalVector(0f, -3f, -8f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createTranslationalVector(0f, -1f, 4f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("head",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(77.5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createRotationalVector(-15f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("head",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("body",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createTranslationalVector(0f, -3f, -9f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createTranslationalVector(0f, -1f, 4f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("body",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(42.5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createRotationalVector(-17.5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("body",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createTranslationalVector(0f, -5f, -6f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createTranslationalVector(0f, -1f, 3f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(-12.5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createRotationalVector(-132.5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createTranslationalVector(0f, -5f, -6f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createTranslationalVector(0f, -1f, 3f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(-12.5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createRotationalVector(-132.5f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5834334f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR))).build();
        public static final Animation MAGIC_SUMMONING = Animation.Builder.create(4f).looping()
                .addBoneAnimation("head",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f,0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(4f,AnimationHelper.createTranslationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR)))
                .

        addBoneAnimation("head",
                                 new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(0.5f,AnimationHelper.createRotationalVector(-25f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2f,AnimationHelper.createRotationalVector(-65f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(3f,AnimationHelper.createRotationalVector(-65f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(4f,AnimationHelper.createRotationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR)))
                .

        addBoneAnimation("head",
                                 new Transformation(Transformation.Targets.SCALE,
            new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f,1f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(4f,AnimationHelper.createScalingVector(1f, 1f,1f),

        Transformation.Interpolations.LINEAR)))
                .

        addBoneAnimation("left_arm",
                                 new Transformation(Transformation.Targets.TRANSLATE,
            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(4f,AnimationHelper.createTranslationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR)))
                .

        addBoneAnimation("left_arm",
                                 new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(0.5f,AnimationHelper.createRotationalVector(-172.5f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(0.75f,AnimationHelper.createRotationalVector(-187.5f, 0f,7.5f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(1f,AnimationHelper.createRotationalVector(-177.5f, 0f,17.5f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(1.25f,AnimationHelper.createRotationalVector(-187.5f, 0f,7.5f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(1.5f,AnimationHelper.createRotationalVector(-172.5f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(1.75f,AnimationHelper.createRotationalVector(-177.5f, 0f,17.5f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2f,AnimationHelper.createRotationalVector(-172.5f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2.25f,AnimationHelper.createRotationalVector(-187.5f, 0f,7.5f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2.5f,AnimationHelper.createRotationalVector(-177.5f, 0f,17.5f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2.75f,AnimationHelper.createRotationalVector(-187.5f, 0f,7.5f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(3f,AnimationHelper.createRotationalVector(-172.5f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(3.25f,AnimationHelper.createRotationalVector(-177.5f, 0f,17.5f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(4f,AnimationHelper.createRotationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR)))
                .

        addBoneAnimation("left_arm",
                                 new Transformation(Transformation.Targets.SCALE,
            new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f,1f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(4f,AnimationHelper.createScalingVector(1f, 1f,1f),

        Transformation.Interpolations.LINEAR)))
                .

        addBoneAnimation("right_arm",
                                 new Transformation(Transformation.Targets.TRANSLATE,
            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(4f,AnimationHelper.createTranslationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR)))
                .

        addBoneAnimation("right_arm",
                                 new Transformation(Transformation.Targets.ROTATE,
            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(0.5f,AnimationHelper.createRotationalVector(-170f, 0f,-15f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(0.75f,AnimationHelper.createRotationalVector(-170f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(1f,AnimationHelper.createRotationalVector(-187.5f, 0f,-20f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(1.25f,AnimationHelper.createRotationalVector(-170f, 0f,-15f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(1.5f,AnimationHelper.createRotationalVector(-170f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(1.75f,AnimationHelper.createRotationalVector(-187.5f, 0f,-20f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2f,AnimationHelper.createRotationalVector(-170f, 0f,-15f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2.25f,AnimationHelper.createRotationalVector(-170f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2.5f,AnimationHelper.createRotationalVector(-187.5f, 0f,-20f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(2.75f,AnimationHelper.createRotationalVector(-170f, 0f,-15f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(3f,AnimationHelper.createRotationalVector(-170f, 0f,0f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(3.25f,AnimationHelper.createRotationalVector(-187.5f, 0f,-20f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(4f,AnimationHelper.createRotationalVector(0f, 0f,0f),

        Transformation.Interpolations.LINEAR)))
                .

        addBoneAnimation("right_arm",
                                 new Transformation(Transformation.Targets.SCALE,
            new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f,1f),

        Transformation.Interpolations.LINEAR),
                new

        Keyframe(4f,AnimationHelper.createScalingVector(1f, 1f,1f),

        Transformation.Interpolations.LINEAR))).

        build();

        public static final Animation WALKING = Animation.Builder.create(2.3433335f).looping()
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.6766667f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_arm",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.6766667f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_arm",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_leg",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_leg",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.6766667f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("left_leg",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_leg",
                        new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_leg",
                        new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.3433333f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6766666f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3433333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(1.6766667f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createRotationalVector(20f, 0f, 0f),
                                        Transformation.Interpolations.LINEAR)))
                .addBoneAnimation("right_leg",
                        new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR),
                                new Keyframe(2.3433335f, AnimationHelper.createScalingVector(1f, 1f, 1f),
                                        Transformation.Interpolations.LINEAR))).build();
    }