package net.mcreator.diesiraebleach.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.particle.ZarathustraparticleParticle;
import net.mcreator.diesiraebleach.item.MarglittoJudisItem;
import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class ZarathustraProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Zarathustra!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Zarathustra!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Zarathustra!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Zarathustra!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Zarathustra!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double a = 0;
		double r = 0;
		double b = 0;
		entity.setSprinting((true));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 200, (int) 10));
		if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DiesiraebleachModVariables.PlayerVariables())).Souzou == true
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == MarglittoJudisItem.block) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:timestop")),
						SoundCategory.NEUTRAL, (float) 0.1, (float) 3);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("diesiraebleach:timestop")),
						SoundCategory.NEUTRAL, (float) 0.1, (float) 3, false);
			}
			{
				List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
						new AxisAlignedBB(x - (1.5 / 2d), (y + 1) - (1.5 / 2d), z - (1.5 / 2d), x + (1.5 / 2d), (y + 1) + (1.5 / 2d), z + (1.5 / 2d)),
						null).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, (y + 1), z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ArrowEntity) {
						entityiterator.getPersistentData().putBoolean("barrier", (true));
					}
					if (entityiterator instanceof LivingEntity) {
						entityiterator.getPersistentData().putBoolean("barrier", (true));
					}
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 5, (int) 100, (false), (false)));
			r = 1.5;
			a = (Math.random() * 12);
			b = 90;
			for (int index0 = 0; index0 < (int) (30); index0++) {
				for (int index1 = 0; index1 < (int) (16); index1++) {
					world.addParticle(ZarathustraparticleParticle.particle, (x - r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))),
							((y + 1) - r * Math.sin(Math.toRadians(b))), (z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))), 0, 0,
							0);
					b = (b + 12);
				}
				b = 90;
				a = (a + 12);
			}
			{
				List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
						new AxisAlignedBB(x - (4 / 2d), (y + 1) - (4 / 2d), z - (4 / 2d), x + (4 / 2d), (y + 1) + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, (y + 1), z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getPersistentData().getBoolean("barrier") != true) {
						if (!(entityiterator == entity)) {
							entityiterator.setMotion(((-1.5) * entityiterator.getMotion().getX()), ((-1.5) * entityiterator.getMotion().getY()),
									((-1.5) * entityiterator.getMotion().getZ()));
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 200, (int) 100));
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 200, (int) 100));
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 200, (int) 100));
							if (entityiterator instanceof LivingEntity)
								((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, (int) 200, (int) (-10)));
							entityiterator.setNoGravity((false));
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
	}
}
