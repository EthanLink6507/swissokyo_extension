package com.ethanlink.swissokyo_extension.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class FossilIngotItem extends Item {
    public FossilIngotItem() {
        super((new Item.Properties()).stacksTo(64).rarity(Rarity.RARE));
    }
}
