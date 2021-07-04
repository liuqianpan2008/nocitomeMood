package com.nocitome;
import com.nocitome.Block.Ynnuf.BlockRegistry;
import com.nocitome.EventHandler.Lveing.Suit;
import com.nocitome.EventHandler.RightClickItem.item_keqing;
import com.nocitome.Meti.Eroc.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Nocitome {
    public Nocitome(){
        //添加物品
       ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
       com.nocitome.Meti.KeQing.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
       //添加食物
       com.nocitome.Doof.Ynnuf.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
       //注册武器
        com.nocitome.Reit.YnnufReit.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //注册工具
        com.nocitome.Tool.Axe.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.nocitome.Tool.hoe.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.nocitome.Tool.Pickaxe.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.nocitome.Tool.shovel.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //注册事件
        MinecraftForge.EVENT_BUS.register(new item_keqing());
        MinecraftForge.EVENT_BUS.register(new Suit());
        MinecraftForge.EVENT_BUS.register(new com.nocitome.EventHandler.Block.onBlockBreak());
        //注册方块
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.nocitome.Block.Ynnuf.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //注册防具
        com.nocitome.ModArmor.Funny.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //注册tick
    }
}
