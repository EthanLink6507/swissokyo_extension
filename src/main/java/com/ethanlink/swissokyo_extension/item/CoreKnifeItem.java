package com.ethanlink.swissokyo_extension.item;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class CoreKnifeItem extends SwordItem {

	public CoreKnifeItem() {
		super(SwissokyoExtensionToolTiers.CORE_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.CORE_KNIFE_TIER, 6.5f, -3f)));
	}
}