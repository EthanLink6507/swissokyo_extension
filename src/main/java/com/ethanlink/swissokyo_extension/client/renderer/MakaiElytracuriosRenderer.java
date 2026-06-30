package com.ethanlink.swissokyo_extension.client.renderer;

import java.util.Collections;
import java.util.Map;

import com.ethanlink.swissokyo_extension.client.model.Modelmakai_elytra;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

public class MakaiElytracuriosRenderer implements ICurioRenderer {
	private static final ResourceLocation TEXTURE = ResourceLocation.parse("swissokyo_extension:textures/entities/makai_wings.png");
  @SuppressWarnings("rawtypes")
private final HumanoidModel humanoidModel;

  @SuppressWarnings("rawtypes")
  public MakaiElytracuriosRenderer() {
        Modelmakai_elytra model = new Modelmakai_elytra(Minecraft.getInstance().getEntityModels().bakeLayer(Modelmakai_elytra.LAYER_LOCATION));
        this.humanoidModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of(
            "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "body", model.Body,
                "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap())
        )));
	}

    @SuppressWarnings("unchecked")
    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack,
		SlotContext slotContext, PoseStack matrixStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer,
	  int light, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
	  LivingEntity entity = slotContext.entity();
	  ICurioRenderer.followHeadRotations(entity, this.humanoidModel.head);
	  ICurioRenderer.followBodyRotations(entity, this.humanoidModel);
	  this.humanoidModel.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
	  VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(renderTypeBuffer, RenderType.armorCutoutNoCull(TEXTURE), stack.hasFoil());
	  this.humanoidModel.renderToBuffer(matrixStack, vertexconsumer, light, OverlayTexture.NO_OVERLAY);
  }

}