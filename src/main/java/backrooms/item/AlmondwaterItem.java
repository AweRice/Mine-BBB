
package backrooms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import backrooms.init.MinebbbModTabs;

public class AlmondwaterItem extends Item {
	public AlmondwaterItem() {
		super(new Item.Properties().tab(MinebbbModTabs.TAB_BSF_MOD).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(5f).alwaysEat()

				.build()));
	}
}
