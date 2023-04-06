package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SchreiberBootsbutunoMeiteitukunoibentoProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure SchreiberBootsbutunoMeiteitukunoibento!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 6);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 6e+33, (int) 300));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 6e+33, (int) 3));
		if (entity.isSprinting()) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 30, (int) 5));
		} else {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 30, (int) 2));
		}
	}

}
