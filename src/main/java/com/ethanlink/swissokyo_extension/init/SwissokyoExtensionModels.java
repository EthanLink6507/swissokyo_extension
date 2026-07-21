package com.ethanlink.swissokyo_extension.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.ethanlink.swissokyo_extension.client.model.Modelbakenekomask;

@EventBusSubscriber(Dist.CLIENT)
public class SwissokyoExtensionModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbakenekomask.LAYER_LOCATION, Modelbakenekomask::createBodyLayer);
	}
}