package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.SamielMahoujin1Particle;
import net.mcreator.diesiraebleach.particle.MuzzleflashParticle;
import net.mcreator.diesiraebleach.item.DummyschmeizerItem;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class Schmeizer2Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Schmeizer2!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Schmeizer2!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Schmeizer2!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Schmeizer2!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Schmeizer2!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double angle = 0;
		double angle2 = 0;
		angle = (entity.rotationYaw);
		angle2 = (entity.rotationYaw + 90);
		for (int index0 = 0; index0 < (int) (6); index0++) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:panzersummon")),
						SoundCategory.NEUTRAL, (float) 0.5, (float) 2);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:panzersummon")),
						SoundCategory.NEUTRAL, (float) 0.5, (float) 2, false);
			}
			world.addParticle(SamielMahoujin1Particle.particle, (x + 3 * Math.cos(Math.toRadians(angle))), (y + 1),
					(z + 3 * Math.sin(Math.toRadians(angle))), 0, 0, 0);
			if (world instanceof ServerWorld) {
				World projectileLevel = (World) world;
				ProjectileEntity _entityToSpawn = new Object() {
					public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
						AbstractArrowEntity entityToSpawn = new DummyschmeizerItem.ArrowCustomEntity(DummyschmeizerItem.arrow, world);
						entityToSpawn.setShooter(shooter);
						entityToSpawn.setDamage(damage);
						entityToSpawn.setKnockbackStrength(knockback);
						entityToSpawn.setSilent(true);

						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 1, 1);
				_entityToSpawn.setPosition((x + 3 * Math.cos(Math.toRadians(angle))), (y + 0), (z + 3 * Math.sin(Math.toRadians(angle))));
				_entityToSpawn.shoot(0, 0, 0, 0, 0);
				world.addEntity(_entityToSpawn);
			}
			angle = (angle + 36);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:guncharge")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:guncharge")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("diesiraebleach:machinegunfire")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("diesiraebleach:machinegunfire")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					for (int index1 = 0; index1 < (int) (30); index1++) {
						world.addParticle(MuzzleflashParticle.particle, (x + 3.5 * Math.cos(Math.toRadians(entity.rotationYaw + 0))), (y + 1),
								(z + 3.5 * Math.sin(Math.toRadians(entity.rotationYaw + 0))), 0, 0, 0);
						world.addParticle(MuzzleflashParticle.particle, (x + 3.5 * Math.cos(Math.toRadians(entity.rotationYaw + 36))), (y + 1),
								(z + 3.5 * Math.sin(Math.toRadians(entity.rotationYaw + 36))), 0, 0, 0);
						world.addParticle(MuzzleflashParticle.particle, (x + 3.5 * Math.cos(Math.toRadians(entity.rotationYaw + 72))), (y + 1),
								(z + 3.5 * Math.sin(Math.toRadians(entity.rotationYaw + 72))), 0, 0, 0);
						world.addParticle(MuzzleflashParticle.particle, (x + 3.5 * Math.cos(Math.toRadians(entity.rotationYaw + 108))), (y + 1),
								(z + 3.5 * Math.sin(Math.toRadians(entity.rotationYaw + 108))), 0, 0, 0);
						world.addParticle(MuzzleflashParticle.particle, (x + 3.5 * Math.cos(Math.toRadians(entity.rotationYaw + 144))), (y + 1),
								(z + 3.5 * Math.sin(Math.toRadians(entity.rotationYaw + 144))), 0, 0, 0);
						world.addParticle(MuzzleflashParticle.particle, (x + 3.5 * Math.cos(Math.toRadians(entity.rotationYaw + 180))), (y + 1),
								(z + 3.5 * Math.sin(Math.toRadians(entity.rotationYaw + 180))), 0, 0, 0);
						{
							List<Entity> _entfound = world
									.getEntitiesWithinAABB(Entity.class,
											new AxisAlignedBB((x + 10 * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - (10 / 2d),
													(y + 1) - (10 / 2d), (z + 10 * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - (10 / 2d),
													(x + 10 * Math.cos(Math.toRadians(entity.rotationYaw + 90))) + (10 / 2d), (y + 1) + (10 / 2d),
													(z + 10 * Math.sin(Math.toRadians(entity.rotationYaw + 90))) + (10 / 2d)),
											null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf((x + 10 * Math.cos(Math.toRadians(entity.rotationYaw + 90))), (y + 1),
											(z + 10 * Math.sin(Math.toRadians(entity.rotationYaw + 90)))))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(entity == entityiterator)) {
									entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 20);
								}
							}
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
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(MuzzleflashParticle.particle,
											(x + MathHelper.nextDouble(new Random(), 5, 20)
													* Math.cos(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 0, 180)))),
											(y + MathHelper.nextDouble(new Random(), 0, 3)),
											(z + MathHelper.nextDouble(new Random(), 5, 20)
													* Math.sin(Math.toRadians(entity.rotationYaw + MathHelper.nextDouble(new Random(), 36, 180)))),
											(int) 2, 0.1, 0.1, 0.1, 0);
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 5);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 10);
		}
	}
}
