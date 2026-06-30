package com.ethanlink.swissokyo_extension.init;

import com.ethanlink.swissokyo_extension.client.renderer.MakaiElytracuriosRenderer;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class ModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(ModItems.MAKAI_ELYTRA.get(), MakaiElytracuriosRenderer::new);
	}
}