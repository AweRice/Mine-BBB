
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.minebbb.www.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.minebbb.www.block.WarningblockBlock;
import com.minebbb.www.block.WarningWallBlock;
import com.minebbb.www.block.Level1WallBlock;
import com.minebbb.www.block.Level1FloorBlock;
import com.minebbb.www.block.Level0lampBlock;
import com.minebbb.www.block.Level0WallpaperBlock;
import com.minebbb.www.block.Level0Wallpaper2Block;
import com.minebbb.www.block.Level0FloorBlock;
import com.minebbb.www.block.Level0CellingBlock;
import com.minebbb.www.block.BrokenlampBlock;
import com.minebbb.www.MinebbbMod;

public class MinebbbModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinebbbMod.MODID);
	public static final RegistryObject<Block> LEVEL_0_WALLPAPER = REGISTRY.register("level_0_wallpaper", () -> new Level0WallpaperBlock());
	public static final RegistryObject<Block> LEVEL_0LAMP = REGISTRY.register("level_0lamp", () -> new Level0lampBlock());
	public static final RegistryObject<Block> LEVEL_0_FLOOR = REGISTRY.register("level_0_floor", () -> new Level0FloorBlock());
	public static final RegistryObject<Block> LEVEL_0_WALLPAPER_2 = REGISTRY.register("level_0_wallpaper_2", () -> new Level0Wallpaper2Block());
	public static final RegistryObject<Block> LEVEL_0_CELLING = REGISTRY.register("level_0_celling", () -> new Level0CellingBlock());
	public static final RegistryObject<Block> BROKENLAMP = REGISTRY.register("brokenlamp", () -> new BrokenlampBlock());
	public static final RegistryObject<Block> WARNINGBLOCK = REGISTRY.register("warningblock", () -> new WarningblockBlock());
	public static final RegistryObject<Block> LEVEL_1_WALL = REGISTRY.register("level_1_wall", () -> new Level1WallBlock());
	public static final RegistryObject<Block> LEVEL_1_FLOOR = REGISTRY.register("level_1_floor", () -> new Level1FloorBlock());
	public static final RegistryObject<Block> WARNING_WALL = REGISTRY.register("warning_wall", () -> new WarningWallBlock());
}
