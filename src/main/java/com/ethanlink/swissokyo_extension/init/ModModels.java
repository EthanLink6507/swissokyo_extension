package com.ethanlink.swissokyo_extension.init;

import com.ethanlink.swissokyo_extension.model.Modelmakai_elytra;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;


public class ModModels {
    public ModModels() {
}

@SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(Modelmakai_elytra.LAYER_LOCATION, Modelmakai_elytra::createBodyLayer);
    }
}
