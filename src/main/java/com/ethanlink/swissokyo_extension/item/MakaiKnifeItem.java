package com.ethanlink.swissokyo_extension.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import com.ethanlink.swissokyo_extension.init.ModToolTiers;

public class MakaiKnifeItem extends SwordItem {

	public MakaiKnifeItem() {
		super(ModToolTiers.NETHERITE_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.NETHERITE_KNIFE_TIER, 4.5f, -1.4f)));
	}
}