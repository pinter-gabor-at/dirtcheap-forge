package eu.pintergabor.dirtcheap.datagen;

import eu.pintergabor.dirtcheap.ModCommon;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import net.minecraft.data.PackOutput;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, ModCommon.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
	}

}
