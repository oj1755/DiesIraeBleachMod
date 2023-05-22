package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.HinokoParticle;
import net.mcreator.diesiraebleach.particle.HibashoraparticleParticle;
import net.mcreator.diesiraebleach.particle.FlameParticle;
import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class DerFreishutuzSamielProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure DerFreishutuzSamiel!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure DerFreishutuzSamiel!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure DerFreishutuzSamiel!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure DerFreishutuzSamiel!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure DerFreishutuzSamiel!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double angle = 0;
		double r = 0;
		double angle2 = 0;
		{
			double _setval = (entity.rotationYaw);
			entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SamielAngle = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 100;
			entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SamielR = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:bakuhatsu")),
					SoundCategory.NEUTRAL, (float) 5, (float) 0.4);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:bakuhatsu")),
					SoundCategory.NEUTRAL, (float) 5, (float) 0.4, false);
		}
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
				for (int index0 = 0; index0 < (int) (5); index0++) {
					entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 100);
					entity.setFire((int) 30);
					for (int index1 = 0; index1 < (int) (2); index1++) {
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;

							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								for (int index2 = 0; index2 < (int) (36); index2++) {
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(HibashoraparticleParticle.particle,
												(x + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new DiesiraebleachModVariables.PlayerVariables())).SamielR
														* Math.cos(Math.toRadians((entity
																.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new DiesiraebleachModVariables.PlayerVariables())).SamielAngle))),
												y,
												(z + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new DiesiraebleachModVariables.PlayerVariables())).SamielR
														* Math.sin(Math.toRadians(
																(entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.orElse(new DiesiraebleachModVariables.PlayerVariables())).SamielAngle))),
												(int) 1, 0, 0, 0, 0);
									}
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(HinokoParticle.particle, x, y, z, (int) 50, 3, 3, 3, 1);
									}
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(FlameParticle.particle, x, y, z, (int) 5, 3, 3, 3, 1);
									}
									{
										double _setval = ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new DiesiraebleachModVariables.PlayerVariables())).SamielAngle + 10);
										entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.SamielAngle = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
								{
									double _setval = ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DiesiraebleachModVariables.PlayerVariables())).SamielR + 10);
									entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.SamielR = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 40);
					}
				}
			}
		}
	}
}
