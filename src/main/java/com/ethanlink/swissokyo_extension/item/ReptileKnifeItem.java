package com.ethanlink.swissokyo_extension.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;


public class ReptileKnifeItem extends SwordItem {

	public ReptileKnifeItem() {
		super(SwissokyoExtensionToolTiers.NETHERITE_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.NETHERITE_KNIFE_TIER, 6f, -2.1f)));
	}
}