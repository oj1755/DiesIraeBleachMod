package net.mcreator.diesiraebleach.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class BeiKeiseihanaaitemuwoShoudeChituteiruJiannoteitukuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				DiesiraebleachMod.LOGGER
						.warn("Failed to load dependency itemstack for procedure BeiKeiseihanaaitemuwoShoudeChituteiruJiannoteituku!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).shrink((int) 5);
	}
}
