package com.ethanlink.swissokyo_extension.item;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class DarkAdamantiteKnifeItem extends SwordItem {

	public DarkAdamantiteKnifeItem() {
		super(SwissokyoExtensionToolTiers.ADAMANTITE_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.SWISS_KNIFE_TIER, 5f, -1.5f)));
	}
}