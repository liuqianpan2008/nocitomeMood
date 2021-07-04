package com.nocitome.EventHandler.Lveing;

import com.nocitome.ModArmor.Funny.ItemRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;

import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Suit {
    @SubscribeEvent
    public void pickupItem1(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntityLiving();
        EffectInstance effect =new EffectInstance(Effects.FIRE_RESISTANCE,1200000,0,false,true);
        if(                player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem()== ItemRegistry.obsidianHelmet.get()
                        && player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem()== ItemRegistry.obsidianChestplate.get()
                        && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem()== ItemRegistry.obsidianLeggings.get()
                        && player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem()== ItemRegistry.obsidianBoots.get()
        ){
            player.addPotionEffect(effect);
        }else {
            player.removePotionEffect(Effects.FIRE_RESISTANCE);
        }

    }
}
