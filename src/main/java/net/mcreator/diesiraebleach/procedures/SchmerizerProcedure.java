package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.SamielMahoujin1Particle;
import net.mcreator.diesiraebleach.item.SchmeizerItemItem;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class SchmerizerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Schmerizer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Schmerizer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Schmerizer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Schmerizer!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Schmerizer!");
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
			angle = (angle + 36);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:guncharge")),
						SoundCategory.NEUTRAL, (float) 0.5, (float) 2);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:guncharge")),
						SoundCategory.NEUTRAL, (float) 0.5, (float) 2, false);
			}
		}
		for (int index1 = 0; index1 < (int) (30); index1++) {
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
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:gunfire")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 2);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:gunfire")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 2, false);
					}
					if (world instanceof ServerWorld) {
						World projectileLevel = (World) world;
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new SchmeizerItemItem.ArrowCustomEntity(SchmeizerItemItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 1, 0);
						_entityToSpawn.setPosition((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 0))), (y + 1),
								(z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 0))));
						_entityToSpawn.shoot(((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - x), 0.1,
								((z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - z), 5, 5);
						world.addEntity(_entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						World projectileLevel = (World) world;
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new SchmeizerItemItem.ArrowCustomEntity(SchmeizerItemItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 1, 0);
						_entityToSpawn.setPosition((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 36))), (y + 1),
								(z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 36))));
						_entityToSpawn.shoot(((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - x), 0.1,
								((z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - z), 5, 5);
						world.addEntity(_entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						World projectileLevel = (World) world;
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new SchmeizerItemItem.ArrowCustomEntity(SchmeizerItemItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 1, 0);
						_entityToSpawn.setPosition((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 72))), (y + 1),
								(z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 72))));
						_entityToSpawn.shoot(((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - x), 0.1,
								((z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - z), 5, 5);
						world.addEntity(_entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						World projectileLevel = (World) world;
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new SchmeizerItemItem.ArrowCustomEntity(SchmeizerItemItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 1, 0);
						_entityToSpawn.setPosition((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 108))), (y + 1),
								(z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 108))));
						_entityToSpawn.shoot(((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - x), 0.1,
								((z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - z), 5, 5);
						world.addEntity(_entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						World projectileLevel = (World) world;
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new SchmeizerItemItem.ArrowCustomEntity(SchmeizerItemItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 1, 0);
						_entityToSpawn.setPosition((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 144))), (y + 1),
								(z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 144))));
						_entityToSpawn.shoot(((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - x), 0.1,
								((z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - z), 5, 5);
						world.addEntity(_entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						World projectileLevel = (World) world;
						ProjectileEntity _entityToSpawn = new Object() {
							public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
								AbstractArrowEntity entityToSpawn = new SchmeizerItemItem.ArrowCustomEntity(SchmeizerItemItem.arrow, world);
								entityToSpawn.setShooter(shooter);
								entityToSpawn.setDamage(damage);
								entityToSpawn.setKnockbackStrength(knockback);
								entityToSpawn.setSilent(true);

								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 1, 0);
						_entityToSpawn.setPosition((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 180))), (y + 1),
								(z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 180))));
						_entityToSpawn.shoot(((x + 3 * Math.cos(Math.toRadians(entity.rotationYaw + 90))) - x), 0.1,
								((z + 3 * Math.sin(Math.toRadians(entity.rotationYaw + 90))) - z), 5, 5);
						world.addEntity(_entityToSpawn);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 20);
		}
	}
}
