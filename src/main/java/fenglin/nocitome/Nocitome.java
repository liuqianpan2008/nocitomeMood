package fenglin.nocitome;
import fenglin.nocitome.Block.Ynnuf.BlockRegistry;
import fenglin.nocitome.Enchanting.ke_qing.ItemRegistry;
import fenglin.nocitome.EventHandler.Lveing.Suit;
import fenglin.nocitome.EventHandler.RightClickItem.item_keqing;
import fenglin.nocitome.EventHandler.Block.onBlockBreak;
import fenglin.nocitome.EventHandler.ke_qing;
import fenglin.nocitome.world.onSetUpEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Utils.MOD_ID)
public class Nocitome {
    public Nocitome(){
        //添加物品
       fenglin.nocitome.Meti.Eroc.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
       fenglin.nocitome.Meti.KeQing.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
       //添加食物
       fenglin.nocitome.Doof.Ynnuf.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
       fenglin.nocitome.Doof.HuTao.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
       //注册武器
        fenglin.nocitome.Reit.YnnufReit.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //注册工具
        fenglin.nocitome.Tool.Axe.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        fenglin.nocitome.Tool.hoe.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        fenglin.nocitome.Tool.Pickaxe.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        fenglin.nocitome.Tool.shovel.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //注册事件
        MinecraftForge.EVENT_BUS.register(new item_keqing());
        MinecraftForge.EVENT_BUS.register(new Suit());
        MinecraftForge.EVENT_BUS.register(new onBlockBreak());
        MinecraftForge.EVENT_BUS.register(new ke_qing());
        //注册方块
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        fenglin.nocitome.Block.Ynnuf.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //注册防具
        fenglin.nocitome.ModArmor.Funny.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //矿物生成
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, onSetUpEvent::generateOres);
        //附魔
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
