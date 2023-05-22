package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.HinokoParticle;
import net.mcreator.diesiraebleach.particle.FireparticlerightParticle;
import net.mcreator.diesiraebleach.particle.FireparticleleftParticle;
import net.mcreator.diesiraebleach.particle.FireAuralightParticle;
import net.mcreator.diesiraebleach.particle.FireAuraParticle;
import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class HihiirokanesouzouProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Hihiirokanesouzou!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Hihiirokanesouzou!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Hihiirokanesouzou!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Hihiirokanesouzou!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Hihiirokanesouzou!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(FireAuraParticle.particle, x, (y + 1), z, (int) 1, 0, 0, 0, 0);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(FireAuralightParticle.particle, x, (y + 1), z, (int) 1, 0, 0, 0, 0);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(HinokoParticle.particle, x, y, z, (int) 30, 0.1, 0.8, 0.1, 0.05);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator) && entityiterator.isAlive()) {
					entityiterator.attackEntityFrom(DamageSource.IN_FIRE,
							(float) (1 + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DiesiraebleachModVariables.PlayerVariables())).Killsoul / 500));
					entityiterator.setFire((int) 10);
				}
				if (MathHelper
						.nextInt(new Random(), 1,
								(int) (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DiesiraebleachModVariables.PlayerVariables())).Killsoul) == MathHelper.nextInt(new Random(), 1,
												1000)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 60, (int) 1000));
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(FireparticlerightParticle.particle, x, y, z, (int) 3, 0, 1, 0, 0.1);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(FireparticleleftParticle.particle, x, y, z, (int) 3, 0, 1, 0, 0.1);
					}
				}
			}
		}
	}
}
