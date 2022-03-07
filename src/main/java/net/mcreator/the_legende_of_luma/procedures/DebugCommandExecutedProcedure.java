package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import java.util.HashMap;

public class DebugCommandExecutedProcedure {
	public static void execute(double x, double y, double z, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(("Available commands : entity, pos, spawn" + entity)), (false));
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("entity")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(("Entity : " + entity)), (false));
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("pos")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(("Position : " + x + " " + y + " " + z)), (false));
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("spawn")) {
			if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Available structures : None"), (false));
			}
		}
	}
}
