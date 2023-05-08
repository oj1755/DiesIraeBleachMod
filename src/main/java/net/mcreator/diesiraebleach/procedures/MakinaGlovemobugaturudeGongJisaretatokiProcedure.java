package net.mcreator.diesiraebleach.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class MakinaGlovemobugaturudeGongJisaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure MakinaGlovemobugaturudeGongJisaretatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1e+308);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).clearActivePotions();
	}
}
