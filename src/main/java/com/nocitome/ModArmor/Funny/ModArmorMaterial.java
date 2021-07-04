package com.nocitome.ModArmor.Funny;

import com.nocitome.Meti.Eroc.ItemRegistry;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    OBSIDIAN("funny", 40, new int[]{5, 8, 10, 5}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.fromItems(ItemRegistry.obsidianIngot.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;//名字
    private final int maxDamageFactor;//最大损失
    private final int[] damageReductionAmountArray;//保护
    private final int enchantability;//附魔
    private final SoundEvent soundEvent;//声音
    private final float toughness;//韧性
    private final float knockbackResistance;//击退阻力
    private final LazyValue<Ingredient> repairMaterial;//修复材料

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

