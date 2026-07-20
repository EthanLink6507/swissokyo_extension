package com.ethanlink.swissokyo_extension.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

public class JaajKnifeItem extends SwordItem {

	public JaajKnifeItem() {
		super(SwissokyoExtensionToolTiers.JADE_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.JADE_KNIFE_TIER, 3.5f, -1.9f)));
	}
}