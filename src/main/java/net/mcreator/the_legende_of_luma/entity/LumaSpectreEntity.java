
package net.mcreator.the_legende_of_luma.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.the_legende_of_luma.procedures.LumaniteSpectreBulletQuandUneBalleToucheUnJoueurProcedure;
import net.mcreator.the_legende_of_luma.procedures.LumaniteSpectreBulletQuandUneBalleToucheUnBlocProcedure;
import net.mcreator.the_legende_of_luma.procedures.LumaSpectreWhileProjectileFlyingTickProcedure;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class LumaSpectreEntity extends AbstractArrow implements ItemSupplier {
	public LumaSpectreEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(TheLegendeOfLumaModEntities.LUMA_SPECTRE, world);
	}

	public LumaSpectreEntity(EntityType<? extends LumaSpectreEntity> type, Level world) {
		super(type, world);
	}

	public LumaSpectreEntity(EntityType<? extends LumaSpectreEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public LumaSpectreEntity(EntityType<? extends LumaSpectreEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		Entity sourceentity = this.getOwner();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity imediatesourceentity = this;

		LumaniteSpectreBulletQuandUneBalleToucheUnJoueurProcedure.execute(entity);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		Entity entity = this.getOwner();
		Entity imediatesourceentity = this;

		LumaSpectreWhileProjectileFlyingTickProcedure.execute(world, x, y, z);
		if (this.inGround) {

			LumaniteSpectreBulletQuandUneBalleToucheUnBlocProcedure.execute(world, x, y, z);
			this.discard();
		}
	}

	public static LumaSpectreEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		LumaSpectreEntity entityarrow = new LumaSpectreEntity(TheLegendeOfLumaModEntities.LUMA_SPECTRE, entity, world);
		entityarrow.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.power_select")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static LumaSpectreEntity shoot(LivingEntity entity, LivingEntity target) {
		LumaSpectreEntity entityarrow = new LumaSpectreEntity(TheLegendeOfLumaModEntities.LUMA_SPECTRE, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(3.9999999999999996);
		entityarrow.setKnockback(3);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z,
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.power_select")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
