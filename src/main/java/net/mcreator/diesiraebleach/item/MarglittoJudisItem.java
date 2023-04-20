
package net.mcreator.diesiraebleach.item;

import net.minecraft.entity.ai.attributes.Attributes;

@DiesiraebleachModElements.ModElement.Tag
public class MarglittoJudisItem extends DiesiraebleachModElements.ModElement {

	@ObjectHolder("diesiraebleach:marglitto_judis")
	public static final Item block = null;

	public MarglittoJudisItem(DiesiraebleachModElements instance) {
		super(instance, 67);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("marglitto_judis");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
