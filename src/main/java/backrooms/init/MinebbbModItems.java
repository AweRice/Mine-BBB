
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

import backrooms.item.UnknownliquidItem;
import backrooms.item.TomatocanningItem;
import backrooms.item.PowerBarItem;
import backrooms.item.MoneyItem;
import backrooms.item.LevelKeyItem;
import backrooms.item.FiresaltItem;
import backrooms.item.ColaItem;
import backrooms.item.AlmondwaterItem;

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
	public static final RegistryObject<Item> BOX = block(MinebbbModBlocks.BOX, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> IRONBAR = block(MinebbbModBlocks.IRONBAR, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> COPPER_BLOCK = block(MinebbbModBlocks.COPPER_BLOCK, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_1_PIPELINE = block(MinebbbModBlocks.LEVEL_1_PIPELINE, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_1_CEILING = block(MinebbbModBlocks.LEVEL_1_CEILING, MinebbbModTabs.TAB_BSF_MOD);
	public static final RegistryObject<Item> LEVEL_KEY = REGISTRY.register("level_key", () -> new LevelKeyItem());
	public static final RegistryObject<Item> COLA = REGISTRY.register("cola", () -> new ColaItem());
	public static final RegistryObject<Item> MONEY = REGISTRY.register("money", () -> new MoneyItem());
	public static final RegistryObject<Item> TOMATOCANNING = REGISTRY.register("tomatocanning", () -> new TomatocanningItem());
	public static final RegistryObject<Item> UNKNOWNLIQUID = REGISTRY.register("unknownliquid", () -> new UnknownliquidItem());
	public static final RegistryObject<Item> FIRESALT = REGISTRY.register("firesalt", () -> new FiresaltItem());
	public static final RegistryObject<Item> POWER_BAR = REGISTRY.register("power_bar", () -> new PowerBarItem());
	public static final RegistryObject<Item> ALMONDWATER = REGISTRY.register("almondwater", () -> new AlmondwaterItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
