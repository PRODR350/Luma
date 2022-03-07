package net.mcreator.the_legende_of_luma.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.the_legende_of_luma.entity.LumaChickenEntity;

public class LumaChickenRenderer extends MobRenderer<LumaChickenEntity, ChickenModel<LumaChickenEntity>> {
	public LumaChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LumaChickenEntity entity) {
		return new ResourceLocation("the_legende_of_luma:textures/lumanit_chicken.png");
	}
}
