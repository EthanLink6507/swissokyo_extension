package com.ethanlink.swissokyo_extension.item;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class SwissKnifeItem extends SwordItem {

	public SwissKnifeItem() {
		super(SwissokyoExtensionToolTiers.SWISS_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.SWISS_KNIFE_TIER, 4.5f, -2f)));
	}
}