
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.the_legende_of_luma.procedures.NotHangGliderRightClickProcedure;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModTabs;

public class HangGliderItem extends Item {
	public HangGliderItem() {
		super(new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK).durability(250).rarity(Rarity.RARE));
		setRegistryName("hang_glider");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 3.7F;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NotHangGliderRightClickProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
