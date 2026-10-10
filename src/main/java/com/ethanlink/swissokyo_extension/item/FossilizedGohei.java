package com.ethanlink.swissokyo_extension.item;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class FossilizedGohei extends SwordItem {

	public FossilizedGohei() {
		super(SwissokyoExtensionToolTiers.FOSSIL_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.FOSSIL_KNIFE_TIER, 4f, -2f)));
	}
}