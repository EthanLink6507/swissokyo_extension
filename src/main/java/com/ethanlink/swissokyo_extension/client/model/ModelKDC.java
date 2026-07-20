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

public class ModelKDC<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("swissokyo_extension", "model_kdc"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart mask;
	public final ModelPart eyes;
	public final ModelPart eye1;
	public final ModelPart eye2;
	public final ModelPart string1;
	public final ModelPart string2;
	public final ModelPart leftArm;
	public final ModelPart rightArm;
	public final ModelPart leftLeg;
	public final ModelPart rightLeg;

	public ModelKDC(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.mask = this.body.getChild("mask");
		this.eyes = this.mask.getChild("eyes");
		this.eye1 = this.eyes.getChild("eye1");
		this.eye2 = this.eyes.getChild("eye2");
		this.string1 = this.mask.getChild("string1");
		this.string2 = this.mask.getChild("string2");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		@SuppressWarnings("unused")
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition mask = body.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, 0.0F, 8.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, -6.0F, 5.0F, 0.2178F, -0.0076F, 0.1742F));
		PartDefinition eyes = mask.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		eyes.addOrReplaceChild("eye1", CubeListBuilder.create().texOffs(62, 1).addBox(-2.25F, 1.0F, -0.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		eyes.addOrReplaceChild("eye2", CubeListBuilder.create().texOffs(62, 0).addBox(-2.25F, 1.0F, -0.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 0.0F, 0.0F));
		mask.addOrReplaceChild("string1", CubeListBuilder.create().texOffs(16, 3).addBox(-16.0F, -1.0F, 0.0F, 16.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 1.0F, 0.0F, 0.3054F, 0.0F, -0.0873F));
		mask.addOrReplaceChild("string2", CubeListBuilder.create().texOffs(0, 12).addBox(-32.0F, 0.0F, 0.0F, 32.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.0F, 0.0F, 0.2467F, 0.0886F, -0.3381F));
		@SuppressWarnings("unused")
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		@SuppressWarnings("unused")
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		@SuppressWarnings("unused")
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offset(1.95F, 12.0F, 0.0F));
		@SuppressWarnings("unused")
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offset(-1.95F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

        @Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

        @Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}