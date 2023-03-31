package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class Allows1000Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Allows1000!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Allows1000!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Allows1000!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Allows1000!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Allows1000!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntity() instanceof ProjectileEntity) ? ((entity).getMotion().distanceTo(Vector3d.ZERO)) : 0) > 2) {
			if (((entity.getEntity() instanceof ProjectileEntity) ? ((entity).getMotion().distanceTo(Vector3d.ZERO)) : 0) < 4) {
				for (int index0 = 0; index0 < (int) (1000); index0++) {
					if (world instanceof ServerWorld) {
						World projectileLevel = (World) world;
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new ArrowEntity(EntityType.ARROW, world);

								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 5, 1);
						_entityToSpawn.setPosition(x, y, z);
						_entityToSpawn.shoot((entity.getMotion().getX() + Math.random() - 0.5), (entity.getMotion().getY() + Math.random() - 0.5),
								(entity.getMotion().getZ() + Math.random() - 0.5), 5, 0);
						world.addEntity(_entityToSpawn);
					}
				}
			}
		}
	}
}
