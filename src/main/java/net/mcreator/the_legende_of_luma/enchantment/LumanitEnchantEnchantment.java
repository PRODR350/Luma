
package net.mcreator.the_legende_of_luma.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class LumanitEnchantEnchantment extends Enchantment {
	public LumanitEnchantEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 7;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == Enchantments.UNBREAKING)
			return true;
		if (ench == Enchantments.SMITE)
			return true;
		if (ench == Enchantments.BLOCK_EFFICIENCY)
			return true;
		if (ench == Enchantments.LOYALTY)
			return true;
		if (ench == Enchantments.THORNS)
			return true;
		if (ench == Enchantments.SHARPNESS)
			return true;
		if (ench == Enchantments.KNOCKBACK)
			return true;
		if (ench == Enchantments.MOB_LOOTING)
			return true;
		if (ench == Enchantments.BLOCK_FORTUNE)
			return true;
		if (ench == Enchantments.POWER_ARROWS)
			return true;
		if (ench == Enchantments.PUNCH_ARROWS)
			return true;
		return false;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == Items.ENCHANTED_BOOK)
			return true;
		return false;
	}
}
