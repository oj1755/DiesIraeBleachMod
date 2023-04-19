package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.BloodmoonParticle;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class TesdtbProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Tesdtb!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Tesdtb!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Tesdtb!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Tesdtb!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(BloodmoonParticle.particle, x, (entity.getPosY() + 30), z, (int) 1, 0.1, 0.1, 0.1, 0);
		}
	}
}
