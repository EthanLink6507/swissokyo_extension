package com.ethanlink.swissokyo_extension.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class DonationBoxBlock extends Block {
    public DonationBoxBlock() {
        super(Properties.of().sound(SoundType.WOOD).sound(SoundType.WOOD).strength(0.2F).noOcclusion());
    }

@Override
public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }
}
