package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.eventbus.api.Event;

public class KibakuswitchProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Kibakuswitch!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Kibakuswitch!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");

		if (entity.isSneaking()) {
			if (entity.getPersistentData().getDouble("tyakkakyori") < 50) {
				entity.getPersistentData().putDouble("tyakkakyori", (entity.getPersistentData().getDouble("tyakkakyori") + 5));
			} else {
				entity.getPersistentData().putDouble("tyakkakyori", 5);
			}
		} else {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null,
						(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * (entity.getPersistentData().getDouble("tyakkakyori")),
										entity.getLook(1f).y * (entity.getPersistentData().getDouble("tyakkakyori")),
										entity.getLook(1f).z * (entity.getPersistentData().getDouble("tyakkakyori"))),
								RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
						(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * (entity.getPersistentData().getDouble("tyakkakyori")),
										entity.getLook(1f).y * (entity.getPersistentData().getDouble("tyakkakyori")),
										entity.getLook(1f).z * (entity.getPersistentData().getDouble("tyakkakyori"))),
								RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
						(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * (entity.getPersistentData().getDouble("tyakkakyori")),
										entity.getLook(1f).y * (entity.getPersistentData().getDouble("tyakkakyori")),
										entity.getLook(1f).z * (entity.getPersistentData().getDouble("tyakkakyori"))),
								RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
						(float) 4, Explosion.Mode.BREAK);
			}
		}
	}

}
