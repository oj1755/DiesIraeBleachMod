package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BakuhaProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Bakuha!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Bakuha!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Bakuha!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Bakuha!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Bakuha!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");

		double xx = 0;
		double zz = 0;
		double i = 0;
		double k = 0;
		double r = 0;
		double dx = 0;
		double t = 0;
		double dz = 0;
		double z1 = 0;
		double z2 = 0;
		double angle = 0;
		double x1 = 0;
		double x2 = 0;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
		}
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
				if (((Entity) world
						.getEntitiesWithinAABB(MonsterEntity.class,
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
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 50, (int) 10, (false), (false)));
					r = 1;
					angle = 0;
					k = 50;
					for (int index0 = 0; index0 < (int) (k); index0++) {
						world.addParticle(ParticleTypes.END_ROD, (entityiterator.getPosX() + r * Math.cos(Math.toRadians(angle))),
								(entityiterator.getPosY()), (entityiterator.getPosZ() + r * Math.sin(Math.toRadians(angle))), 0, 0.2, 0);
						angle = (angle + 360 / k);
					}
					i = 0;
					for (int index1 = 0; index1 < (int) (5); index1++) {
						x1 = (entityiterator.getPosX() + r * Math.cos(Math.toRadians(i)));
						z1 = (entityiterator.getPosZ() + r * Math.sin(Math.toRadians(i)));
						x2 = (entityiterator.getPosX() + r * Math.cos(Math.toRadians(i + 144)));
						z2 = (entityiterator.getPosZ() + r * Math.sin(Math.toRadians(i + 144)));
						dx = ((x2 - x1) / k);
						dz = ((z2 - z1) / k);
						xx = x1;
						zz = z1;
						for (int index2 = 0; index2 < (int) (k); index2++) {
							world.addParticle(ParticleTypes.END_ROD, xx, (entityiterator.getPosY()), zz, 0, 0.2, 0);
							xx = (xx + dx);
							zz = (zz + dz);
						}
						i = (i + 72);
					}
					t = 10;
					for (int index3 = 0; index3 < (int) (5); index3++) {
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
								entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 1);

								MinecraftForge.EVENT_BUS.unregister(this);
							}

						}.start(world, (int) t);
						t = (t + 10);
					}
				}
			}
		}
	}

}
