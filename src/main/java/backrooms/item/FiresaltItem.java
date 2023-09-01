
package backrooms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import backrooms.init.MinebbbModTabs;

public class FiresaltItem extends Item {
	public FiresaltItem() {
		super(new Item.Properties().tab(MinebbbModTabs.TAB_BSF_MOD).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
