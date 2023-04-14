package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.KyuseipParticle;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class KyuseiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Kyusei!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Kyusei!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Kyusei!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		boolean a = false;
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity)
					.setHealth((float) (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHealth() : -1) + 5));
		for (int index0 = 0; index0 < (int) (50); index0++) {
			world.addParticle(KyuseipParticle.particle, (entity.getPosX()), (entity.getPosY()), (entity.getPosZ()), (0.1 * sourceentity.getPosX()),
					(sourceentity.getPosY()), (0.1 * sourceentity.getPosZ()));
		}
	}
}
