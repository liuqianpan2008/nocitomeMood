package fenglin.nocitome.EventHandler.RightClickItem;



import fenglin.nocitome.Meti.KeQing.ItemRegistry;



import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
public class item_keqing {
    @SubscribeEvent
    public void item_keqing(PlayerInteractEvent.RightClickItem event) {
        if (event.getSide() == LogicalSide.SERVER)

            if (event.getItemStack().getItem() == ItemRegistry.obsidianIngot.get()) {//检测是否右击刻晴{



                //发送消息
                TranslationTextComponent translationTextComponent = new TranslationTextComponent("message.neutrino.counter");
                event.getPlayer().sendStatusMessage(translationTextComponent, false);
                //event.getPlayer().setHealth(event.getPlayer().getHealth()+2f);
            }
        }
    }


