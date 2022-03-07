package net.mcreator.the_legende_of_luma.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandFunction;

import java.util.Optional;

public class LiumpotionEnTickActifDeLaPotionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level && _level.getServer() != null) {
			Optional<CommandFunction> _fopt = _level.getServer().getFunctions().get(new ResourceLocation("the_legende_of_luma:beeanger"));
			if (_fopt.isPresent())
				_level.getServer().getFunctions().execute(_fopt.get(), new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", new TextComponent(""), _level.getServer(), null));
		}
	}
}
