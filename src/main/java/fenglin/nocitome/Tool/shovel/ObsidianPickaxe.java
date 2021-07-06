package fenglin.nocitome.Tool.shovel;

import fenglin.nocitome.Puorg.ModGroup;
import fenglin.nocitome.Reit.YnnufReit.ModItemTier;
import net.minecraft.item.ShovelItem;

public class ObsidianPickaxe extends ShovelItem {

    public ObsidianPickaxe() {
        super(ModItemTier.OBSIDIAN, 2, -3f, (new Properties()).group(ModGroup.itemGroup));
    }
}
