
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.minebbb.www.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.minebbb.www.MineBbbMod;

public class MineBbbModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MineBbbMod.MODID);
	public static final RegistryObject<Item> LEVEL_0_WALLPAPER = block(MineBbbModBlocks.LEVEL_0_WALLPAPER, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0LAMP = block(MineBbbModBlocks.LEVEL_0LAMP, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_FLOOR = block(MineBbbModBlocks.LEVEL_0_FLOOR, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_WALLPAPER_2 = block(MineBbbModBlocks.LEVEL_0_WALLPAPER_2, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_CELLING = block(MineBbbModBlocks.LEVEL_0_CELLING, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> BROKENLAMP = block(MineBbbModBlocks.BROKENLAMP, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> WARNINGBLOCK = block(MineBbbModBlocks.WARNINGBLOCK, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_1_WALL = block(MineBbbModBlocks.LEVEL_1_WALL, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_1_FLOOR = block(MineBbbModBlocks.LEVEL_1_FLOOR, MineBbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> WARNING_WALL = block(MineBbbModBlocks.WARNING_WALL, MineBbbModTabs.TAB_BSF_MOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
