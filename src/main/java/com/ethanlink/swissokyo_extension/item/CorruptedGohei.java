package com.ethanlink.swissokyo_extension.item;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class CorruptedGohei extends SwordItem {

	public CorruptedGohei() {
		super(SwissokyoExtensionToolTiers.MAKAI_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.MAKAI_KNIFE_TIER, 4f, -2f)));
	}
}