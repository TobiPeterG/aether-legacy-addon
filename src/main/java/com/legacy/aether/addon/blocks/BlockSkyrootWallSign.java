package com.legacy.aether.addon.blocks;

import java.util.Random;

import com.legacy.aether.addon.items.ItemsAetherAddon;
import com.legacy.aether.addon.tile_entities.TileEntitySkyrootSign;

import net.minecraft.block.BlockWallSign;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSkyrootWallSign extends BlockWallSign {
	protected BlockSkyrootWallSign() {
		setHardness(1.0F);
		setSoundType(SoundType.WOOD);
	}
	/**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World worldIn, int meta) {
    	return new TileEntitySkyrootSign();
    }
    
    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    	return ItemsAetherAddon.skyroot_sign;
    }
    
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(ItemsAetherAddon.skyroot_sign);
	}
}
