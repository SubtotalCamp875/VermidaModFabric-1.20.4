package net.subtotalcamp875.vermidamod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SHAMAN_BLOOD = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(1)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200), 0.25f).build();
    public static final FoodComponent SLIGHTLY_CONDENSED_SHAMAN_BLOOD = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(3)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200), 0.50f).build();
    public static final FoodComponent LIGHTLY_CONDENSED_SHAMAN_BLOOD = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(4)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600), 0.75f).build();
    public static final FoodComponent CONDENSED_SHAMAN_BLOOD = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200), 1.0f).build();
    public static final FoodComponent VERY_CONDENSED_SHAMAN_BLOOD = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 2400), 1.0f).build();
    public static final FoodComponent EXTREMELY_CONDENSED_SHAMAN_BLOOD = new FoodComponent.Builder()
            .alwaysEdible()
            .hunger(16)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 6000), 1.0f).build();

}