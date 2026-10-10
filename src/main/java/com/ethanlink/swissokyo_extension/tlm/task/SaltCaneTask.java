package com.ethanlink.swissokyo_extension.tlm.task;


import com.ethanlink.swissokyo_extension.SwissokyoExtension;
import com.github.tartaricacid.touhoulittlemaid.api.task.IFarmTask;
import com.github.tartaricacid.touhoulittlemaid.entity.passive.EntityMaid;

import net.mcreator.swissokyoaddons.init.SwissokyoAddonsModBlocks;
import net.mcreator.swissokyoaddons.init.SwissokyoAddonsModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class SaltCaneTask implements IFarmTask {
    private static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(SwissokyoExtension.MOD_ID, "saltcane");

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public ItemStack getIcon() {
        return SwissokyoAddonsModItems.SALTCANE_TALL.get().getDefaultInstance();
    }

    @Override
    public boolean isSeed(ItemStack stack) {
        return stack.getItem() == SwissokyoAddonsModItems.SALTCANE_TALL.get();
    }

    @Override
    public boolean canHarvest(EntityMaid maid, BlockPos cropPos, BlockState cropState) {
        BlockState blockDownState = maid.level().getBlockState(cropPos.below());
        BlockState blockDown2State = maid.level().getBlockState(cropPos.below(2));
        return cropState.is(SwissokyoAddonsModBlocks.SALTCANE_TALL) && blockDownState.is(SwissokyoAddonsModBlocks.SALTCANE_TALL) && canSustainSaltCane(blockDown2State);
    }

    @Override
    public void harvest(EntityMaid maid, BlockPos cropPos, BlockState cropState) {
        maid.destroyBlock(cropPos);
    }

    @Override
    public boolean canPlant(EntityMaid maid, BlockPos basePos, BlockState baseState, ItemStack seed) {
        return canSustainSaltCane(baseState);
    }

    @Override
    public ItemStack plant(EntityMaid maid, BlockPos basePos, BlockState baseState, ItemStack seed) {
        if (seed.getItem() == SwissokyoAddonsModItems.SALTCANE_TALL.get()) {
            maid.placeItemBlock(basePos.above(), seed);
        }
        return seed;
    }

    @Override
    public double getCloseEnoughDist() {
        return 2.0;
    }

    private boolean canSustainSaltCane(BlockState state) {
        return state.is(Blocks.PODZOL);
    }

    @Override
    public String getMaidActionSummary() {
        return "Plant and harvest salt cane";
    }
}