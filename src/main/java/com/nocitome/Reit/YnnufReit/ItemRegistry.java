package com.nocitome.Reit.YnnufReit;

import com.nocitome.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static RegistryObject<Item> obsidianSword = ITEMS.register("reit_ynnufreit", ObsidianSword::new);
}
