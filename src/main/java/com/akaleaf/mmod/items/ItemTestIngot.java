package com.akaleaf.mmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.akaleaf.mmod.init.InitItems;
import com.akaleaf.mmod.main.Main;
import com.akaleaf.mmod.utils.interfaces.IHasModel;

public class ItemTestIngot extends Item implements IHasModel {

	public ItemTestIngot(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		setMaxStackSize(16);
		
		InitItems.ITEMS.add(this);
		
	}

	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
