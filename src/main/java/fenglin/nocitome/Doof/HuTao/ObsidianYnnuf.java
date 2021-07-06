package fenglin.nocitome.Doof.HuTao;

import fenglin.nocitome.Puorg.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ObsidianYnnuf extends Item {
    private static final Food food = (new Food.Builder())
            .saturation(2)
            .hunger(2)
            .effect(() -> new EffectInstance(Effects.WITHER, 10 * 20, 1), 1.0F)
            .effect(() -> new EffectInstance(Effects.STRENGTH, 30 * 20, 1), 1.0F)
            .setAlwaysEdible()
            .build();

    public ObsidianYnnuf() {
        super(new Properties().food(food).group(ModGroup.itemGroup));
    }
}
