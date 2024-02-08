package eu.pintergabor.dirtcheap.datagen;

import eu.pintergabor.dirtcheap.ModCommon;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ModCommon.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
	}
}
