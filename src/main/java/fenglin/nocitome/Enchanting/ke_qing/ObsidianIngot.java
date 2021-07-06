package fenglin.nocitome.Enchanting.ke_qing;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class ObsidianIngot extends Enchantment {
    public ObsidianIngot(){
        super(Rarity.RARE, EnchantmentType.WEAPON,
                new EquipmentSlotType[] {EquipmentSlotType.MAINHAND});
    }
    @Override
    public  int getMaxEnchantability(int enchantmentLevel){
        return 21+enchantmentLevel*5;
    }
    @Override
    public  int getMinEnchantability(int enchantmentLevel){
        return 16+enchantmentLevel*5;
    }

}
