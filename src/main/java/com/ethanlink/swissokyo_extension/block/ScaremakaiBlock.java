package com.ethanlink.swissokyo_extension.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class ScaremakaiBlock extends Block {
   public ScaremakaiBlock() {
      super(Properties.of().sound(SoundType.GRASS).sound(SoundType.GRASS).strength(0.2F).noOcclusion());
   }

   @Override
   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
      return 0;
   }
}
