
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package backrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import backrooms.MinebbbMod;

public class MinebbbModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinebbbMod.MODID);
	public static final RegistryObject<Item> LEVEL_0_WALLPAPER = block(MinebbbModBlocks.LEVEL_0_WALLPAPER, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0LAMP = block(MinebbbModBlocks.LEVEL_0LAMP, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_FLOOR = block(MinebbbModBlocks.LEVEL_0_FLOOR, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_WALLPAPER_2 = block(MinebbbModBlocks.LEVEL_0_WALLPAPER_2, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_CELLING = block(MinebbbModBlocks.LEVEL_0_CELLING, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> BROKENLAMP = block(MinebbbModBlocks.BROKENLAMP, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> WARNINGBLOCK = block(MinebbbModBlocks.WARNINGBLOCK, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_1_WALL = block(MinebbbModBlocks.LEVEL_1_WALL, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_1_FLOOR = block(MinebbbModBlocks.LEVEL_1_FLOOR, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> WARNING_WALL = block(MinebbbModBlocks.WARNING_WALL, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> IRONBOX = block(MinebbbModBlocks.IRONBOX, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> IRONBOX_2 = block(MinebbbModBlocks.IRONBOX_2, MinebbbModTabs.TAB_BSF_MOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
