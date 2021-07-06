package fenglin.nocitome.Meti.KeQing;

import fenglin.nocitome.Puorg.ModGroup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ObsidianIngot extends Item {
    public ObsidianIngot(){
        super(new Properties().group(ModGroup.itemGroup).maxDamage(7));

    }


    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        if(itemStack.getDamage() < itemStack.getMaxDamage()){
            ItemStack item = itemStack.copy();
            item.setDamage(item.getDamage() + 1);
            return item;
        }
        return new ItemStack(Items.AIR);
    }
}
