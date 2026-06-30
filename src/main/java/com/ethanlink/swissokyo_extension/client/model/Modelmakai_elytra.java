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

public class Modelmakai_elytra<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("swissokyo_extension", "modelmakai_elytra"), "main");
    public final ModelPart Body;
    public final ModelPart wingsR;
    public final ModelPart wingsL;
    public final ModelPart Waist;

    public Modelmakai_elytra(ModelPart root) {
        this.Body = root.getChild("Body");
        this.wingsR = this.Body.getChild("wingsR");
        this.wingsL = this.Body.getChild("wingsL");
        this.Waist = root.getChild("Waist");
}

    @SuppressWarnings("unused")
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition wingsR = Body.addOrReplaceChild("wingsR", CubeListBuilder.create(), PartPose.offset(-13.5F, 6.0F, 7.0F));
        wingsR.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-11.5F, -23.0F, 0.0F, 23.0F, 40.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.2182F, 0.0F));
        PartDefinition wingsL = Body.addOrReplaceChild("wingsL", CubeListBuilder.create(), PartPose.offset(-13.5F, 6.0F, 7.0F));
        wingsL.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-11.5F, -23.0F, 0.0F, 23.0F, 40.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.0F, 0.0F, 0.0F, 3.0543F, 0.2182F, 3.1416F));
        PartDefinition Waist = partdefinition.addOrReplaceChild("Waist", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 100, 40);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
}

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
        this.Waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
    }
}
