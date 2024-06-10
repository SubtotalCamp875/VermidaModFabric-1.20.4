package net.subtotalcamp875.vermidamod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class MagicResistanceEnchantment extends Enchantment {
    public final MagicResistanceEnchantment.Type magicProtectionType;

    public MagicResistanceEnchantment(Enchantment.Rarity weight, Type magicProtectionType, EquipmentSlot ... slotTypes) {
        super(weight, EnchantmentTarget.ARMOR, slotTypes);
        this.magicProtectionType = magicProtectionType;
    }

    @Override
    public int getMinPower(int level) {
        return this.magicProtectionType.getBasePower() + (level - 1) * this.magicProtectionType.getPowerPerLevel();
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + this.magicProtectionType.getPowerPerLevel();
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }


    @Override
    public int getProtectionAmount(int pLevel, DamageSource source) {
        if (this.magicProtectionType == Type.MAGIC && source.isIn(DamageTypeTags.IS_LIGHTNING)) {
            return pLevel;
        } else {
            return 0;
        }
    }

    @Override
    public boolean canAccept(Enchantment other) {
        if (other instanceof MagicResistanceEnchantment) {
            MagicResistanceEnchantment magicResistanceEnchantment = (MagicResistanceEnchantment)other;
            if (this.magicProtectionType == magicResistanceEnchantment.magicProtectionType) {
                return false;
            } else {
                return this.magicProtectionType == Type.MAGIC;
            }
        } else {
            return !super.canAccept(other);
        }
    }

    public static enum Type {
        MAGIC(1, 11);

        private final int basePower;
        private final int powerPerLevel;

        private Type(int basePower, int powerPerLevel) {
            this.basePower = basePower;
            this.powerPerLevel = powerPerLevel;
        }

        public int getBasePower() {
            return this.basePower;
        }

        public int getPowerPerLevel() {
            return this.powerPerLevel;
        }
    }
}