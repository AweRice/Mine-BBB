
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package backrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import backrooms.MinebbbMod;

public class MinebbbModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MinebbbMod.MODID);
	public static final RegistryObject<PaintingVariant> FUN = REGISTRY.register("fun", () -> new PaintingVariant(16, 16));
}
