
package net.mcreator.diesiraebleach.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.diesiraebleach.DiesiraebleachModElements;

@DiesiraebleachModElements.ModElement.Tag
public class BeiKuiItemItem extends DiesiraebleachModElements.ModElement {
	@ObjectHolder("diesiraebleach:bei_kui_item")
	public static final Item block = null;

	public BeiKuiItemItem(DiesiraebleachModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bei_kui_item");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.SPEAR;
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
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
