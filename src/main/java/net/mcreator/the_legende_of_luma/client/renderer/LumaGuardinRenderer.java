package net.mcreator.the_legende_of_luma.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.the_legende_of_luma.entity.LumaGuardinEntity;

public class LumaGuardinRenderer extends HumanoidMobRenderer<LumaGuardinEntity, HumanoidModel<LumaGuardinEntity>> {
	public LumaGuardinRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<LumaGuardinEntity, HumanoidModel<LumaGuardinEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("the_legende_of_luma:textures/lumanite_guardian.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LumaGuardinEntity entity) {
		return new ResourceLocation("the_legende_of_luma:textures/lumanite_guardian.png");
	}
}
