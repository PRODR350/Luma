
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.the_legende_of_luma.procedures.OpenWandGuiProcedure;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModTabs;

public class WandItem extends Item {
	public WandItem() {
		super(new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK).stacksTo(0).rarity(Rarity.COMMON));
		setRegistryName("wand");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		OpenWandGuiProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
