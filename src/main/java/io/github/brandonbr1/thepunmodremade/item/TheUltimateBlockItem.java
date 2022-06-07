
package io.github.brandonbr1.thepunmodremade.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.Entity;

import io.github.brandonbr1.thepunmodremade.procedures.TheUltimateBlockItemInInventoryTickProcedure;

public class TheUltimateBlockItem extends Item {
	public TheUltimateBlockItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("the_ultimate_block");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		TheUltimateBlockItemInInventoryTickProcedure.execute(entity);
	}
}
