package net.mcreator.the_legende_of_luma.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.the_legende_of_luma.entity.LumaBossEntity;
import net.mcreator.the_legende_of_luma.client.model.Modelluma_bosss;

public class LumaBossRenderer extends MobRenderer<LumaBossEntity, Modelluma_bosss<LumaBossEntity>> {
	public LumaBossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelluma_bosss(context.bakeLayer(Modelluma_bosss.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<LumaBossEntity, Modelluma_bosss<LumaBossEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("the_legende_of_luma:textures/luma_boss_glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LumaBossEntity entity) {
		return new ResourceLocation("the_legende_of_luma:textures/luma_boss.png");
	}
}
