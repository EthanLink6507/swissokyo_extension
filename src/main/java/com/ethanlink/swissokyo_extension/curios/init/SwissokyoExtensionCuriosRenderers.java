package com.ethanlink.swissokyo_extension.curios.init;

import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.BakenekoMaskCuriosRenderer;
import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.KitsuneMaskCuriosRenderer;
import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.MakaiWingsCuriosRenderer;
import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.OniMaskCuriosRenderer;
import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.ShikaisenArmsCuriosRenderer;
import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.ShikaisenPinsCuriosRenderer;
import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.ShogunArmsCuriosRenderer;
import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.ShogunHatCuriosRenderer;
import com.ethanlink.swissokyo_extension.curios.renderer.swissokyo_addons.FossilWingsCuriosRenderer;

import net.mcreator.swissokyoaddons.init.SwissokyoAddonsModItems;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class SwissokyoExtensionCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.MAKAI_WINGS_CHESTPLATE.get(), MakaiWingsCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.SKS_ARMOR_HELMET.get(), ShikaisenPinsCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.SKS_ARMOR_LEGGINGS.get(), ShikaisenArmsCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.BNK_HELMET.get(), BakenekoMaskCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.KDC_HELMET.get(), KitsuneMaskCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.ONI_HELMET.get(), OniMaskCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.SHOGUN_SET_LEGGINGS.get(), ShogunArmsCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.FOSSIL_WINGS_CHESTPLATE.get(), FossilWingsCuriosRenderer::new);
		CuriosRendererRegistry.register(SwissokyoAddonsModItems.SHOGUN_SET_HELMET.get(), ShogunHatCuriosRenderer::new);
	}
}