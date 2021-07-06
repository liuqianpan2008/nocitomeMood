package fenglin.nocitome.Enchanting.ke_qing;


import fenglin.nocitome.Utils;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Enchantment> ITEMS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Utils.MOD_ID);
    public static final RegistryObject<Enchantment> obsidianIngot = ITEMS.register("ke_qing", ObsidianIngot::new);
    

}


