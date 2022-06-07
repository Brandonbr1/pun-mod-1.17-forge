package io.github.brandonbr1.thepunmodremade.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import io.github.brandonbr1.thepunmodremade.entity.SandWitchEntity;

public class SandWitchRenderer extends HumanoidMobRenderer<SandWitchEntity, HumanoidModel<SandWitchEntity>> {
	public SandWitchRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(SandWitchEntity entity) {
		return new ResourceLocation("the_pun_mod_remade:textures/53x7c2fe0piaaaaasuvork5cyii.png");
	}
}
