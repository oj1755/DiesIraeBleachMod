package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.SlashsweepParticle;
import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class MarglittoslashProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Marglittoslash!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Marglittoslash!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Marglittoslash!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Marglittoslash!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Marglittoslash!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double deg = 0;
		double r = 0;
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
					new AxisAlignedBB((x + r * Math.sin(Math.toRadians(deg))) - (4 / 2d), y - (4 / 2d),
							(z + r * Math.cos(Math.toRadians(deg))) - (4 / 2d), (x + r * Math.sin(Math.toRadians(deg))) + (4 / 2d), y + (4 / 2d),
							(z + r * Math.cos(Math.toRadians(deg))) + (4 / 2d)),
					null).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((x + r * Math.sin(Math.toRadians(deg))), y, (z + r * Math.cos(Math.toRadians(deg)))))
					.collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					entityiterator.attackEntityFrom(DamageSource.GENERIC,
							(float) (3 + (entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new DiesiraebleachModVariables.PlayerVariables())).Killsoul / 100));
				}
			}
		}
		deg = (entity.rotationYaw + 90);
		r = 1;
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:speed1")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:speed1")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:kenzangeki")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:kenzangeki")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(SlashsweepParticle.particle, (x + r * Math.sin(Math.toRadians(deg))), (y + 1),
					(z + r * Math.cos(Math.toRadians(deg))), (int) 5, 0.1, 0.1, 0.1, 0);
		}
	}
}
