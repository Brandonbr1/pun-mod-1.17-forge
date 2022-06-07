
package io.github.brandonbr1.thepunmodremade.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class BattleIronItem extends Item {
	public BattleIronItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("battle_iron");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
