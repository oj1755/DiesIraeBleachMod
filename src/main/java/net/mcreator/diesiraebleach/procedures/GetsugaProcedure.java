package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.Hand;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class GetsugaProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Getsuga!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Getsuga!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		BlockState k = Blocks.AIR.getDefaultState();
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
		}
		DiesiraebleachModVariables.MapVariables.get(world).k = 0;
		DiesiraebleachModVariables.MapVariables.get(world).syncData(world);
		for (int index0 = 0; index0 < (int) (20); index0++) {
			world.addParticle(GetsugabunshiParticle.particle, (entity.getPosX() + Math.sin(Math.toRadians(entity.rotationYaw))),
					(entity.getPosY() + DiesiraebleachModVariables.MapVariables.get(world).k),
					(entity.getPosZ() + Math.cos(Math.toRadians(entity.rotationYaw))), 0, 0, 0);
			DiesiraebleachModVariables.MapVariables.get(world).k = (DiesiraebleachModVariables.MapVariables.get(world).k + 0.1);
			DiesiraebleachModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
