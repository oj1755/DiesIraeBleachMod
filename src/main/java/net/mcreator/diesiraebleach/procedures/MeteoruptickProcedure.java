package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MeteoruptickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Meteoruptick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Meteoruptick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Meteoruptick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Meteoruptick!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");

		double xx = 0;
		double zz = 0;
		double a = 0;
		double r = 0;
		double dx = 0;
		double dz = 0;
		double z1 = 0;
		double hight = 0;
		double z2 = 0;
		double i = 0;
		double x1 = 0;
		double x2 = 0;
		if (new Object() {
			public double getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "meteortimer") > 0) {
			if (new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "centery") + 20 <= 319) {
				hight = (new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "centery") + 20);
			} else {
				hight = 319;
			}
			r = 10;
			a = ((new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "meteortimer")) * 3.6);
			for (int index0 = 0; index0 < (int) (15); index0++) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, ((x + 0.5) - r * Math.sin(Math.toRadians(a))), hight,
							(z + 0.5 + r * Math.cos(Math.toRadians(a))), (int) 1, 0.1, 0.1, 0.1, 0);
				}
				a = (a + 36);
			}
			i = 30;
			a = ((new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "meteortimer")) * 3.6);
			for (int index1 = 0; index1 < (int) (3); index1++) {
				x1 = ((x + 0.5) - r * Math.sin(Math.toRadians(a)));
				z1 = (z + 0.5 + r * Math.cos(Math.toRadians(a)));
				x2 = ((x + 0.5) - r * Math.sin(Math.toRadians(a + 120)));
				z2 = (z + 0.5 + r * Math.cos(Math.toRadians(a + 120)));
				dx = ((x2 - x1) / i);
				dz = ((z2 - z1) / i);
				xx = x1;
				zz = z1;
				for (int index2 = 0; index2 < (int) (i); index2++) {
					if (Math.random() < 0.01) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new TNTEntity(EntityType.TNT, (World) world);
							entityToSpawn.setLocationAndAngles(xx, hight, zz, world.getRandom().nextFloat() * 360F, 0);

							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);

							world.addEntity(entityToSpawn);
						}
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, xx, hight, zz, (int) 1, 0.1, 0.1, 0.1, 0);
					}
					xx = (xx + dx);
					zz = (zz + dz);
				}
				a = (a + 120);
			}
			i = 30;
			a = ((new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "meteortimer")) * 3.6);
			for (int index3 = 0; index3 < (int) (4); index3++) {
				x1 = ((x + 0.5) - r * Math.sin(Math.toRadians((-1) * a)));
				z1 = (z + 0.5 + r * Math.cos(Math.toRadians((-1) * a)));
				x2 = ((x + 0.5) - r * Math.sin(Math.toRadians((-1) * a + 90)));
				z2 = (z + 0.5 + r * Math.cos(Math.toRadians((-1) * a + 90)));
				dx = ((x2 - x1) / i);
				dz = ((z2 - z1) / i);
				xx = x1;
				zz = z1;
				for (int index4 = 0; index4 < (int) (i); index4++) {
					if (Math.random() < 0.05) {
						if (world instanceof ServerWorld) {
							World projectileLevel = (World) world;
							ProjectileEntity _entityToSpawn = new SmallFireballEntity(EntityType.SMALL_FIREBALL, projectileLevel);
							_entityToSpawn.setPosition(xx, hight, zz);
							_entityToSpawn.shoot((Math.random() - 0.5), (-1), (Math.random() - 0.5), 2, 0);
							world.addEntity(_entityToSpawn);
						}
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.FLAME, xx, hight, zz, (int) 1, 0.1, 0.1, 0.1, 0);
					}
					xx = (xx + dx);
					zz = (zz + dz);
				}
				a = (a + 90);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("meteortimer", ((new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "meteortimer")) - 1));

				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else {
			world.setBlockState(new BlockPos(x, y, z), Blocks.BEDROCK.getDefaultState(), 3);
		}
	}

}
