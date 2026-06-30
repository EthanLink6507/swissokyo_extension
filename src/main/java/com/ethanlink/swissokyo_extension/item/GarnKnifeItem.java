package com.ethanlink.swissokyo_extension.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import com.ethanlink.swissokyo_extension.init.ModToolTiers;

public class GarnKnifeItem extends SwordItem {

	public GarnKnifeItem() {
		super(ModToolTiers.DIAMOND_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.DIAMOND_KNIFE_TIER, 2.5f, -1.5f)));
	}
}