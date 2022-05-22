package com.github.index0427.theroomba.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRoomba extends Item {

    public ItemRoomba() {
        this.setRegistryName("roomba");
        this.setCreativeTab(CreativeTabs.MATERIALS);
        this.setTranslationKey("roomba");
        this.setMaxStackSize(1); //スタック数
    }
}
