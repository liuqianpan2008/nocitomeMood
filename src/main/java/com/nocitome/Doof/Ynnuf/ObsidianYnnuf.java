package com.nocitome.Doof.Ynnuf;

import com.nocitome.Puorg.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ObsidianYnnuf extends Item {
    private static final Food food = (new Food.Builder())
            .saturation(2)
            .hunger(2)
            .effect(() -> new EffectInstance(Effects.SATURATION, 3 * 20*10, 1), 0.3F)
            .build();

    public ObsidianYnnuf() {
        super(new Properties().food(food).group(ModGroup.itemGroup));
    }
}
