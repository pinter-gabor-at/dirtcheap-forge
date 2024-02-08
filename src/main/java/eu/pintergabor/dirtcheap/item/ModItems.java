package eu.pintergabor.dirtcheap.item;

import eu.pintergabor.dirtcheap.ModCommon;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.item.Item;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
		DeferredRegister.create(ForgeRegistries.ITEMS, ModCommon.MODID);
	public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
		() -> new Item(new Item.Properties()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
