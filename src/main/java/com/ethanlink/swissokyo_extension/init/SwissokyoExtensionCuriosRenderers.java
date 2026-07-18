package com.ethanlink.swissokyo_extension.init;

import com.ethanlink.swissokyo_extension.client.renderer.BakenekoMaskCuriosRenderer;
import com.ethanlink.swissokyo_extension.client.renderer.KitsuneMaskCuriosRenderer;
import com.ethanlink.swissokyo_extension.client.renderer.MakaiElytraCuriosRenderer;
import com.ethanlink.swissokyo_extension.client.renderer.MakaiWingsCuriosRenderer;
import com.ethanlink.swissokyo_extension.client.renderer.OniMaskCuriosRenderer;
import com.ethanlink.swissokyo_extension.client.renderer.ShikaisenArmsCuriosRenderer;
import com.ethanlink.swissokyo_extension.client.renderer.ShikaisenPinsCuriosRenderer;
import com.ethanlink.swissokyo_extension.client.renderer.ShogunArmsCuriosRenderer;

import net.mcreator.swissokyoaddons.init.SwissokyoAddonsModItems;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class SwissokyoExtensionCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(SwissokyoExtensionItems.MAKAI_ELYTRA.get(), MakaiElytraCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.MAKAI_WINGS_CHESTPLATE.get(), MakaiWingsCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.SKS_ARMOR_HELMET.get(), ShikaisenPinsCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.SKS_ARMOR_LEGGINGS.get(), ShikaisenArmsCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.BNK_HELMET.get(), BakenekoMaskCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.KDC_HELMET.get(), KitsuneMaskCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.ONI_HELMET.get(), OniMaskCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.SHOGUN_SET_LEGGINGS.get(), ShogunArmsCuriosRenderer::new);
	}
}