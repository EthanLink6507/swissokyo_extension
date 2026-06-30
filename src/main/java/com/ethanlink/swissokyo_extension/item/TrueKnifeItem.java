package com.ethanlink.swissokyo_extension.item;

import com.ethanlink.swissokyo_extension.init.ModToolTiers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class TrueKnifeItem extends SwordItem {

	public TrueKnifeItem() {
		super(ModToolTiers.CHARA_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CHARA_KNIFE_TIER, 8f, -3.1f)));
	}
}