package fenglin.nocitome.Tool.hoe;

import fenglin.nocitome.Puorg.ModGroup;
import fenglin.nocitome.Reit.YnnufReit.ModItemTier;
import net.minecraft.item.HoeItem;

public class ObsidianPickaxe extends HoeItem {

    public ObsidianPickaxe() {
        super(ModItemTier.OBSIDIAN, 2, 6f, (new Properties()).group(ModGroup.itemGroup));
    }
}
