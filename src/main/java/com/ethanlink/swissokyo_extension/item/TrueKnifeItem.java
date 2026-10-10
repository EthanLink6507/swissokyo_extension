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

public class TrueKnifeItem extends SwordItem {

	public TrueKnifeItem() {
		super(SwissokyoExtensionToolTiers.CHARA_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(SwissokyoExtensionToolTiers.CHARA_KNIFE_TIER, 8f, -2.1f)).rarity(Rarity.RARE));
	}

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(Screen.hasAltDown()) {
        tooltipComponents.add(Component.translatable("tooltip.swissokyo_extension.true_knife"));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}