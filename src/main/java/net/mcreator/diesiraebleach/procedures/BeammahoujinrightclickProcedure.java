package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.Hand;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class BeammahoujinrightclickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Beammahoujinrightclick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Beammahoujinrightclick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Beammahoujinrightclick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Beammahoujinrightclick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Beammahoujinrightclick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency itemstack for procedure Beammahoujinrightclick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double a = 0;
		double b = 0;
		double c = 0;
		double i = 0;
		double r = 0;
		double s = 0;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		double z1 = 0;
		double y1 = 0;
		double z2 = 0;
		double x1 = 0;
		double y2 = 0;
		double x2 = 0;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
		}
		if (itemstack.getOrCreateTag().getDouble("kill") <= 0) {
			itemstack.getOrCreateTag().putDouble("kill", 30);
			itemstack.getOrCreateTag().putDouble("killr", 4);
			itemstack.getOrCreateTag().putDouble("killa", (entity.rotationYaw));
			itemstack.getOrCreateTag().putDouble("killb", (entity.rotationPitch));
			itemstack.getOrCreateTag().putDouble("killx", x);
			itemstack.getOrCreateTag().putDouble("killy", y);
			itemstack.getOrCreateTag().putDouble("killz", z);
			r = 1;
			s = 2;
			a = (entity.rotationYaw);
			b = (entity.rotationPitch);
			c = 0;
			for (int index0 = 0; index0 < (int) (60); index0++) {
				world.addParticle(ParticleTypes.END_ROD,
						(x - (r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))
								+ s * Math.cos(Math.toRadians(c)) * Math.cos(Math.toRadians(b - 90)) * Math.sin(Math.toRadians(a))
								+ s * Math.sin(Math.toRadians(c)) * Math.sin(Math.toRadians(a - 90)))),
						((y + 1) - (r * Math.sin(Math.toRadians(b)) + s * Math.cos(Math.toRadians(c)) * Math.sin(Math.toRadians(b - 90)))),
						(z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))
								+ s * Math.cos(Math.toRadians(c)) * Math.cos(Math.toRadians(b - 90)) * Math.cos(Math.toRadians(a))
								+ s * Math.sin(Math.toRadians(c)) * Math.cos(Math.toRadians(a - 90))),
						0, 0, 0);
				c = (c + 6);
			}
			c = 0;
			i = 50;
			for (int index1 = 0; index1 < (int) (5); index1++) {
				c = c;
				x1 = (x - (r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))
						+ s * Math.cos(Math.toRadians(c)) * Math.cos(Math.toRadians(b - 90)) * Math.sin(Math.toRadians(a))
						+ s * Math.sin(Math.toRadians(c)) * Math.sin(Math.toRadians(a - 90))));
				x2 = (x - (r * Math.cos(Math.toRadians(b)) * Math.sin(Math.toRadians(a))
						+ s * Math.cos(Math.toRadians(c + 144)) * Math.cos(Math.toRadians(b - 90)) * Math.sin(Math.toRadians(a))
						+ s * Math.sin(Math.toRadians(c + 144)) * Math.sin(Math.toRadians(a - 90))));
				y1 = ((y + 1) - (r * Math.sin(Math.toRadians(b)) + s * Math.cos(Math.toRadians(c)) * Math.sin(Math.toRadians(b - 90))));
				y2 = ((y + 1) - (r * Math.sin(Math.toRadians(b)) + s * Math.cos(Math.toRadians(c + 144)) * Math.sin(Math.toRadians(b - 90))));
				z1 = (z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))
						+ s * Math.cos(Math.toRadians(c)) * Math.cos(Math.toRadians(b - 90)) * Math.cos(Math.toRadians(a))
						+ s * Math.sin(Math.toRadians(c)) * Math.cos(Math.toRadians(a - 90)));
				z2 = (z + r * Math.cos(Math.toRadians(b)) * Math.cos(Math.toRadians(a))
						+ s * Math.cos(Math.toRadians(c + 144)) * Math.cos(Math.toRadians(b - 90)) * Math.cos(Math.toRadians(a))
						+ s * Math.sin(Math.toRadians(c + 144)) * Math.cos(Math.toRadians(a - 90)));
				dx = ((x2 - x1) / i);
				dy = ((y2 - y1) / i);
				dz = ((z2 - z1) / i);
				for (int index2 = 0; index2 < (int) (i); index2++) {
					world.addParticle(ParticleTypes.END_ROD, x1, y1, z1, 0, 0, 0);
					x1 = (x1 + dx);
					y1 = (y1 + dy);
					z1 = (z1 + dz);
				}
				c = (c + 72);
			}
		}
	}
}
