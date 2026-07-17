package com.ethanlink.swissokyo_extension.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Modelshikaisen_arms<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("swissokyo_extension", "modelshikaisen_arms"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart leftArm;
	public final ModelPart rightArm;
	public final ModelPart leftLeg;
	public final ModelPart weapons;
	public final ModelPart katana;
	public final ModelPart bone5;
	public final ModelPart handle;
	public final ModelPart bone9;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart wakizachi;
	public final ModelPart bone;
	public final ModelPart bone6;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart rightLeg;

	public Modelshikaisen_arms(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
		this.leftLeg = root.getChild("leftLeg");
		this.weapons = this.leftLeg.getChild("weapons");
		this.katana = this.weapons.getChild("katana");
		this.bone5 = this.katana.getChild("bone5");
		this.handle = this.bone5.getChild("handle");
		this.bone9 = this.handle.getChild("bone9");
		this.bone2 = this.katana.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.wakizachi = this.weapons.getChild("wakizachi");
		this.bone = this.wakizachi.getChild("bone");
		this.bone6 = this.bone.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.rightLeg = root.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		@SuppressWarnings("unused")
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		@SuppressWarnings("unused")
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		@SuppressWarnings("unused")
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		@SuppressWarnings("unused")
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offset(1.95F, 12.0F, 0.0F));
		PartDefinition weapons = leftLeg.addOrReplaceChild("weapons", CubeListBuilder.create(), PartPose.offset(-1.95F, 12.0F, 0.0F));
		PartDefinition katana = weapons.addOrReplaceChild("katana", CubeListBuilder.create().texOffs(6, 3).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -12.0F, 1.0F, 1.9049F, 0.3456F, 1.9911F));
		PartDefinition bone5 = katana.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -5.0F, 0.0F));
		PartDefinition handle = bone5.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(12, 11).addBox(0.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		handle.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(18, 11).addBox(0.0F, -4.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition bone2 = katana.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(6, 9).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		bone3.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(12, 3).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition wakizachi = weapons.addOrReplaceChild("wakizachi", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -11.0F, 0.0F, 2.101F, 0.151F, 1.6587F));
		PartDefinition bone = wakizachi.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, -8.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 9).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 15)
						.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 16).addBox(-0.5F, -1.99F, -0.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -2.0F, -1.0F));
		PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(12, 16).addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		@SuppressWarnings("unused")
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offset(-1.95F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}