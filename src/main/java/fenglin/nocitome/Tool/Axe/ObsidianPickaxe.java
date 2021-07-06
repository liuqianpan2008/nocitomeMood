package fenglin.nocitome.Tool.Axe;

import fenglin.nocitome.Puorg.ModGroup;
import fenglin.nocitome.Reit.YnnufReit.ModItemTier;
import net.minecraft.item.AxeItem;

public class ObsidianPickaxe extends AxeItem {

    public ObsidianPickaxe() {
        super(ModItemTier.OBSIDIAN, 2, 6f, (new Properties()).group(ModGroup.itemGroup));
    }
}
