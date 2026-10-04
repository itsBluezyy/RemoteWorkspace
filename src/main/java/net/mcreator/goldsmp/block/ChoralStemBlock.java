package net.mcreator.goldsmp.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

import net.mcreator.goldsmp.init.GoldsmpModBlocks;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class ChoralStemBlock extends Block {
	@Environment(EnvType.CLIENT)
	public static void registerRenderLayer() {
		BlockRenderLayerMap.putBlock(GoldsmpModBlocks.CHORAL_STEM, ChunkSectionLayer.CUTOUT);
	}

	public ChoralStemBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}