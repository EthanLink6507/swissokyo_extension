package com.ethanlink.swissokyo_extension.item;

import java.util.List;

import com.ethanlink.swissokyo_extension.init.ModToolTiers;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;

public class TrueKnifeItem extends SwordItem {

	public TrueKnifeItem() {
		super(ModToolTiers.CHARA_KNIFE_TIER, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CHARA_KNIFE_TIER, 8f, -3.1f)));
	}

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.swissokyo_extension.true_knife"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}