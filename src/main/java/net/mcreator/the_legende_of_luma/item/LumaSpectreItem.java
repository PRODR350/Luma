
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.the_legende_of_luma.procedures.LumaSpectreCanUseRangedItemProcedure;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModTabs;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;
import net.mcreator.the_legende_of_luma.entity.LumaSpectreEntity;

public class LumaSpectreItem extends Item {
	public LumaSpectreItem() {
		super(new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK).durability(350));
		setRegistryName("luma_spectre");
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.SPEAR;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == TheLegendeOfLumaModItems.LUMA_CHARD_ITEM);
				if (stack == ItemStack.EMPTY) {
					for (int i = 0; i < entity.getInventory().items.size(); i++) {
						ItemStack teststack = entity.getInventory().items.get(i);
						if (teststack != null && teststack.getItem() == TheLegendeOfLumaModItems.LUMA_CHARD_ITEM) {
							stack = teststack;
							break;
						}
					}
				}
				if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {
					LumaSpectreEntity entityarrow = LumaSpectreEntity.shoot(world, entity, world.getRandom(), 2f, 3.9999999999999996, 3);
					itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
					if (entity.getAbilities().instabuild) {
						entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					} else {
						if (new ItemStack(TheLegendeOfLumaModItems.LUMA_CHARD_ITEM).isDamageableItem()) {
							if (stack.hurt(1, world.getRandom(), entity)) {
								stack.shrink(1);
								stack.setDamageValue(0);
								if (stack.isEmpty())
									entity.getInventory().removeItem(stack);
							}
						} else {
							stack.shrink(1);
							if (stack.isEmpty())
								entity.getInventory().removeItem(stack);
						}
					}

					LumaSpectreCanUseRangedItemProcedure.execute(entity, itemstack);
				}
			}
		}
	}
}
