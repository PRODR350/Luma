
package net.mcreator.the_legende_of_luma.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.the_legende_of_luma.procedures.LiliumseedsLorsDunClickDroitSurUnBlocProcedure;
import net.mcreator.the_legende_of_luma.init.TheLegendeOfLumaModTabs;

public class LiliumseedsItem extends Item {
	public LiliumseedsItem() {
		super(new Item.Properties().tab(TheLegendeOfLumaModTabs.TAB_MOD_30_BLOCK).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("liliumseeds");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		LiliumseedsLorsDunClickDroitSurUnBlocProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
