
package backrooms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import backrooms.init.MinebbbModTabs;

public class PowerBarItem extends Item {
	public PowerBarItem() {
		super(new Item.Properties().tab(MinebbbModTabs.TAB_BSF_MOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(4f).alwaysEat()

				.build()));
	}
}
