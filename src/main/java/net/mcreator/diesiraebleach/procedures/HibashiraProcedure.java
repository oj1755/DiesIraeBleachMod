package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.SamielExplosionParticle;
import net.mcreator.diesiraebleach.particle.HibashoraparticleParticle;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class HibashiraProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Hibashira!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Hibashira!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Hibashira!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Hibashira!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Hibashira!");
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
		double l = 0;
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (50 / 2d), y - (50 / 2d), z - (50 / 2d), x + (50 / 2d), y + (50 / 2d), z + (50 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				xx = 1;
				if (!(entity == entityiterator)) {
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(SamielExplosionParticle.particle, (entityiterator.getPosX()),
								(entityiterator.getPosY() - 1), (entityiterator.getPosZ()), (int) 30, 0.1, 0.1, 0.1, 0.1);
					}
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos(entityiterator.getPosX(), entityiterator.getPosY(), entityiterator.getPosZ()),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("diesiraebleach:hellfire")),
										SoundCategory.NEUTRAL, (float) 0.5, (float) 0.5);
					} else {
						((World) world).playSound((entityiterator.getPosX()), (entityiterator.getPosY()), (entityiterator.getPosZ()),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("diesiraebleach:hellfire")),
								SoundCategory.NEUTRAL, (float) 0.5, (float) 0.5, false);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) (entityiterator.getPosX()), (int) (entityiterator.getPosY() - 1),
								(int) (entityiterator.getPosZ()), (float) 4, Explosion.Mode.NONE);
					}
					for (int index0 = 0; index0 < (int) (50); index0++) {
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(HibashoraparticleParticle.particle, (entityiterator.getPosX()),
									(entityiterator.getPosY() + xx), (entityiterator.getPosZ()), (int) 10, 0.1, 0.1, 0.1, 0);
						}
						xx = (xx + 1);
					}
					entityiterator.attackEntityFrom(DamageSource.LAVA, (float) 10);
					entityiterator.setFire((int) 15);
				}
			}
		}
	}
}
