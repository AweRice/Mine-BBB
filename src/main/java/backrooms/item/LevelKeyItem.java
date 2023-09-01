
package backrooms.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import backrooms.init.MinebbbModTabs;

public class LevelKeyItem extends Item {
	public LevelKeyItem() {
		super(new Item.Properties().tab(MinebbbModTabs.TAB_BSF_MOD).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
