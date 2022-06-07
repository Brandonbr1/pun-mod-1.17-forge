
package io.github.brandonbr1.thepunmodremade.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class DyemondItem extends Item {
	public DyemondItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("dyemond");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
