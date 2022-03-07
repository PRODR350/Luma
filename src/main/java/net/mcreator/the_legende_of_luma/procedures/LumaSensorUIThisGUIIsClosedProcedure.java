package net.mcreator.the_legende_of_luma.procedures;

import net.minecraftforge.fmllegacy.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.Util;

import net.mcreator.the_legende_of_luma.network.TheLegendeOfLumaModVariables;

import java.util.HashMap;

public class LumaSensorUIThisGUIIsClosedProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		TheLegendeOfLumaModVariables.MapVariables.get(world).SaveEntitySensor = guistate.containsKey("text:EntitySensor")
				? ((EditBox) guistate.get("text:EntitySensor")).getValue()
				: "";
		TheLegendeOfLumaModVariables.MapVariables.get(world).syncData(world);
		if (!world.isClientSide()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().broadcastMessage(
						new TextComponent(
								(guistate.containsKey("text:EntitySensor") ? ((EditBox) guistate.get("text:EntitySensor")).getValue() : "")),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
