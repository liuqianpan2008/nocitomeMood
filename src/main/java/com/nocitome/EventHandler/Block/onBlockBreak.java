package com.nocitome.EventHandler.Block;

import com.nocitome.Block.Ynnuf.BlockRegistry;
import com.nocitome.Block.Ynnuf.ItemRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class onBlockBreak {
    @SubscribeEvent
    public void pickupItem1(BlockEvent.BreakEvent event) {
        if (event.getState().getBlock().equals(BlockRegistry.obsidianBlock.get())){
            event.getPlayer().addItemStackToInventory(new ItemStack(ItemRegistry.obsidianBlock.get()));
        }

    }
}
