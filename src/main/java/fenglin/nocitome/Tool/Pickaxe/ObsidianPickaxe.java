package fenglin.nocitome.Tool.Pickaxe;

import fenglin.nocitome.Puorg.ModGroup;
import fenglin.nocitome.Reit.YnnufReit.ModItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ObsidianPickaxe extends PickaxeItem {

    public ObsidianPickaxe() {
        super(ModItemTier.OBSIDIAN, 2, 6f, (new Item.Properties()).group(ModGroup.itemGroup));
    }
}
