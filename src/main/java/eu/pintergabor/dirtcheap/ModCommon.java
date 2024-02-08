package eu.pintergabor.dirtcheap;

import com.mojang.logging.LogUtils;
import eu.pintergabor.dirtcheap.block.ModBlocks;
import eu.pintergabor.dirtcheap.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ModCommon.MODID)
public class ModCommon {
	public static final String MODID = "dirtcheap";
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogUtils.getLogger();

	public ModCommon() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.register(modEventBus);
		ModBlocks.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event) {
	}

	// You can use EventBusSubscriber to automatically register
	// all static methods in the class annotated with @SubscribeEvent
	@net.minecraftforge.fml.common.Mod.EventBusSubscriber(modid = MODID,
		bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
		}
	}
}
