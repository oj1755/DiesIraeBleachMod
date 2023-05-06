package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.eventbus.api.Event;

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

		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:beikuihassha")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:beikuihassha")),
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
					for (int index1 = 0; index1 < (int) (10); index1++) {
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(SouzouparticleParticle.particle, x, y, z, (int) 10, 10, 10, 10, 1);
						}
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(DarkParticleParticle.particle, x, y, z, (int) 10, 10, 10, 10, 1);
						}
						if (world instanceof ServerWorld) {
							World projectileLevel = (World) world;
							ProjectileEntity _entityToSpawn = new Object() {
								public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback, byte piercing) {
									AbstractArrowEntity entityToSpawn = new BeienkyoriitemItem.ArrowCustomEntity(BeienkyoriitemItem.arrow, world);
									entityToSpawn.setShooter(shooter);
									entityToSpawn.setDamage(damage);
									entityToSpawn.setKnockbackStrength(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setPierceLevel(piercing);

									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 3, 0, (byte) 2);
							_entityToSpawn.setPosition((x + MathHelper.nextDouble(new Random(), -10, 10)),
									(y + MathHelper.nextDouble(new Random(), 0, 0)), (z + MathHelper.nextDouble(new Random(), -10, 10)));
							_entityToSpawn.shoot(0.1, 1, 0.1, 2, 0);
							world.addEntity(_entityToSpawn);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}

			}.start(world, (int) 5);
		}
	}

}
