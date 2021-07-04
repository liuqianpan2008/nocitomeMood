package com.nocitome.EventHandler.RightClickItem;


import com.ibm.icu.impl.ICUBinary;
import com.nocitome.Meti.KeQing.ItemRegistry;
import com.nocitome.Utils;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.EntityPosWrapper;
import net.minecraft.util.text.StringTextComponent;

import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;
import sun.font.LayoutPathImpl;
//
public class item_keqing {
    @SubscribeEvent
    public void pickupItem1(PlayerInteractEvent.RightClickItem event) {
        if (event.getSide() == LogicalSide.SERVER) {

            if (event.getItemStack().getItem() == ItemRegistry.obsidianIngot.get()) {//检测是否右击刻晴{
                //event.getPlayer().getLowestRidingEntity().onKillCommand();
                final BlockPos pos = event.getPos();

                //发送消息
                TranslationTextComponent translationTextComponent = new TranslationTextComponent("message.neutrino.counter");
                event.getPlayer().sendStatusMessage(translationTextComponent, false);
                //event.getPlayer().setHealth(event.getPlayer().getHealth()+2f);
            }
        }
    }
}

