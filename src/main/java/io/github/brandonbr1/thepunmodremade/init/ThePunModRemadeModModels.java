
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.brandonbr1.thepunmodremade.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.brandonbr1.thepunmodremade.client.model.Modelwitch;
import io.github.brandonbr1.thepunmodremade.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ThePunModRemadeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelwitch.LAYER_LOCATION, Modelwitch::createBodyLayer);
	}
}
