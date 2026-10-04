/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goldsmp.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.goldsmp.GoldsmpMod;

import java.util.function.Function;

public class GoldsmpModItems {
	public static Item OTHER_DIRT;
	public static Item CHORAL_STEM;

	public static void load() {
		OTHER_DIRT = block(GoldsmpModBlocks.OTHER_DIRT, "other_dirt");
		CHORAL_STEM = block(GoldsmpModBlocks.CHORAL_STEM, "choral_stem");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GoldsmpMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GoldsmpMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}