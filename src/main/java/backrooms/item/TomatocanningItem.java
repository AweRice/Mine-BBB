
package backrooms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import backrooms.init.MinebbbModTabs;

public class TomatocanningItem extends Item {
	public TomatocanningItem() {
		super(new Item.Properties().tab(MinebbbModTabs.TAB_BSF_MOD).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(5).saturationMod(2f)

				.build()));
	}
}
