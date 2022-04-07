package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModItems;

public class FourLeafCloverItemRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Clover = 0;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.LUCK,
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
							? _livEnt.getEffect(MobEffects.LUCK).getDuration()
							: 0) + 600),
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
							? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
							: 0) + 1),
					(true), (true)));
		if (TheLegendeOfLumaModVariables.MapVariables.get(world).IsSuvie == true) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TheLegendeOfLumaModItems.FOUR_LEAF_CLOVER_ITEM);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
