package com.ethanlink.swissokyo_extension.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

public class FossilKnifeItem extends SwordItem {

	public FossilKnifeItem() {
		super(SwissokyoExtensionToolTiers.FOSSIL_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.FOSSIL_KNIFE_TIER, 4.5f, -1.4f)));
	}
}