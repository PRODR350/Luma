
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModTabs;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class LumaniteSwordItem extends Item {
	public LumaniteSwordItem() {
		super(new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK).durability(100).rarity(Rarity.EPIC));
		setRegistryName("lumanite_sword");
	}

	@Override
	public int getEnchantmentValue() {
		return 25;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 17F;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE,
					new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", 4.300000000000001d, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED,
					new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, AttributeModifier.Operation.ADDITION));
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}
}
