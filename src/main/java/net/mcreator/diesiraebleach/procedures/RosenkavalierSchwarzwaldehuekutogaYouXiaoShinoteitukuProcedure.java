package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.potion.KyuseiPPotionEffect;
import net.mcreator.diesiraebleach.particle.SouzouparticleParticle;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class RosenkavalierSchwarzwaldehuekutogaYouXiaoShinoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure RosenkavalierSchwarzwaldehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure RosenkavalierSchwarzwaldehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure RosenkavalierSchwarzwaldehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure RosenkavalierSchwarzwaldehuekutogaYouXiaoShinoteituku!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER
						.warn("Failed to load dependency entity for procedure RosenkavalierSchwarzwaldehuekutogaYouXiaoShinoteituku!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (100 / 2d), y - (100 / 2d), z - (100 / 2d), x + (100 / 2d), y + (100 / 2d), z + (100 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity) && ((Entity) world
						.getEntitiesWithinAABB(LivingEntity.class,
								new AxisAlignedBB((entityiterator.getPosX()) - (0.1 / 2d), (entityiterator.getPosY()) - (0.1 / 2d),
										(entityiterator.getPosZ()) - (0.1 / 2d), (entityiterator.getPosX()) + (0.1 / 2d),
										(entityiterator.getPosY()) + (0.1 / 2d), (entityiterator.getPosZ()) + (0.1 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf((entityiterator.getPosX()), (entityiterator.getPosY()), (entityiterator.getPosZ()))).findFirst()
						.orElse(null)) != null) {
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(KyuseiPPotionEffect.potion, (int) 60, (int) 1));
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(SouzouparticleParticle.particle, (entityiterator.getPosX()), (entityiterator.getPosY()),
								(entityiterator.getPosZ()), (int) 5, (entity.getPosX() - entityiterator.getPosX()),
								(entity.getPosY() - entityiterator.getPosY()), (entity.getPosZ() - entityiterator.getPosZ()), 0.3);
					}
					if (entity.isAlive()) {
						if (((entityiterator instanceof LivingEntity) ? ((LivingEntity) entityiterator).getHealth() : -1) > 0) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
												+ ((entityiterator instanceof LivingEntity) ? ((LivingEntity) entityiterator).getHealth() : -1)
														/ 2000));
						}
					}
				}
			}
		}
	}
}
