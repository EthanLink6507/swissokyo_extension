package com.ethanlink.swissokyo_extension.item;

import java.util.List;

import com.ethanlink.swissokyo_extension.init.SwissokyoExtensionToolTiers;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;

public class FlandreSpearItem extends SwordItem {

	public FlandreSpearItem() {
		super(SwissokyoExtensionToolTiers.SPEAR_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.SPEAR_TIER, 8f, -2.9f)).rarity(Rarity.EPIC));
	}
    
    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(Screen.hasAltDown()) {
        tooltipComponents.add(Component.translatable("tooltip.swissokyo_extension.flandre_spear_joke"));
        } else {
        tooltipComponents.add(Component.translatable("tooltip.swissokyo_extension.flandre_spear"));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
