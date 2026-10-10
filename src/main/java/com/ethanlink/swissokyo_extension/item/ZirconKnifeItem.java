package com.ethanlink.swissokyo_extension.item;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class ZirconKnifeItem extends SwordItem {

	public ZirconKnifeItem() {
		super(SwissokyoExtensionToolTiers.ZIRCON_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.ZIRCON_KNIFE_TIER, 4.5f, -2.2f)));
	}
}