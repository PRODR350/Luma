// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelluma_boss extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;

	public Modelluma_boss() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 25).addBox(-6.0F, -12.0F, -4.0F, 11.0F, 11.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-7.0F, -1.0F, -4.0F, 13.0F, 17.0F, 8.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		leftArm.setTextureOffset(0, 44).addBox(-7.0F, -3.0F, -3.0F, 5.0F, 19.0F, 6.0F, 0.0F, false);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setRotationPoint(-0.9826F, -4.3008F, 0.0F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, 0.0F, 0.3054F, -0.1309F);
		leftArm_r1.setTextureOffset(0, 69).addBox(-7.7666F, -6.7525F, -0.557F, 8.0F, 8.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		rightArm.setTextureOffset(38, 19).addBox(1.0F, -3.0F, -3.0F, 5.0F, 19.0F, 6.0F, 0.0F, false);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setRotationPoint(1.2313F, -5.3455F, -0.4282F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, 0.0F, -0.2182F, 0.0873F);
		rightArm_r1.setTextureOffset(0, 69).addBox(-1.2223F, -5.9321F, -0.8594F, 8.0F, 8.0F, 0.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		leftLeg.setTextureOffset(22, 44).addBox(-5.0F, 4.0F, -3.0F, 5.0F, 8.0F, 6.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(42, 0).addBox(-1.0F, 4.0F, -3.0F, 5.0F, 8.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}