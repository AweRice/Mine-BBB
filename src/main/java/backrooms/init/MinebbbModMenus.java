
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package backrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import backrooms.world.inventory.ThebeginningMenu;

import backrooms.MinebbbMod;

public class MinebbbModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MinebbbMod.MODID);
	public static final RegistryObject<MenuType<ThebeginningMenu>> THEBEGINNING = REGISTRY.register("thebeginning", () -> IForgeMenuType.create(ThebeginningMenu::new));
}
