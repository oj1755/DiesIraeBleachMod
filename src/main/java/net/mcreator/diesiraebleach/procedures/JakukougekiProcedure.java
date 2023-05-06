package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.StraightslashParticle;
import net.mcreator.diesiraebleach.particle.SouzouparticleParticle;
import net.mcreator.diesiraebleach.particle.SlashsweepleftParticle;
import net.mcreator.diesiraebleach.particle.SlashsweepParticle;
import net.mcreator.diesiraebleach.particle.FlameParticle;
import net.mcreator.diesiraebleach.particle.FireparticlerightParticle;
import net.mcreator.diesiraebleach.particle.FireparticleleftParticle;
import net.mcreator.diesiraebleach.particle.FireballparticleParticle;
import net.mcreator.diesiraebleach.particle.BloodsweepParticle;
import net.mcreator.diesiraebleach.particle.BeykatsudouparticlerightParticle;
import net.mcreator.diesiraebleach.particle.BeykatsudouparticleleftParticle;
import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class JakukougekiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Jakukougeki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Jakukougeki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Jakukougeki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Jakukougeki!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Jakukougeki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double r = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DiesiraebleachModVariables.PlayerVariables())).Seiibutsu == true) {
			{
				List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
						new AxisAlignedBB(
								(x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))) - (5 / 2d),
								(y + 1) - (5 / 2d),
								(z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))) - (5 / 2d),
								(x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))) + (5 / 2d),
								(y + 1) + (5 / 2d),
								(z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))) + (5 / 2d)),
						null).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf((x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))),
								(y + 1), (z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110))))))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (entityiterator instanceof LivingEntity) {
							entityiterator.attackEntityFrom(DamageSource.GENERIC,
									(float) (2 + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DiesiraebleachModVariables.PlayerVariables())).Killsoul / 100));
							if (((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DiesiraebleachModVariables.PlayerVariables())).Hihiirokane
									|| (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new DiesiraebleachModVariables.PlayerVariables())).DerfreischeSamiel) == true) {
								entityiterator.setFire((int) 5);
							}
						}
					}
				}
			}
			if (((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).Hihiirokane
					|| (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DiesiraebleachModVariables.PlayerVariables())).DerfreischeSamiel) == true) {
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == true
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == true) {
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos(x, y, z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("diesiraebleach:kensuburi")),
										SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("diesiraebleach:kensuburi")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					X = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getX()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX());
					Y = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getY()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY());
					Z = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getZ()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ());
					entity.setMotion(X, Y, Z);
					r = 1;
					for (int index0 = 0; index0 < (int) (4); index0++) {
						{
							List<Entity> _entfound = world
									.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB((x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - (2 / 2d),
													(y + 1) - (2 / 2d), (z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - (2 / 2d),
													(x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))) + (2 / 2d), (y + 1) + (2 / 2d),
													(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))) + (2 / 2d)),
											null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf((x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))), (y + 1),
											(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90)))))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity) {
										entityiterator.attackEntityFrom(DamageSource.GENERIC,
												(float) (5 + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new DiesiraebleachModVariables.PlayerVariables())).Killsoul / 100));
									}
								}
							}
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(FireballparticleParticle.particle,
									(x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))), (y + 1),
									(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))), (int) 5, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(FlameParticle.particle, x, y, z, (int) 10, 1, 1, 1, 1);
						}
						r = (r + 1);
					}
					{
						boolean _setval = (false);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (false);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == true
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == false) {
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos(x, y, z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("diesiraebleach:kaensmall")),
										SoundCategory.NEUTRAL, (float) 1, (float) 0.8);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("diesiraebleach:kaensmall")),
								SoundCategory.NEUTRAL, (float) 1, (float) 0.8, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(FireparticlerightParticle.particle,
								(x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (y + 1),
								(z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (int) 1, 0.1,
								0.1, 0.1, 0);
					}
					{
						boolean _setval = (true);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
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
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo1 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo2 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == false
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == false) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:kaen")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:kaen")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.OFF_HAND, true);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(FireparticleleftParticle.particle,
								(x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (y + 1),
								(z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (int) 1, 0.1,
								0.1, 0.1, 0);
					}
					{
						boolean _setval = (true);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
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
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo1 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo2 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
				}
			} else if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).Yaminotamamono == true) {
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == true
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == true) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:speed2")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:speed2")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					X = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getX()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX());
					Y = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getY()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY());
					Z = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getZ()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ());
					entity.setMotion(X, Y, Z);
					r = 1;
					for (int index1 = 0; index1 < (int) (4); index1++) {
						{
							List<Entity> _entfound = world
									.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB((x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - (2 / 2d),
													(y + 1) - (2 / 2d), (z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - (2 / 2d),
													(x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))) + (2 / 2d), (y + 1) + (2 / 2d),
													(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))) + (2 / 2d)),
											null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf((x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))), (y + 1),
											(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90)))))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity) {
										entityiterator.attackEntityFrom(DamageSource.GENERIC,
												(float) (5 + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new DiesiraebleachModVariables.PlayerVariables())).Killsoul / 100));
									}
								}
							}
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(BloodsweepParticle.particle,
									(x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))), (y + 1),
									(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))), (int) 5, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(SouzouparticleParticle.particle, x, y, z, (int) 10, 1, 1, 1, 1);
						}
						r = (r + 1);
					}
					{
						boolean _setval = (false);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (false);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == true
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == false) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:speed1")),
								SoundCategory.NEUTRAL, (float) 1, (float) 0.8);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:speed1")),
								SoundCategory.NEUTRAL, (float) 1, (float) 0.8, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(BeykatsudouparticlerightParticle.particle,
								(x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (y + 1),
								(z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (int) 1, 0.1,
								0.1, 0.1, 0);
					}
					{
						boolean _setval = (true);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
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
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo1 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo2 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == false
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == false) {
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos(x, y, z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("diesiraebleach:punchsuburi")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("diesiraebleach:punchsuburi")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.OFF_HAND, true);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(BeykatsudouparticleleftParticle.particle,
								(x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (y + 1),
								(z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (int) 1, 0.1,
								0.1, 0.1, 0);
					}
					{
						boolean _setval = (true);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
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
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo1 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo2 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
				}
			} else if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).MarglittoJudis == true) {
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == true
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == true) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:speed2")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:speed2")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					X = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getX()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX());
					Y = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getY()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY());
					Z = (entity.world
							.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
							.getPos().getZ()
							- entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * 0, entity.getLook(1f).y * 0, entity.getLook(1f).z * 0),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ());
					entity.setMotion(X, Y, Z);
					r = 1;
					for (int index2 = 0; index2 < (int) (4); index2++) {
						{
							List<Entity> _entfound = world
									.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB((x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - (2 / 2d),
													(y + 1) - (2 / 2d), (z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - (2 / 2d),
													(x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))) + (2 / 2d), (y + 1) + (2 / 2d),
													(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))) + (2 / 2d)),
											null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf((x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))), (y + 1),
											(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90)))))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									if (entityiterator instanceof LivingEntity) {
										entityiterator.attackEntityFrom(DamageSource.GENERIC,
												(float) (5 + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new DiesiraebleachModVariables.PlayerVariables())).Killsoul / 100));
									}
								}
							}
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(StraightslashParticle.particle,
									(x + r * Math.cos(Math.toRadians(entity.rotationYaw + 90))), (y + 1),
									(z + r * Math.sin(Math.toRadians(entity.rotationYaw + 90))), (int) 1, 0.1, 0.1, 0.1, 0);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(StraightslashParticle.particle, x, y, z, (int) 10, 1, 1, 1, 1);
						}
						r = (r + 1);
					}
					{
						boolean _setval = (false);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = (false);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == true
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == false) {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:kaze")),
								SoundCategory.NEUTRAL, (float) 1, (float) 0.8);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:kaze")),
								SoundCategory.NEUTRAL, (float) 1, (float) 0.8, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(SlashsweepleftParticle.particle,
								(x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (y + 1),
								(z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (int) 1, 0.1,
								0.1, 0.1, 0);
					}
					{
						boolean _setval = (true);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
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
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo1 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo2 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo1 == false
						&& (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new DiesiraebleachModVariables.PlayerVariables())).combo2 == false) {
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos(x, y, z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("diesiraebleach:punchsuburi")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("diesiraebleach:punchsuburi")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.OFF_HAND, true);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(SlashsweepParticle.particle,
								(x + 1 * Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (y + 1),
								(z + 1 * Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 70, 110)))), (int) 1, 0.1,
								0.1, 0.1, 0);
					}
					{
						boolean _setval = (true);
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.combo1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
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
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo1 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = (false);
								entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.combo2 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
				}
			}
		}
	}
}
