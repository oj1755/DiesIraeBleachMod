package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.BloodsweeprightParticle;
import net.mcreator.diesiraebleach.particle.BloodsweepleftParticle;
import net.mcreator.diesiraebleach.particle.BloodsweepParticle;
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
		r = (entity.rotationYaw);
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).swing(Hand.OFF_HAND, true);
		}
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:kaze")),
					SoundCategory.NEUTRAL, (float) 0.5, (float) 2);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:kaze")),
					SoundCategory.NEUTRAL, (float) 0.5, (float) 2, false);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(BloodsweepParticle.particle, (x + MathHelper.nextDouble(new Random(), -1, 1)),
					(y + MathHelper.nextDouble(new Random(), 0, 2)), (z + MathHelper.nextDouble(new Random(), -1, 1)), (int) 3, 0.1, 0.1, 0.1, 0);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(BloodsweepleftParticle.particle, (x + MathHelper.nextDouble(new Random(), -1, 1)),
					(y + MathHelper.nextDouble(new Random(), 0, 2)), (z + MathHelper.nextDouble(new Random(), -1, 1)), (int) 3, 0.1, 0.1, 0.1, 0);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(BloodsweeprightParticle.particle, (x + MathHelper.nextDouble(new Random(), -1, 1)),
					(y + MathHelper.nextDouble(new Random(), 0, 2)), (z + MathHelper.nextDouble(new Random(), -1, 1)), (int) 3, 0.1, 0.1, 0.1, 0);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (3 / 2d), y - (3 / 2d), z - (3 / 2d), x + (3 / 2d), y + (3 / 2d), z + (3 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (entityiterator instanceof LivingEntity) {
						entityiterator.attackEntityFrom(DamageSource.GENERIC,
								(float) (2 + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new DiesiraebleachModVariables.PlayerVariables())).Killsoul / 100));
					}
				}
			}
		}
	}
}
