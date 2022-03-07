// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelmonster extends EntityModel<Entity> {
	private final ModelRenderer upperBodyPart1;
	private final ModelRenderer head1;
	private final ModelRenderer upperBodyPart5;
	private final ModelRenderer upperBodyPart4;
	private final ModelRenderer upperBodyPart2;
	private final ModelRenderer lefthand;
	private final ModelRenderer righthand2;

	public Modelmonster() {
		texWidth = 64;
		texHeight = 64;

		upperBodyPart1 = new ModelRenderer(this);
		upperBodyPart1.setPos(-5.0F, 0.0F, -3.0F);
		upperBodyPart1.texOffs(0, 25).addBox(1.0F, -6.1F, -0.5F, 9.0F, 15.0F, 9.0F, 0.0F, false);

		head1 = new ModelRenderer(this);
		head1.setPos(0.0F, -6.0F, 0.0F);
		head1.texOffs(0, 0).addBox(-5.5F, -13.0F, -4.9F, 12.0F, 13.0F, 12.0F, 0.0F, false);

		upperBodyPart5 = new ModelRenderer(this);
		upperBodyPart5.setPos(0.5F, 9.0F, 1.0F);
		upperBodyPart5.texOffs(0, 0).addBox(-1.5F, -0.1F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		upperBodyPart4 = new ModelRenderer(this);
		upperBodyPart4.setPos(0.0F, 5.9F, 0.0F);
		upperBodyPart5.addChild(upperBodyPart4);
		upperBodyPart4.texOffs(36, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		upperBodyPart2 = new ModelRenderer(this);
		upperBodyPart2.setPos(0.0F, 6.0F, 0.0F);
		upperBodyPart4.addChild(upperBodyPart2);
		upperBodyPart2.texOffs(0, 25).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		lefthand = new ModelRenderer(this);
		lefthand.setPos(-6.0F, -1.0F, 0.0F);
		lefthand.texOffs(32, 40).addBox(-7.0F, -3.1F, -0.5F, 9.0F, 12.0F, 3.0F, 0.0F, false);

		righthand2 = new ModelRenderer(this);
		righthand2.setPos(5.0F, -1.0F, 0.0F);
		righthand2.texOffs(33, 25).addBox(0.0F, -3.1F, -0.5F, 8.0F, 12.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		upperBodyPart1.render(matrixStack, buffer, packedLight, packedOverlay);
		head1.render(matrixStack, buffer, packedLight, packedOverlay);
		upperBodyPart5.render(matrixStack, buffer, packedLight, packedOverlay);
		lefthand.render(matrixStack, buffer, packedLight, packedOverlay);
		righthand2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.upperBodyPart4.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.lefthand.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.upperBodyPart2.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.righthand2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head1.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}