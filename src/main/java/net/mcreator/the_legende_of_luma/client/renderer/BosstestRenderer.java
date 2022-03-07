package net.mcreator.the_legende_of_luma.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.the_legende_of_luma.entity.BosstestEntity;

public class BosstestRenderer extends MobRenderer<BosstestEntity, SilverfishModel<BosstestEntity>> {
	public BosstestRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BosstestEntity entity) {
		return new ResourceLocation("the_legende_of_luma:textures/monster.png");
	}
}
