package com.nocitome.EventHandler.RightClickItem;


import com.ibm.icu.impl.ICUBinary;
import com.nocitome.Meti.KeQing.ItemRegistry;
import net.minecraft.util.text.StringTextComponent;

import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
//

public class item_keqing {

    @SubscribeEvent
    public void pickupItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getSide() == LogicalSide.SERVER) {

            if (event.getItemStack().getItem() == ItemRegistry.obsidianIngot.get()) {//检测是否右击刻晴{
                TranslationTextComponent translationTextComponent = new TranslationTextComponent("message.neutrino.counter");
                event.getPlayer().sendStatusMessage(translationTextComponent,false);//发生消息
                //event.getPlayer().setHealth(event.getPlayer().getHealth()+2f);


            }
        }


    }
}
