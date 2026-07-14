package com.ethanlink.swissokyo_extension.init;

import com.ethanlink.swissokyo_extension.client.renderer.MakaiElytraCuriosRenderer;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class SwissokyoExtensionCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(SwissokyoExtensionItems.MAKAI_ELYTRA.get(), MakaiElytraCuriosRenderer::new);
	}
}