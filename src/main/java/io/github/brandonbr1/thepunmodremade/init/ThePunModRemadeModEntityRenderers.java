
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.brandonbr1.thepunmodremade.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import io.github.brandonbr1.thepunmodremade.client.renderer.SandWitchRenderer;
import io.github.brandonbr1.thepunmodremade.client.renderer.FrostBitterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThePunModRemadeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ThePunModRemadeModEntities.CROSS_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.EGGSTERMINATOR, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.SPEAR_MINT, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.STEALKNIFE, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.FEATHER_THROW, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.OBSIDIEANBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.BOW_IN, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.HAM_MER, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.CAN_INK, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.RAIN_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.FROST_BITTER, FrostBitterRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.SAND_WITCH, SandWitchRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.SAND_WITCH_PROJECTILE, ThrownItemRenderer::new);
		event.registerEntityRenderer(ThePunModRemadeModEntities.SAND, ThrownItemRenderer::new);
	}
}
