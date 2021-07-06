package fenglin.nocitome.Reit.YnnufReit;

import fenglin.nocitome.Puorg.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ObsidianSword extends SwordItem {
    public ObsidianSword() {
        super(ModItemTier.OBSIDIAN, 6, 4F, new Item.Properties().group(ModGroup.itemGroup));
    }
}

