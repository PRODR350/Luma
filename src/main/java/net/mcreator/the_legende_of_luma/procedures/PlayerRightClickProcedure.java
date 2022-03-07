package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModBlocks;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class PlayerRightClickProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		Player entity = event.getPlayer();
		if (event.getHand() != entity.getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMALOG) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_MUSHROOM.asItem()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.roots.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.roots.place")),
								SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.LUMA_BROW_MUSHROOM_LOG.defaultBlockState(), 3);
				if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BROWN_MUSHROOM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.RED_MUSHROOM
					.asItem()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.roots.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.roots.place")),
								SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.LUMA_RED_MUSHROOM_LOG.defaultBlockState(), 3);
				if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.RED_MUSHROOM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
								SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.STRIPPED_LUMA_BLOCK.defaultBlockState(), 3);
				if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
			}
		} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.STRIPPED_LUMA_BLOCK) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_MUSHROOM.asItem()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.roots.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.roots.place")),
								SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.setBlock(new BlockPos((int) x, (int) y, (int) z),
						TheLegendeOfLumaModBlocks.STRIPPED_LUMA_BROWN_MUSHROOM_LOG.defaultBlockState(), 3);
				if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BROWN_MUSHROOM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.RED_MUSHROOM
					.asItem()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.roots.place")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.roots.place")),
								SoundSource.BLOCKS, 1, 1, false);
					}
				}
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.STRIPPED_LUMA_RED_MUSHROOM_LOG.defaultBlockState(),
						3);
				if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.RED_MUSHROOM);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			}
		} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMA_BROW_MUSHROOM_LOG
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.BLOCKS,
							1, 1, false);
				}
			}
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.STRIPPED_LUMA_BROWN_MUSHROOM_LOG.defaultBlockState(),
					3);
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TheLegendeOfLumaModBlocks.LUMA_RED_MUSHROOM_LOG
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.BLOCKS,
							1, 1, false);
				}
			}
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), TheLegendeOfLumaModBlocks.STRIPPED_LUMA_RED_MUSHROOM_LOG.defaultBlockState(), 3);
			if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		}
	}
}
