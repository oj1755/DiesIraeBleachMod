// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelKuinomori extends EntityModel<Entity> {
	private final ModelRenderer toge1;
	private final ModelRenderer toge2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer toge3;
	private final ModelRenderer cube_r2;
	private final ModelRenderer toge4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer toge5;
	private final ModelRenderer cube_r4;
	private final ModelRenderer toge6;
	private final ModelRenderer cube_r5;
	private final ModelRenderer toge7;
	private final ModelRenderer cube_r6;
	private final ModelRenderer toge8;
	private final ModelRenderer cube_r7;
	private final ModelRenderer toge9;
	private final ModelRenderer cube_r8;
	private final ModelRenderer toge10;
	private final ModelRenderer cube_r9;
	private final ModelRenderer toge11;
	private final ModelRenderer cube_r10;
	private final ModelRenderer toge12;
	private final ModelRenderer cube_r11;

	public ModelKuinomori() {
		textureWidth = 64;
		textureHeight = 64;

		toge1 = new ModelRenderer(this);
		toge1.setRotationPoint(0.0F, 24.0F, 0.0F);
		toge1.setTextureOffset(8, 20).addBox(-0.5F, -30.0F, -0.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);
		toge1.setTextureOffset(0, 20).addBox(-1.1F, -26.0F, -1.0F, 2.0F, 26.0F, 2.0F, 0.0F, false);
		toge1.setTextureOffset(16, 0).addBox(-1.6F, -21.0F, -1.5F, 3.0F, 21.0F, 3.0F, 0.0F, false);
		toge1.setTextureOffset(0, 0).addBox(-2.1F, -16.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		toge1.setTextureOffset(23, 19).addBox(-2.6F, -10.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);

		toge2 = new ModelRenderer(this);
		toge2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(toge2, 0.0F, 0.48F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.48F);
		cube_r1.setTextureOffset(23, 19).addBox(-2.6F, -7.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(-1, -1).addBox(-2.1F, -13.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(16, -1).addBox(-1.6F, -18.0F, -1.5F, 3.0F, 21.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(-1, 20).addBox(-1.1F, -23.0F, -1.0F, 2.0F, 26.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(8, 20).addBox(-0.5F, -27.0F, -0.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);

		toge3 = new ModelRenderer(this);
		toge3.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(toge3, 0.0873F, 0.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2182F);
		cube_r2.setTextureOffset(23, 19).addBox(-2.6F, -7.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 0).addBox(-2.1F, -13.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(16, 0).addBox(-1.6F, -18.0F, -1.5F, 3.0F, 21.0F, 3.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 20).addBox(-1.1F, -23.0F, -1.0F, 2.0F, 26.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(8, 20).addBox(-0.5F, -27.0F, -0.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);

		toge4 = new ModelRenderer(this);
		toge4.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge4.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.6981F, 0.4363F, -0.3491F);
		cube_r3.setTextureOffset(23, 19).addBox(-2.6F, -7.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 0).addBox(-2.1F, -13.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(16, 0).addBox(-1.6F, -18.0F, -1.5F, 3.0F, 21.0F, 3.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 20).addBox(-1.1F, -23.0F, -1.0F, 2.0F, 26.0F, 2.0F, 0.0F, false);
		cube_r3.setTextureOffset(8, 20).addBox(-0.5F, -27.0F, -0.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);

		toge5 = new ModelRenderer(this);
		toge5.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(toge5, 0.0873F, 0.0F, 0.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge5.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.6109F);
		cube_r4.setTextureOffset(23, 19).addBox(-2.6F, -7.0F, -4.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 0).addBox(-2.1F, -13.0F, -4.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(16, 0).addBox(-1.6F, -18.0F, -3.5F, 3.0F, 21.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 20).addBox(-1.1F, -23.0F, -3.0F, 2.0F, 26.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(8, 20).addBox(-0.5F, -27.0F, -2.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);

		toge6 = new ModelRenderer(this);
		toge6.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(toge6, 0.0873F, 0.0F, 0.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge6.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6981F, 0.0F, -0.2182F);
		cube_r5.setTextureOffset(23, 19).addBox(-2.6F, -7.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 0).addBox(-2.1F, -13.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		cube_r5.setTextureOffset(16, 0).addBox(-1.6F, -18.0F, -1.5F, 3.0F, 21.0F, 3.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 20).addBox(-1.1F, -23.0F, -1.0F, 2.0F, 26.0F, 2.0F, 0.0F, false);
		cube_r5.setTextureOffset(8, 20).addBox(-0.5F, -27.0F, -0.5F, 1.0F, 30.0F, 1.0F, 0.0F, false);

		toge7 = new ModelRenderer(this);
		toge7.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge7.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.9163F, 0.3054F, -1.0036F);
		cube_r6.setTextureOffset(23, 19).addBox(-2.6F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		cube_r6.setTextureOffset(0, 0).addBox(-2.1F, -11.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
		cube_r6.setTextureOffset(16, 0).addBox(-1.6F, -16.0F, -1.5F, 3.0F, 16.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(0, 20).addBox(-1.1F, -21.0F, -1.0F, 2.0F, 21.0F, 2.0F, 0.0F, false);
		cube_r6.setTextureOffset(8, 20).addBox(-0.5F, -25.0F, -0.5F, 1.0F, 25.0F, 1.0F, 0.0F, false);

		toge8 = new ModelRenderer(this);
		toge8.setRotationPoint(1.0F, 20.0F, 2.0F);
		setRotationAngle(toge8, 0.0F, 0.0F, 0.2618F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge8.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3927F, 0.0436F, 0.0F);
		cube_r7.setTextureOffset(23, 19).addBox(0.4F, -1.0F, -10.5F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(0.9F, -7.0F, -10.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
		cube_r7.setTextureOffset(16, 0).addBox(1.4F, -12.0F, -9.5F, 3.0F, 15.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 20).addBox(1.9F, -17.0F, -9.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(8, 20).addBox(2.5F, -21.0F, -8.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);

		toge9 = new ModelRenderer(this);
		toge9.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge9.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.4363F, 0.0436F, 0.3927F);
		cube_r8.setTextureOffset(23, 19).addBox(0.4F, -3.0F, 0.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(0.9F, -9.0F, 1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		cube_r8.setTextureOffset(16, 0).addBox(1.4F, -14.0F, 1.5F, 3.0F, 17.0F, 3.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 20).addBox(1.9F, -19.0F, 2.0F, 2.0F, 22.0F, 2.0F, 0.0F, false);
		cube_r8.setTextureOffset(8, 20).addBox(2.5F, -23.0F, 2.5F, 1.0F, 26.0F, 1.0F, 0.0F, false);

		toge10 = new ModelRenderer(this);
		toge10.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge10.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3054F, 0.0436F, -0.6109F);
		cube_r9.setTextureOffset(0, 0).addBox(-4.1F, -13.0F, 1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		cube_r9.setTextureOffset(16, 0).addBox(-3.6F, -18.0F, 1.5F, 3.0F, 17.0F, 3.0F, 0.0F, false);
		cube_r9.setTextureOffset(0, 20).addBox(-3.1F, -23.0F, 2.0F, 2.0F, 22.0F, 2.0F, 0.0F, false);
		cube_r9.setTextureOffset(8, 20).addBox(-2.5F, -27.0F, 2.5F, 1.0F, 26.0F, 1.0F, 0.0F, false);
		cube_r9.setTextureOffset(23, 19).addBox(-4.6F, -7.0F, 0.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);

		toge11 = new ModelRenderer(this);
		toge11.setRotationPoint(2.0F, 22.0F, 0.0F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge11.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3927F, 0.3491F, -0.5672F);
		cube_r10.setTextureOffset(23, 19).addBox(-6.6F, -1.0F, -7.5F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 0).addBox(-6.1F, -7.0F, -7.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
		cube_r10.setTextureOffset(16, 0).addBox(-5.6F, -12.0F, -6.5F, 3.0F, 15.0F, 3.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 20).addBox(-5.1F, -17.0F, -6.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);
		cube_r10.setTextureOffset(8, 20).addBox(-4.5F, -21.0F, -5.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);

		toge12 = new ModelRenderer(this);
		toge12.setRotationPoint(3.0F, 23.0F, 3.0F);
		setRotationAngle(toge12, 0.3927F, 0.2182F, 0.3054F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		toge12.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.4363F, 0.0436F, 0.3927F);
		cube_r11.setTextureOffset(23, 19).addBox(0.4F, -3.0F, -7.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(0, 0).addBox(0.9F, -9.0F, -7.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		cube_r11.setTextureOffset(16, 0).addBox(1.4F, -14.0F, -6.5F, 3.0F, 17.0F, 3.0F, 0.0F, false);
		cube_r11.setTextureOffset(0, 20).addBox(1.9F, -19.0F, -6.0F, 2.0F, 22.0F, 2.0F, 0.0F, false);
		cube_r11.setTextureOffset(8, 20).addBox(2.5F, -23.0F, -5.5F, 1.0F, 26.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		toge1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge5.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge6.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge7.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge8.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge9.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge10.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge11.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		toge12.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}