
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.brandonbr1.thepunmodremade.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import io.github.brandonbr1.thepunmodremade.block.IceDimensionPortalBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThePunModRemadeModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block ICE_DIMENSION_PORTAL = register(new IceDimensionPortalBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
