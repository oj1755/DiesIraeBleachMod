package net.mcreator.diesiraebleach.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.potion.CoolTimePotionEffect;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class TimeStopposiyonnoXiaoGuogaKaiShiShiYongsaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure TimeStopposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion(0, 0, 0);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(CoolTimePotionEffect.potion, (int) 60, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 60, (int) 1000));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 60, (int) 1000));
	}
}
