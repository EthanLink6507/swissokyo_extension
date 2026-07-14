package com.ethanlink.swissokyo_extension.init;

import com.ethanlink.swissokyo_extension.block.ScaremakaiBlock;
import com.ethanlink.swissokyo_extension.block.DonationBoxBlock;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SwissokyoExtensionBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("swissokyo_extension");
    public static final DeferredBlock<Block> SCAREMAKAI;
    public static final DeferredBlock<Block> DONATION_BOX;

static {
SCAREMAKAI = BLOCKS.register("scaremakai", ScaremakaiBlock::new);
DONATION_BOX = BLOCKS.register("donation_box", DonationBoxBlock::new);
    }
}