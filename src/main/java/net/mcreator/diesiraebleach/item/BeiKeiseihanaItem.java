
package net.mcreator.diesiraebleach.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.diesiraebleach.procedures.BeiKeiseihanaaitemuwoShoudeChituteiruJiannoteitukuProcedure;
import net.mcreator.diesiraebleach.DiesiraebleachModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@DiesiraebleachModElements.ModElement.Tag
public class BeiKeiseihanaItem extends DiesiraebleachModElements.ModElement {
	@ObjectHolder("diesiraebleach:bei_keiseihana")
	public static final Item block = null;

	public BeiKeiseihanaItem(DiesiraebleachModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bei_keiseihana");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (selected)

				BeiKeiseihanaaitemuwoShoudeChituteiruJiannoteitukuProcedure
						.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("itemstack", itemstack)).collect(HashMap::new,
								(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
		}
	}
}
