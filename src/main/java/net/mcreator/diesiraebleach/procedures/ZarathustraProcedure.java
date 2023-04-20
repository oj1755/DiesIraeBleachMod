package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ZarathustraProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Zarathustra!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Zarathustra!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");

		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB((entity.getPosX()) - (10 / 2d), (entity.getPosY()) - (10 / 2d), (entity.getPosZ()) - (10 / 2d),
									(entity.getPosX()) + (10 / 2d), (entity.getPosY()) + (10 / 2d), (entity.getPosZ()) + (10 / 2d)),
							null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 6000, (int) 100));
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 6000, (int) 100));
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 6000, (int) 100));
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 6000, (int) (-10)));
					entityiterator.setNoGravity((true));
					entityiterator.setSprinting((false));
					if ((entityiterator instanceof TameableEntity) && (entity instanceof PlayerEntity)) {
						((TameableEntity) entityiterator).setTamed(true);
						((TameableEntity) entityiterator).setTamedBy((PlayerEntity) entity);
					}
				}
			}
		}
	}

}
