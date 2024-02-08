package eu.pintergabor.dirtcheap.datagen;

import eu.pintergabor.dirtcheap.ModCommon;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import net.minecraft.data.PackOutput;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, ModCommon.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
	}
}
