package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class BeammahoujinuptickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Beammahoujinuptick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Beammahoujinuptick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double a = 0;
		double r = 0;
		double b = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
					.getDouble("kill") > 0) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
						.getDouble("kill") > 25) {
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
							.putDouble("kill", (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getOrCreateTag().getDouble("kill") - 1));
				} else {
					r = (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
							.getDouble("killr"));
					a = (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
							.getDouble("killa"));
					b = (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
							.getDouble("killb"));
					{
						List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
										.getDouble("killx") - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))) - (4 / 2d),
								((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getOrCreateTag().getDouble("killy") + 1) - r * Math.sin(Math.toRadians(b))) - (4 / 2d),
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
										.getDouble("killz") + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))) - (4 / 2d),
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
										.getDouble("killx") - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))) + (4 / 2d),
								((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getOrCreateTag().getDouble("killy") + 1) - r * Math.sin(Math.toRadians(b))) + (4 / 2d),
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
										.getDouble("killz") + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))) + (4 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(
										(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getOrCreateTag().getDouble("killx") - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))),
										((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getOrCreateTag().getDouble("killy") + 1) - r * Math.sin(Math.toRadians(b))),
										(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
												.getOrCreateTag().getDouble("killz")
												+ r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a)))))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 10);
						}
					}
					for (int index0 = 0; index0 < (int) (50); index0++) {
						world.addParticle(KillparticleParticle.particle,
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
										.getDouble("killx") - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))),
								((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getOrCreateTag().getDouble("killy") + 1) - r * Math.sin(Math.toRadians(b))),
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
										.getDouble("killz") + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))),
								0, 0, 0);
						r = (r + 0.02);
					}
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
							.putDouble("killr", r);
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getOrCreateTag()
							.putDouble("kill", (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getOrCreateTag().getDouble("kill") - 1));
				}
			}
		}
	}
}
