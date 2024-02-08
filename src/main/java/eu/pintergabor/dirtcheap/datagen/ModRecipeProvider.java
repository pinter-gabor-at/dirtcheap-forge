package eu.pintergabor.dirtcheap.datagen;

import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

	public ModRecipeProvider(PackOutput pOutput) {
		super(pOutput);
	}

	@Override
	protected void buildRecipes(@NotNull RecipeOutput pWriter) {
		// Generate two shapeless recipes:
		// Mix DIRT with BONE_MEAL or with ROTTEN_FLESH to create 2 DIRTs.
		for (Item i : new Item[]{Items.BONE_MEAL, Items.ROTTEN_FLESH}) {
			final String fullName = i.getDescriptionId();
			final String name = fullName.substring(fullName.lastIndexOf('.') + 1);
			ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DIRT, 2)
				.requires(Items.DIRT)
				.requires(i)
				.unlockedBy("has_dirt", has(Items.DIRT))
				.unlockedBy("has_" + name, has(i))
				.save(pWriter, "dirt_from_" + name);
		}
	}
}
