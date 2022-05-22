package com.github.index0427.theroomba.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRoombaStand extends Block {
    public BlockRoombaStand() {
        super(Material.IRON);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setTranslationKey("block_roombastand");
        this.setRegistryName("block_roombastand");
    }
}
