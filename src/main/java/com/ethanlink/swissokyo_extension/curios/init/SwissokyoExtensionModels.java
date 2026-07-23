package com.ethanlink.swissokyo_extension.curios.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import com.ethanlink.swissokyo_extension.curios.model.Modelbakenekomask;

import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class SwissokyoExtensionModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbakenekomask.LAYER_LOCATION, Modelbakenekomask::createBodyLayer);
	}
}