package net.mcreator.diesiraebleach.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.diesiraebleach.potion.LevitationfirepotionPotionEffect;
import net.mcreator.diesiraebleach.DiesiraebleachModVariables;
import net.mcreator.diesiraebleach.DiesiraebleachMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.AbstractMap;

public class WazahatsudouProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency world for procedure Wazahatsudou!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency x for procedure Wazahatsudou!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency y for procedure Wazahatsudou!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency z for procedure Wazahatsudou!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesiraebleachMod.LOGGER.warn("Failed to load dependency entity for procedure Wazahatsudou!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DiesiraebleachModVariables.PlayerVariables())).Seiibutsu == true) {
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 1) {
				JakukougekiProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u653B\u6483"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 2) {
				DagekiProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u6253\u6483"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).Yaminotamamono == true) {
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 3) {
					TosshinProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
									new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u7A81\u9032"), (true));
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 4) {
					BeikatsudouProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
									new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u676D\u5C04\u51FA"), (true));
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 5) {
					KuirandaProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
									new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u676D\u4E71\u6253"), (true));
					}
				}
				if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DiesiraebleachModVariables.PlayerVariables())).Souzou == true) {
					if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 6) {
						KuibakuhaProcedure.executeProcedure(Stream
								.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
										new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
										new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u8840\u676D\u306E\u9818\u57DF"), (true));
						}
					}
					if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 7) {
						BaranoyoruProcedure.executeProcedure(Stream
								.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
										new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
										new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u8594\u8587\u306E\u591C"), (true));
						}
					}
					if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 8) {
						YamigakureProcedure.executeProcedure(Stream
								.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
										new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
										new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
						if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u95C7\u96A0\u308C"), (true));
						}
					}
				}
			}
		}
		if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DiesiraebleachModVariables.PlayerVariables())).Hihiirokane == true) {
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 3) {
				BakuenProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u7206\u708E"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 4) {
				FireballmagicProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u706B\u7403"), (true));
				}
			}
		}
		if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DiesiraebleachModVariables.PlayerVariables())).MarglittoJudis == true) {
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 3) {
				TosshinProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A73\u7A81\u9032"), (true));
				}
			}
		}
		if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DiesiraebleachModVariables.PlayerVariables())).DerfreischeSamiel == true) {
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 3) {
				TosshinProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u7A81\u9032"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 4) {
				BakuhaProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u7206\u7834"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 5) {
				FireballmagicProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u706B\u7403"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 6) {
				KibakuProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u706B\u7403\u53EC\u559A"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 7) {
				PanzerhasshaProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u30D1\u30F3\u30C4\u30A1\u30FC\u6383\u5C04"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 8) {
				Schmeizer2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u30B7\u30E5\u30DE\u30A4\u30B6\u30FC\u6383\u5C04"),
							(true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 9) {
				HibashiraProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
						new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u706B\u67F1"), (true));
				}
			}
			if ((entity.getCapability(DiesiraebleachModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new DiesiraebleachModVariables.PlayerVariables())).waza == 10) {
				if (new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == LevitationfirepotionPotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity)) {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(LevitationfirepotionPotionEffect.potion);
					}
				} else {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(LevitationfirepotionPotionEffect.potion, (int) 1e+26, (int) 1));
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A74\u7A7A\u4E2D\u6D6E\u904A"), (true));
					}
				}
			}
		}
	}
}
