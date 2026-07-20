package com.ethanlink.swissokyo_extension.init;

import com.ethanlink.swissokyo_extension.client.model.ModelKDC;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.ethanlink.swissokyo_extension.client.model.Modelbakenekomask;
import com.ethanlink.swissokyo_extension.client.model.Modelmakai_elytra;

@EventBusSubscriber(Dist.CLIENT)
public class SwissokyoExtensionModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmakai_elytra.LAYER_LOCATION, Modelmakai_elytra::createBodyLayer);
		event.registerLayerDefinition(Modelbakenekomask.LAYER_LOCATION, Modelbakenekomask::createBodyLayer);
		event.registerLayerDefinition(ModelKDC.LAYER_LOCATION, ModelKDC::createBodyLayer);
	}
}