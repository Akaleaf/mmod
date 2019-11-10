package com.akaleaf.mmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TileTestBlock extends Block {

	public TileTestBlock(String name) {
		
		super(Material.SAND);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(2.0F);
		this.setResistance(15.0F);
		this.setHarvestLevel("Wood", 0);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		
	}
	
}
