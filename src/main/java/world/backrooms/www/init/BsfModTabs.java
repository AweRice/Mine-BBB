
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package world.backrooms.www.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BsfModTabs {
	public static CreativeModeTab TAB_BSF_MOD;

	public static void load() {
		TAB_BSF_MOD = new CreativeModeTab("tabbsf_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.DIAMOND_BLOCK);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
