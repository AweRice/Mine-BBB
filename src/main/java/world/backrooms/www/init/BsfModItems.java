
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package world.backrooms.www.init;

import world.backrooms.www.BsfMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class BsfModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BsfMod.MODID);
	public static final RegistryObject<Item> LEVEL_0_WALLPAPER = block(BsfModBlocks.LEVEL_0_WALLPAPER, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0LAMP = block(BsfModBlocks.LEVEL_0LAMP, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_FLOOR = block(BsfModBlocks.LEVEL_0_FLOOR, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_WALLPAPER_2 = block(BsfModBlocks.LEVEL_0_WALLPAPER_2, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_0_CELLING = block(BsfModBlocks.LEVEL_0_CELLING, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> BROKENLAMP = block(BsfModBlocks.BROKENLAMP, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> WARNINGBLOCK = block(BsfModBlocks.WARNINGBLOCK, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_1_WALL = block(BsfModBlocks.LEVEL_1_WALL, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_1_FLOOR = block(BsfModBlocks.LEVEL_1_FLOOR, BsfModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> WARNING_WALL = block(BsfModBlocks.WARNING_WALL, BsfModTabs.TAB_BSF_MOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
