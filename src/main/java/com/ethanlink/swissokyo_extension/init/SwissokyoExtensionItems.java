package com.ethanlink.swissokyo_extension.init;

import com.ethanlink.swissokyo_extension.SwissokyoExtension;
import com.ethanlink.swissokyo_extension.item.BismuthKnifeItem;
import com.ethanlink.swissokyo_extension.item.CoreKnifeItem;
import com.ethanlink.swissokyo_extension.item.GarnKnifeItem;
import com.ethanlink.swissokyo_extension.item.JaajKnifeItem;
import com.ethanlink.swissokyo_extension.item.MakaiIngotItem;
import com.ethanlink.swissokyo_extension.item.MakaiKnifeItem;
import com.ethanlink.swissokyo_extension.item.MalachKnifeItem;
import com.ethanlink.swissokyo_extension.item.ReptileKnifeItem;
import com.ethanlink.swissokyo_extension.item.RoyaleKnifeItem;
import com.ethanlink.swissokyo_extension.item.SaphireKnifeItem;
import com.ethanlink.swissokyo_extension.item.SwissKnifeItem;
import com.ethanlink.swissokyo_extension.item.TourKnifeItem;
import com.ethanlink.swissokyo_extension.item.TrueKnifeItem;
import com.ethanlink.swissokyo_extension.item.ZirconKnifeItem;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SwissokyoExtensionItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SwissokyoExtension.MOD_ID);
	public static final DeferredItem<Item> BISMUTH_KNIFE;
	public static final DeferredItem<Item> CORE_KNIFE;
	public static final DeferredItem<Item> GARN_KNIFE;
	public static final DeferredItem<Item> JAAJ_KNIFE;
	public static final DeferredItem<Item> MAKAI_KNIFE;
	public static final DeferredItem<Item> MALACH_KNIFE;
	public static final DeferredItem<Item> REPTILE_KNIFE;
	public static final DeferredItem<Item> ROYALE_KNIFE;
	public static final DeferredItem<Item> SAPHIRE_KNIFE;
	public static final DeferredItem<Item> SWISS_KNIFE;
	public static final DeferredItem<Item> TOUR_KNIFE;
	public static final DeferredItem<Item> TRUE_KNIFE;
	public static final DeferredItem<Item> ZIRCON_KNIFE;
	public static final DeferredItem<Item> MAKAI_INGOT;

	static {
		BISMUTH_KNIFE = ITEMS.register("bismuth_knife", BismuthKnifeItem::new);
		CORE_KNIFE = ITEMS.register("core_knife", CoreKnifeItem::new);
		GARN_KNIFE = ITEMS.register("garn_knife", GarnKnifeItem::new);
		JAAJ_KNIFE = ITEMS.register("jaaj_knife", JaajKnifeItem::new);
		MAKAI_KNIFE = ITEMS.register("makai_knife", MakaiKnifeItem::new);
		MALACH_KNIFE = ITEMS.register("malach_knife", MalachKnifeItem::new);
		REPTILE_KNIFE = ITEMS.register("reptile_knife", ReptileKnifeItem::new);
		ROYALE_KNIFE = ITEMS.register("royale_knife", RoyaleKnifeItem::new);
		SAPHIRE_KNIFE = ITEMS.register("saphire_knife", SaphireKnifeItem::new);
		SWISS_KNIFE = ITEMS.register("swiss_knife", SwissKnifeItem::new);
		TOUR_KNIFE = ITEMS.register("tour_knife", TourKnifeItem::new);
		TRUE_KNIFE = ITEMS.register("true_knife", TrueKnifeItem::new);
		ZIRCON_KNIFE = ITEMS.register("zircon_knife", ZirconKnifeItem::new);
		MAKAI_INGOT = ITEMS.register("makai_ingot", MakaiIngotItem::new);
		}
}