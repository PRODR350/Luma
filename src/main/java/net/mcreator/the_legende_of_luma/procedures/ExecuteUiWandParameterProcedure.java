package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;

import java.util.HashMap;

public class ExecuteUiWandParameterProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		entity.setCustomName(new TextComponent((guistate.containsKey("text:TageName") ? ((EditBox) guistate.get("text:TageName")).getValue() : "")));
		if (guistate.containsKey("checkbox:NoGravity") ? ((Checkbox) guistate.get("checkbox:NoGravity")).selected() : false) {
			entity.setNoGravity((false));
		} else {
			entity.setNoGravity((true));
		}
		if (guistate.containsKey("checkbox:Invisible") ? ((Checkbox) guistate.get("checkbox:Invisible")).selected() : false) {
			entity.getPersistentData().putDouble("Invisible", 1);
		} else {
			entity.getPersistentData().putDouble("Invisible", 0);
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
