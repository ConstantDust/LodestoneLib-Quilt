package com.sammy.lodestone.systems.block.sign;

import com.sammy.lodestone.systems.blockentity.LodestoneSignBlockEntity;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.sign.SignType;
import net.minecraft.block.sign.WallSignBlock;
import net.minecraft.util.math.BlockPos;

public class LodestoneWallSignBlock extends WallSignBlock implements BlockEntityProvider {
	public LodestoneWallSignBlock(Settings settings, SignType signType) {
		super(settings, signType);
	}

	@Override

	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new LodestoneSignBlockEntity(pos, state);
	}
}
