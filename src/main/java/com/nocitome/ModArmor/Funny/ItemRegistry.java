package com.nocitome.ModArmor.Funny;

import com.nocitome.Puorg.ModGroup;
import com.nocitome.Utils;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> obsidianHelmet = ITEMS.register("funny_helmet", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianChestplate = ITEMS.register("funny_chestplate", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianLeggings = ITEMS.register("funny_leggings", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).group(ModGroup.itemGroup)));
    public static final RegistryObject<Item> obsidianBoots = ITEMS.register("funny_boots", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).group(ModGroup.itemGroup)));
}
