
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package backrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import backrooms.MinebbbMod;

public class MinebbbModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MinebbbMod.MODID);
	public static final RegistryObject<Potion> LIQUIDPAIN = REGISTRY.register("liquidpain",
			() -> new Potion(new MobEffectInstance(MobEffects.HARM, 1, 1, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 2, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.CONFUSION, 3600, 0, false, true), new MobEffectInstance(MobEffects.HUNGER, 3600, 0, false, true), new MobEffectInstance(MobEffects.POISON, 3600, 0, false, true),
					new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true)));
}
