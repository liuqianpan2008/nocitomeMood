package fenglin.nocitome.EventHandler.Block;

import fenglin.nocitome.Block.Ynnuf.BlockRegistry;
import fenglin.nocitome.Block.Ynnuf.ItemRegistry;
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
