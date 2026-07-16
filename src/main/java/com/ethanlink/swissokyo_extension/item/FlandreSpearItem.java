package com.ethanlink.swissokyo_extension.item;

import java.util.List;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;

public class FlandreSpearItem extends SwordItem {

	public FlandreSpearItem() {
		super(SwissokyoExtensionToolTiers.DIAMOND_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.DIAMOND_KNIFE_TIER, 8f, -2.9f)).rarity(Rarity.EPIC));
	}
    
    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.swissokyo_extension.flandre_spear"));
        tooltipComponents.add(Component.translatable("tooltip.swissokyo_extension.flandre_spear_joke"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
