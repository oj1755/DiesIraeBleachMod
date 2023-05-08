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
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.SouzouparticleParticle;
import net.mcreator.diesiraebleach.particle.DarkParticleParticle;
import net.mcreator.diesiraebleach.item.BeienkyoriitemItem;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class KuibakuhaProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Kuibakuha!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Kuibakuha!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Kuibakuha!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Kuibakuha!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Kuibakuha!");
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
							new AxisAlignedBB(x - (10 / 2d), y - (10 / 2d), z - (10 / 2d), x + (10 / 2d), y + (10 / 2d), z + (10 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos(entityiterator.getPosX(), entityiterator.getPosY(), entityiterator.getPosZ()),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("diesiraebleach:beikuihassha")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound((entityiterator.getPosX()), (entityiterator.getPosY()), (entityiterator.getPosZ()),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("diesiraebleach:beikuihassha")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (!(entity == entityiterator) && ((Entity) world
						.getEntitiesWithinAABB(LivingEntity.class,
								new AxisAlignedBB((entityiterator.getPosX()) - (1 / 2d), (entityiterator.getPosY()) - (1 / 2d),
										(entityiterator.getPosZ()) - (1 / 2d), (entityiterator.getPosX()) + (1 / 2d),
										(entityiterator.getPosY()) + (1 / 2d), (entityiterator.getPosZ()) + (1 / 2d)),
								null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf((entityiterator.getPosX()), (entityiterator.getPosY()), (entityiterator.getPosZ()))).findFirst()
						.orElse(null)) != null) {
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
							for (int index0 = 0; index0 < (int) (10); index0++) {
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(SouzouparticleParticle.particle, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 10, 1, 2, 1, 0.1);
								}
								if (world instanceof ServerWorld) {
									((ServerWorld) world).spawnParticle(DarkParticleParticle.particle, (entityiterator.getPosX()),
											(entityiterator.getPosY()), (entityiterator.getPosZ()), (int) 10, 1, 1, 1, 0.1);
								}
								if (world instanceof ServerWorld) {
									World projectileLevel = (World) world;
									ProjectileEntity _entityToSpawn = new Object() {
										public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrowEntity entityToSpawn = new BeienkyoriitemItem.ArrowCustomEntity(BeienkyoriitemItem.arrow,
													world);
											entityToSpawn.setShooter(shooter);
											entityToSpawn.setDamage(damage);
											entityToSpawn.setKnockbackStrength(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);

											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 3, 0, (byte) 2);
									_entityToSpawn.setPosition((entityiterator.getPosX()), (entityiterator.getPosY() - 0.1),
											(entityiterator.getPosZ()));
									_entityToSpawn.shoot(0.1, 0.1, 0.1, 2, 0);
									world.addEntity(_entityToSpawn);
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 5);
				}
			}
		}
	}
}
