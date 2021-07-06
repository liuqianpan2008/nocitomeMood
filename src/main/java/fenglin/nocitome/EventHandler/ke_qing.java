package fenglin.nocitome.EventHandler;



import fenglin.nocitome.Enchanting.ke_qing.ItemRegistry;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class ke_qing {
    @SubscribeEvent
    public void ke_qing(AttackEntityEvent event){
            Entity e = event.getTarget();
            if (e.getEntity().getName()==EntityType.COW.getName()){
                ItemStack TS = event.getPlayer().getHeldItemMainhand();
                int level = EnchantmentHelper.getEnchantmentLevel(ItemRegistry.obsidianIngot.get(),TS);
                if (level>0){
                    e.onKillCommand();
                }

            }
//
    }


}
