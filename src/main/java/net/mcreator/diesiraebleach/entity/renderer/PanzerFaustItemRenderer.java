package net.mcreator.diesiraebleach.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.diesiraebleach.item.PanzerFaustItemItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PanzerFaustItemRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PanzerFaustItemItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<PanzerFaustItemItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("diesiraebleach:textures/entities/panzerfaustammo.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(PanzerFaustItemItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new ModelPanzerFaustAmmo();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(PanzerFaustItemItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.6.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPanzerFaustAmmo extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;

		public ModelPanzerFaustAmmo() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(2, 1).addBox(-0.5F, -10.3F, -0.75F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-0.11F, -11.8F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, false);
			bone.setTextureOffset(2, 0).addBox(-0.5F, -11.5F, -0.75F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 2).addBox(-0.6F, -11.2F, -0.85F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 1).addBox(-0.7F, -10.9F, -0.95F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-0.6F, -10.6F, -0.85F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.1412F, -8.2963F, 0.05F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 0).addBox(0.0912F, -0.5F, -0.05F, 0.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -5.75F, -1.95F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, -1.5708F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(-0.05F, -2.75F, -3.05F, 0.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -5.25F, 0.75F);
			bone.addChild(cube_r3);
			setRotationAngle(cube_r3, -1.5708F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-0.25F, 0.75F, -6.35F, 0.0F, 0.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 0).addBox(-0.25F, 0.75F, -4.75F, 0.0F, 0.0F, 9.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -3.0F, 0.0F);
			bone.addChild(cube_r4);
			setRotationAngle(cube_r4, -1.5708F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 0).addBox(-0.4F, -0.25F, -6.99F, 0.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 0).addBox(-0.4F, -0.25F, -6.99F, 0.0F, 1.0F, 0.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
