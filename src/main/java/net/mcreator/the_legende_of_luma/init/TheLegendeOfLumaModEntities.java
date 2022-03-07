
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_legende_of_luma.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.the_legende_of_luma.entity.NetheriteSnowballEntity;
import net.mcreator.the_legende_of_luma.entity.LumaSpectreEntity;
import net.mcreator.the_legende_of_luma.entity.LumaGuardinEntity;
import net.mcreator.the_legende_of_luma.entity.LumaChickenEntity;
import net.mcreator.the_legende_of_luma.entity.LumaBossEntity;
import net.mcreator.the_legende_of_luma.entity.IronSnowballEntity;
import net.mcreator.the_legende_of_luma.entity.GoldenSnowballEntity;
import net.mcreator.the_legende_of_luma.entity.EmeraldSnowballEntity;
import net.mcreator.the_legende_of_luma.entity.DiamondSnowballEntity;
import net.mcreator.the_legende_of_luma.entity.BosstestEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLegendeOfLumaModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<LumaSpectreEntity> LUMA_SPECTRE = register("entitybulletluma_spectre",
			EntityType.Builder.<LumaSpectreEntity>of(LumaSpectreEntity::new, MobCategory.MISC).setCustomClientFactory(LumaSpectreEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<LumaGuardinEntity> LUMA_GUARDIN = register("luma_guardin",
			EntityType.Builder.<LumaGuardinEntity>of(LumaGuardinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(LumaGuardinEntity::new).sized(0.6f, 2.8f));
	public static final EntityType<LumaChickenEntity> LUMA_CHICKEN = register("luma_chicken",
			EntityType.Builder.<LumaChickenEntity>of(LumaChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(LumaChickenEntity::new).sized(0.4f, 0.7f));
	public static final EntityType<LumaBossEntity> LUMA_BOSS = register("luma_boss",
			EntityType.Builder.<LumaBossEntity>of(LumaBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(LumaBossEntity::new).sized(0.6f, 2.1f));
	public static final EntityType<IronSnowballEntity> IRON_SNOWBALL = register("entitybulletiron_snowball",
			EntityType.Builder.<IronSnowballEntity>of(IronSnowballEntity::new, MobCategory.MISC).setCustomClientFactory(IronSnowballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<GoldenSnowballEntity> GOLDEN_SNOWBALL = register("entitybulletgolden_snowball",
			EntityType.Builder.<GoldenSnowballEntity>of(GoldenSnowballEntity::new, MobCategory.MISC).setCustomClientFactory(GoldenSnowballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<EmeraldSnowballEntity> EMERALD_SNOWBALL = register("entitybulletemerald_snowball",
			EntityType.Builder.<EmeraldSnowballEntity>of(EmeraldSnowballEntity::new, MobCategory.MISC)
					.setCustomClientFactory(EmeraldSnowballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<DiamondSnowballEntity> DIAMOND_SNOWBALL = register("entitybulletdiamond_snowball",
			EntityType.Builder.<DiamondSnowballEntity>of(DiamondSnowballEntity::new, MobCategory.MISC)
					.setCustomClientFactory(DiamondSnowballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<NetheriteSnowballEntity> NETHERITE_SNOWBALL = register("entitybulletnetherite_snowball",
			EntityType.Builder.<NetheriteSnowballEntity>of(NetheriteSnowballEntity::new, MobCategory.MISC)
					.setCustomClientFactory(NetheriteSnowballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BosstestEntity> BOSSTEST = register("bosstest",
			EntityType.Builder.<BosstestEntity>of(BosstestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BosstestEntity::new).sized(0.4f, 0.3f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LumaGuardinEntity.init();
			LumaChickenEntity.init();
			LumaBossEntity.init();
			BosstestEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LUMA_GUARDIN, LumaGuardinEntity.createAttributes().build());
		event.put(LUMA_CHICKEN, LumaChickenEntity.createAttributes().build());
		event.put(LUMA_BOSS, LumaBossEntity.createAttributes().build());
		event.put(BOSSTEST, BosstestEntity.createAttributes().build());
	}
}
