package net.mcreator.diesiraebleach.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.potion.ZarathustraPotionEffectPotionEffect;
import net.mcreator.diesiraebleach.potion.SeiibutsuPotionEffect;
import net.mcreator.diesiraebleach.potion.SeiibutsuHihiirokanePotionEffect;
import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.Map;
import java.util.Collection;

public class WazasentakuProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Wazasentaku!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DiesiraebleachModVariables.PlayerVariables())).Seiibutsu == true) {
			{
				double _setval = ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza + 1);
				entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.waza = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 1) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u653B\u6483"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 2) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u6253\u6483"), (true));
				}
			}
			if (new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == SeiibutsuPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 3) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u7A81\u9032"), (true));
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 4) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u676D\u5C04\u51FA"), (true));
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 5) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u676D\u4E71\u6253"), (true));
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).Souzou == true) {
					if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 6) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u8840\u676D\u306E\u9818\u57DF"), (true));
						}
					}
					if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 7) {
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u8594\u8587\u306E\u591C"), (true));
						}
					}
					if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza > 7) {
						{
							double _setval = 1;
							entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.waza = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u653B\u6483"), (true));
						}
					}
				} else {
					if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza > 5) {
						{
							double _setval = 1;
							entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.waza = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u653B\u6483"), (true));
						}
					}
				}
			}
			if (new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == SeiibutsuHihiirokanePotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 3) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7c\u7206\u708E"), (true));
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza > 3) {
					{
						double _setval = 1;
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.waza = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u653B\u6483"), (true));
					}
				}
			}
			if (new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == ZarathustraPotionEffectPotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity)) {
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 3) {
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7\u7A81\u9032"), (true));
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza > 3) {
					{
						double _setval = 1;
						entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.waza = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u653B\u6483"), (true));
					}
				}
			}
		}
	}
}
