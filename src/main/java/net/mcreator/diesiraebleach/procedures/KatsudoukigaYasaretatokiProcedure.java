package net.mcreator.diesiraebleach.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.item.DoraCannonItem;
import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;

public class KatsudoukigaYasaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure KatsudoukigaYasaretatoki!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == DoraCannonItem.block) {
			{
				double _setval = ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza + 1);
				entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.waza = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 2) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u30D1\u30F3\u30C4\u30A1\u30FC\u6383\u5C04"), (false));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 3) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u9B54\u6CD5\u9663"), (false));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza > 3) {
				{
					double _setval = 2;
					entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.waza = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u30D1\u30F3\u30C4\u30A1\u30FC\u6383\u5C04"), (false));
				}
			}
		}
	}
}
