package com.ethanlink.swissokyo_extension.item;

import java.util.List;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;

public class RemiliaSpearItem extends SwordItem {

	public RemiliaSpearItem() {
		super(SwissokyoExtensionToolTiers.SPEAR_TIER, new SwordItem.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.SPEAR_TIER, 8f, -2.9f)).rarity(Rarity.EPIC));
	}

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.swissokyo_extension.remilia_spear"));
        tooltipComponents.add(Component.translatable("tooltip.swissokyo_extension.remilia_spear_joke"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
