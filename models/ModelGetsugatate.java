// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelGetsugatate extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;

	public ModelGetsugatate() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 1.5708F, 0.0F);
		bone_r1.setTextureOffset(7, 11).addBox(-0.5F, -13.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		bone_r1.setTextureOffset(0, 0).addBox(-0.5F, -12.0F, -4.5F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		bone_r1.setTextureOffset(10, 0).addBox(-0.5F, -9.0F, -3.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		bone_r1.setTextureOffset(0, 6).addBox(-0.5F, -8.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(0, 19).addBox(-0.5F, -3.0F, 5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(6, 19).addBox(-0.5F, -3.0F, -8.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(0, 11).addBox(-0.5F, -5.0F, 7.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(19, 11).addBox(-0.5F, -5.0F, -9.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(4, 6).addBox(-0.5F, -6.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(10, 4).addBox(-0.5F, -6.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(7, 11).addBox(-0.5F, -8.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(0, 11).addBox(-0.5F, -9.0F, 2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		bone_r1.setTextureOffset(0, 0).addBox(-0.5F, -6.0F, 4.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		bone_r1.setTextureOffset(18, 0).addBox(-0.5F, -6.0F, -8.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		bone_r1.setTextureOffset(10, 0).addBox(-0.5F, -11.0F, 3.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(18, 7).addBox(-0.5F, -11.0F, -6.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(12, 11).addBox(-0.5F, -9.0F, -8.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}