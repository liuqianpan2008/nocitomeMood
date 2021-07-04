package com.nocitome.Tool.Pickaxe;

import com.nocitome.Puorg.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ObsidianPickaxe extends PickaxeItem {

    public ObsidianPickaxe() {
        super(com.nocitome.Reit.YnnufReit.ModItemTier.OBSIDIAN, 2, 6f, (new Item.Properties()).group(ModGroup.itemGroup));
    }
}
