
package net.mcreator.diesiraebleach.item;

import net.minecraft.entity.ai.attributes.Attributes;

@DiesiraebleachModElements.ModElement.Tag
public class DoraCannonItem extends DiesiraebleachModElements.ModElement {

	@ObjectHolder("diesiraebleach:dora_cannon")
	public static final Item block = null;

	public DoraCannonItem(DiesiraebleachModElements instance) {
		super(instance, 10);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("dora_cannon");
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
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			BakuhaProcedure.executeProcedure(Collections.emptyMap());
			return ar;
		}

	}

}
