package eu.pintergabor.dirtcheap.datagen;

import java.util.concurrent.CompletableFuture;

import eu.pintergabor.dirtcheap.ModCommon;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

public class ModBlockTagGenerator extends BlockTagsProvider {
	public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
		@Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, ModCommon.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider pProvider) {
	}

	@Override
	public @NotNull String getName() {
		return "Block Tags";
	}
}
