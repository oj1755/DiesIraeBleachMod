
package net.mcreator.diesiraebleach.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.diesiraebleach.procedures.MakinaGloveenteiteigaaitemuwoZhentutaShiProcedure;
import net.mcreator.diesiraebleach.DiesiraebleachModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

@DiesiraebleachModElements.ModElement.Tag
public class MakinaGloveItem extends DiesiraebleachModElements.ModElement {
	@ObjectHolder("diesiraebleach:makina_glove")
	public static final Item block = null;

	public MakinaGloveItem(DiesiraebleachModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
				boolean retval = super.onEntitySwing(itemstack, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;

				MakinaGloveenteiteigaaitemuwoZhentutaShiProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("makina_glove"));
	}

	private static class ItemToolCustom extends Item {
		protected ItemToolCustom() {
			super(new Item.Properties().group(ItemGroup.COMBAT).maxDamage(99999).isImmuneToFire());
		}

		@Override
		public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
			if (blockstate.getBlock() == Blocks.AIR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.VOID_AIR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CAVE_AIR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRANITE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_GRANITE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRANITE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_GRANITE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRANITE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_GRANITE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRANITE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DIORITE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DIORITE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DIORITE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DIORITE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_DIORITE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_DIORITE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_DIORITE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ANDESITE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ANDESITE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ANDESITE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ANDESITE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_ANDESITE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_ANDESITE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_ANDESITE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_STONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRASS_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRASS_PATH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MYCELIUM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DIRT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COARSE_DIRT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PODZOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COBBLESTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOSSY_COBBLESTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOSSY_COBBLESTONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOSSY_COBBLESTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_PLANKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_PLANKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_PLANKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_PLANKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_PLANKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_PLANKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_PLANKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_PLANKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SUGAR_CANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BEDROCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SAND)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_SAND)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAVEL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WATER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WATER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BUBBLE_COLUMN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LAVA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LAVA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGMA_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OBSIDIAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRYING_OBSIDIAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACKSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACKSTONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACKSTONE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACKSTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHISELED_POLISHED_BLACKSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COAL_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.IRON_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GOLD_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LAPIS_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DIAMOND_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.EMERALD_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_QUARTZ_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_GOLD_ORE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GILDED_BLACKSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.IRON_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GOLD_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LAPIS_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DIAMOND_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.EMERALD_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHERITE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_QUARTZ)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHISELED_QUARTZ_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.QUARTZ_PILLAR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.QUARTZ_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.QUARTZ_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_QUARTZ_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_QUARTZ_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SLIME_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ANCIENT_DEBRIS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_OAK_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_SPRUCE_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_BIRCH_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_JUNGLE_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_ACACIA_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_DARK_OAK_LOG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_WARPED_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_CRIMSON_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_HYPHAE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_HYPHAE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_OAK_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_SPRUCE_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_BIRCH_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_JUNGLE_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_ACACIA_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_DARK_OAK_WOOD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_WARPED_HYPHAE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRIPPED_CRIMSON_HYPHAE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_LEAVES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_LEAVES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_LEAVES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_LEAVES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_LEAVES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_LEAVES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_LEAVES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_LEAVES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPONGE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WET_SPONGE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SANDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHISELED_SANDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CUT_SANDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SANDSTONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_SANDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_SANDSTONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_SANDSTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CUT_SANDSTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SANDSTONE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_SANDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHISELED_RED_SANDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CUT_RED_SANDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_SANDSTONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_RED_SANDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_RED_SANDSTONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_RED_SANDSTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CUT_RED_SANDSTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_SANDSTONE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NOTE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RAIL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POWERED_RAIL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DETECTOR_RAIL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACTIVATOR_RAIL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_BED)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COBWEB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BUSH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BUSH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FERN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PISTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STICKY_PISTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PISTON_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOVING_PISTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DANDELION)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POPPY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_ORCHID)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ALLIUM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.AZURE_BLUET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_TULIP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_TULIP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_TULIP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_TULIP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OXEYE_DAISY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CORNFLOWER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LILY_OF_THE_VALLEY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WITHER_ROSE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SUNFLOWER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LILAC)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TALL_GRASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LARGE_FERN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ROSE_BUSH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PEONY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_MUSHROOM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_MUSHROOM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_FUNGUS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_FUNGUS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_MUSHROOM_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_MUSHROOM_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_WART_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MUSHROOM_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BRICK_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TNT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BOOKSHELF)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TORCH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WALL_TORCH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SOUL_TORCH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SOUL_WALL_TORCH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FIRE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SOUL_FIRE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LANTERN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SOUL_LANTERN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHAIN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CAMPFIRE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SOUL_CAMPFIRE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPAWNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COBBLESTONE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BRICK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE_BRICK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_BRICK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.QUARTZ_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPUR_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHEST)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TRAPPED_CHEST)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ENDER_CHEST)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRAFTING_TABLE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHEAT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FARMLAND)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FURNACE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_WALL_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_WALL_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_WALL_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_WALL_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_WALL_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_WALL_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_WALL_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_WALL_SIGN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.IRON_DOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.IRON_TRAPDOOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LADDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LEVER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_BUTTON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TRIPWIRE_HOOK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TRIPWIRE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DAYLIGHT_DETECTOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DAYLIGHT_DETECTOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_TORCH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_WALL_TORCH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_TORCH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_WIRE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REPEATER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REPEATER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COMPARATOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COMPARATOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_LAMP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REDSTONE_LAMP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DISPENSER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DROPPER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OBSERVER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HOPPER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TARGET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COMMAND_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.REPEATING_COMMAND_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHAIN_COMMAND_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SNOW)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SNOW_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ICE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PACKED_ICE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FROSTED_ICE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_ICE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CACTUS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CLAY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUKEBOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_FENCE_GATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_FENCE_GATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_FENCE_GATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_FENCE_GATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_FENCE_GATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_FENCE_GATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_FENCE_GATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_FENCE_GATE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_BRICK_FENCE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHISELED_NETHER_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRACKED_NETHER_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_NETHER_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_BRICK_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_NETHER_BRICK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_NETHER_BRICK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_NETHER_BRICK_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHERRACK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_NYLIUM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_NYLIUM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SOUL_SAND)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SOUL_SOIL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GLOWSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SHROOMLIGHT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BONE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_WART)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_WART_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CAKE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE_BRICK_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOSSY_STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOSSY_STONE_BRICK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOSSY_STONE_BRICK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOSSY_STONE_BRICK_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRACKED_STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHISELED_STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.IRON_BARS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MELON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MELON_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ATTACHED_MELON_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PUMPKIN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CARVED_PUMPKIN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JACK_O_LANTERN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PUMPKIN_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ATTACHED_PUMPKIN_STEM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SWEET_BERRY_BUSH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.VINE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LILY_PAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ENCHANTING_TABLE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BREWING_STAND)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CAULDRON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_PORTAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_PORTAL_FRAME)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_GATEWAY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_STONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_STONE_BRICK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_STONE_BRICK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_STONE_BRICK_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.END_ROD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPUR_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPUR_PILLAR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPUR_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPUR_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BEETROOTS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHORUS_PLANT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHORUS_FLOWER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DRAGON_EGG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.INFESTED_STONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.INFESTED_COBBLESTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.INFESTED_STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.INFESTED_MOSSY_STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.INFESTED_CRACKED_STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.INFESTED_CHISELED_STONE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.OAK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SPRUCE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BIRCH_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JUNGLE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ACACIA_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_OAK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOOTH_STONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SANDSTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PETRIFIED_OAK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COBBLESTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BRICK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONE_BRICK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_BRICK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.QUARTZ_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_SANDSTONE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COCOA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_PORTAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ANVIL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CHIPPED_ANVIL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DAMAGED_ANVIL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BEACON)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COBBLESTONE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MOSSY_COBBLESTONE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FLOWER_POT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_OAK_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_SPRUCE_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_BIRCH_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_JUNGLE_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_ACACIA_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_DARK_OAK_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_FERN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_DANDELION)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_POPPY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_BLUE_ORCHID)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_ALLIUM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_AZURE_BLUET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_RED_TULIP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_ORANGE_TULIP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_WHITE_TULIP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_PINK_TULIP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_OXEYE_DAISY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_CORNFLOWER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_LILY_OF_THE_VALLEY)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_WITHER_ROSE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_RED_MUSHROOM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_BROWN_MUSHROOM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_DEAD_BUSH)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_CACTUS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_BAMBOO)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_CRIMSON_FUNGUS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_WARPED_FUNGUS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_CRIMSON_ROOTS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTTED_WARPED_ROOTS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CARROTS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POTATOES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HAY_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SKELETON_SKULL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WITHER_SKELETON_SKULL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ZOMBIE_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PLAYER_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CREEPER_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DRAGON_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SKELETON_WALL_SKULL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WITHER_SKELETON_WALL_SKULL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ZOMBIE_WALL_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PLAYER_WALL_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CREEPER_WALL_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DRAGON_WALL_HEAD)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_WOOL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_GLAZED_TERRACOTTA)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_CONCRETE_POWDER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_CONCRETE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_CARPET)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_STAINED_GLASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_STAINED_GLASS_PANE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SEA_LANTERN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PRISMARINE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PRISMARINE_BRICKS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_PRISMARINE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PRISMARINE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PRISMARINE_BRICK_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_PRISMARINE_STAIRS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PRISMARINE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PRISMARINE_BRICK_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DARK_PRISMARINE_SLAB)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PRISMARINE_WALL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_SHULKER_BOX)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WHITE_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.ORANGE_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.MAGENTA_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_BLUE_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.YELLOW_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIME_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PINK_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRAY_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LIGHT_GRAY_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CYAN_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.PURPLE_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLUE_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BROWN_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GREEN_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RED_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLACK_WALL_BANNER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BARRIER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRUCTURE_VOID)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRUCTURE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRUCTURE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRUCTURE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRUCTURE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STRUCTURE_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.JIGSAW)
				return 99999f;
			if (blockstate.getBlock() == Blocks.KELP)
				return 99999f;
			if (blockstate.getBlock() == Blocks.KELP_PLANT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SEAGRASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TALL_SEAGRASS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SEA_PICKLE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TURTLE_EGG)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BAMBOO_SAPLING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BAMBOO)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_TUBE_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BRAIN_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BUBBLE_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_FIRE_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_HORN_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TUBE_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BRAIN_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BUBBLE_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FIRE_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HORN_CORAL_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_TUBE_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BRAIN_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BUBBLE_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_FIRE_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_HORN_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TUBE_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BRAIN_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BUBBLE_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FIRE_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HORN_CORAL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_TUBE_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BRAIN_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BUBBLE_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_FIRE_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_HORN_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TUBE_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BRAIN_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BUBBLE_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FIRE_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HORN_CORAL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_TUBE_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BRAIN_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_BUBBLE_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_FIRE_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DEAD_HORN_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TUBE_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BRAIN_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BUBBLE_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FIRE_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HORN_CORAL_WALL_FAN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.DRIED_KELP_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CONDUIT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SCAFFOLDING)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BELL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LOOM)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BARREL)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMOKER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BLAST_FURNACE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CARTOGRAPHY_TABLE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.FLETCHING_TABLE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.GRINDSTONE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LECTERN)
				return 99999f;
			if (blockstate.getBlock() == Blocks.SMITHING_TABLE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.STONECUTTER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.COMPOSTER)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BEEHIVE)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BEE_NEST)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HONEY_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.HONEYCOMB_BLOCK)
				return 99999f;
			if (blockstate.getBlock() == Blocks.BASALT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.POLISHED_BASALT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WARPED_ROOTS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.NETHER_SPROUTS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WEEPING_VINES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.WEEPING_VINES_PLANT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TWISTING_VINES)
				return 99999f;
			if (blockstate.getBlock() == Blocks.TWISTING_VINES_PLANT)
				return 99999f;
			if (blockstate.getBlock() == Blocks.CRIMSON_ROOTS)
				return 99999f;
			if (blockstate.getBlock() == Blocks.RESPAWN_ANCHOR)
				return 99999f;
			if (blockstate.getBlock() == Blocks.LODESTONE)
				return 99999f;
			return 1;
		}

		@Override
		public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
			stack.damageItem(1, entityLiving, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damageItem(2, attacker, i -> i.sendBreakAnimation(EquipmentSlotType.MAINHAND));
			return true;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
			if (equipmentSlot == EquipmentSlotType.MAINHAND) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot));
				builder.put(Attributes.ATTACK_DAMAGE,
						new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 99997f, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_SPEED,
						new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", 96, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot);
		}
	}
}
