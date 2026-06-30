package com.ethanlink.swissokyo_extension.item;

import com.ethanlink.swissokyo_extension.init.ModToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class BismuthKnifeItem extends SwordItem {

	public BismuthKnifeItem() {
		super(ModToolTiers.NETHERITE_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.NETHERITE_KNIFE_TIER, 5.5f, -1.5f)));
	}
}