// Made with Blockbench 4.7.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFireballsmall extends EntityModel<Entity> {
	private final ModelRenderer fireballsmall;
	private final ModelRenderer octagon2;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer octagon;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer octagon3;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer octagon6;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer octagon7;
	private final ModelRenderer octagon_r5;
	private final ModelRenderer octagon8;
	private final ModelRenderer octagon_r6;
	private final ModelRenderer octagon9;
	private final ModelRenderer octagon_r7;
	private final ModelRenderer octagon4;
	private final ModelRenderer octagon_r8;
	private final ModelRenderer octagon5;
	private final ModelRenderer octagon_r9;

	public ModelFireballsmall() {
		textureWidth = 64;
		textureHeight = 64;

		fireballsmall = new ModelRenderer(this);
		fireballsmall.setRotationPoint(0.0F, 24.0F, 0.0F);

		octagon2 = new ModelRenderer(this);
		octagon2.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon2);
		setRotationAngle(octagon2, 0.0F, -0.3491F, 0.0F);
		octagon2.setTextureOffset(43, 24).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon2.setTextureOffset(30, 40).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon2.setTextureOffset(24, 6).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon2.setTextureOffset(16, 30).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon2.addChild(octagon_r1);
		setRotationAngle(octagon_r1, -0.7854F, 0.0F, 0.0F);
		octagon_r1.setTextureOffset(16, 0).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r1.setTextureOffset(32, 30).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r1.setTextureOffset(47, 34).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r1.setTextureOffset(22, 49).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);

		octagon = new ModelRenderer(this);
		octagon.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon);
		octagon.setTextureOffset(43, 29).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon.setTextureOffset(36, 40).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon.setTextureOffset(24, 11).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon.setTextureOffset(8, 31).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon.addChild(octagon_r2);
		setRotationAngle(octagon_r2, -0.7854F, 0.0F, 0.0F);
		octagon_r2.setTextureOffset(16, 5).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r2.setTextureOffset(0, 35).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r2.setTextureOffset(48, 0).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r2.setTextureOffset(49, 25).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);

		octagon3 = new ModelRenderer(this);
		octagon3.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon3);
		setRotationAngle(octagon3, 0.0F, -0.6981F, 0.0F);
		octagon3.setTextureOffset(43, 19).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon3.setTextureOffset(17, 40).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon3.setTextureOffset(24, 1).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon3.setTextureOffset(0, 30).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon3.addChild(octagon_r3);
		setRotationAngle(octagon_r3, -0.7854F, 0.0F, 0.0F);
		octagon_r3.setTextureOffset(0, 15).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r3.setTextureOffset(32, 25).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r3.setTextureOffset(46, 45).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r3.setTextureOffset(49, 20).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);

		octagon6 = new ModelRenderer(this);
		octagon6.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon6);
		setRotationAngle(octagon6, 0.0F, -1.7453F, 0.0F);
		octagon6.setTextureOffset(43, 4).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon6.setTextureOffset(25, 36).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon6.setTextureOffset(0, 20).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon6.setTextureOffset(16, 25).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon6.addChild(octagon_r4);
		setRotationAngle(octagon_r4, -0.7854F, 0.0F, 0.0F);
		octagon_r4.setTextureOffset(8, 6).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r4.setTextureOffset(32, 10).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r4.setTextureOffset(28, 45).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r4.setTextureOffset(49, 10).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);

		octagon7 = new ModelRenderer(this);
		octagon7.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon7);
		setRotationAngle(octagon7, 0.0F, -2.0944F, 0.0F);
		octagon7.setTextureOffset(42, 40).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon7.setTextureOffset(12, 36).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon7.setTextureOffset(16, 15).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon7.setTextureOffset(0, 25).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r5 = new ModelRenderer(this);
		octagon_r5.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon7.addChild(octagon_r5);
		setRotationAngle(octagon_r5, -0.7854F, 0.0F, 0.0F);
		octagon_r5.setTextureOffset(8, 1).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r5.setTextureOffset(32, 5).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r5.setTextureOffset(17, 45).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r5.setTextureOffset(49, 5).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);

		octagon8 = new ModelRenderer(this);
		octagon8.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon8);
		setRotationAngle(octagon8, 0.0F, -2.4435F, 0.0F);
		octagon8.setTextureOffset(41, 35).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon8.setTextureOffset(35, 35).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon8.setTextureOffset(16, 10).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon8.setTextureOffset(24, 21).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r6 = new ModelRenderer(this);
		octagon_r6.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon8.addChild(octagon_r6);
		setRotationAngle(octagon_r6, -0.7854F, 0.0F, 0.0F);
		octagon_r6.setTextureOffset(0, 5).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r6.setTextureOffset(32, 0).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r6.setTextureOffset(0, 45).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r6.setTextureOffset(48, 39).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);

		octagon9 = new ModelRenderer(this);
		octagon9.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon9);
		setRotationAngle(octagon9, 0.0F, -2.7925F, 0.0F);
		octagon9.setTextureOffset(23, 41).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon9.setTextureOffset(19, 35).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon9.setTextureOffset(8, 16).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon9.setTextureOffset(24, 16).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r7 = new ModelRenderer(this);
		octagon_r7.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon9.addChild(octagon_r7);
		setRotationAngle(octagon_r7, -0.7854F, 0.0F, 0.0F);
		octagon_r7.setTextureOffset(0, 0).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r7.setTextureOffset(24, 31).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r7.setTextureOffset(11, 44).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r7.setTextureOffset(6, 48).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);

		octagon4 = new ModelRenderer(this);
		octagon4.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon4);
		setRotationAngle(octagon4, 0.0F, -1.0472F, 0.0F);
		octagon4.setTextureOffset(43, 14).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon4.setTextureOffset(6, 40).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon4.setTextureOffset(8, 21).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon4.setTextureOffset(24, 26).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r8 = new ModelRenderer(this);
		octagon_r8.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon4.addChild(octagon_r8);
		setRotationAngle(octagon_r8, -0.7854F, 0.0F, 0.0F);
		octagon_r8.setTextureOffset(8, 11).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r8.setTextureOffset(32, 20).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r8.setTextureOffset(40, 45).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r8.setTextureOffset(49, 15).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);

		octagon5 = new ModelRenderer(this);
		octagon5.setRotationPoint(-1.0F, -7.8708F, 0.1369F);
		fireballsmall.addChild(octagon5);
		setRotationAngle(octagon5, 0.0F, -1.3963F, 0.0F);
		octagon5.setTextureOffset(43, 9).addBox(-1.0F, -1.7841F, -4.2369F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon5.setTextureOffset(0, 40).addBox(-1.0F, -1.7841F, 3.2631F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon5.setTextureOffset(16, 20).addBox(-1.0F, 3.2708F, -1.7917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon5.setTextureOffset(8, 26).addBox(-1.0F, -4.2292F, -1.6917F, 2.0F, 1.0F, 3.5097F, 0.0F, false);

		octagon_r9 = new ModelRenderer(this);
		octagon_r9.setRotationPoint(1.0F, 7.8708F, -0.1369F);
		octagon5.addChild(octagon_r9);
		setRotationAngle(octagon_r9, -0.7854F, 0.0F, 0.0F);
		octagon_r9.setTextureOffset(0, 10).addBox(-2.0F, -9.9F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r9.setTextureOffset(32, 15).addBox(-2.0F, -2.4F, -7.2548F, 2.0F, 1.0F, 3.5097F, 0.0F, false);
		octagon_r9.setTextureOffset(34, 45).addBox(-2.0F, -7.3549F, -2.2F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
		octagon_r9.setTextureOffset(12, 49).addBox(-2.0F, -7.4548F, -9.7F, 2.0F, 3.5097F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		fireballsmall.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}