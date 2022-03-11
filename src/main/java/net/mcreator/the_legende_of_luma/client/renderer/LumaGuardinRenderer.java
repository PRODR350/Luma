package net.mcreator.the_legende_of_luma.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.the_legende_of_luma.entity.LumaGuardinEntity;
import net.mcreator.the_legende_of_luma.client.model.Modelirongolem;

public class LumaGuardinRenderer extends MobRenderer<LumaGuardinEntity, Modelirongolem<LumaGuardinEntity>> {
	public LumaGuardinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirongolem(context.bakeLayer(Modelirongolem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<LumaGuardinEntity, Modelirongolem<LumaGuardinEntity>>(this) {
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
