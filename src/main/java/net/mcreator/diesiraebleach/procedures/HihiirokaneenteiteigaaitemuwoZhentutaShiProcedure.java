package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.potion.SeiibutsuPotionEffect;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class HihiirokaneenteiteigaaitemuwoZhentutaShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure HihiirokaneenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure HihiirokaneenteiteigaaitemuwoZhentutaShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(SeiibutsuPotionEffect.potion, (int) 60, (int) 1));
		for (int index0 = 0; index0 < (int) (100); index0++) {
			world.addParticle(ParticleTypes.FLAME, (entity.getPosX()), (entity.getPosY()), (entity.getPosZ()), 3, 3, 3);
		}
	}
}
