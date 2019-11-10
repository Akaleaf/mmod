package com.akaleaf.mmod.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.akaleaf.mmod.ItemsRegister;

public class CommonProxy {
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	} 

	public void preInit(FMLPreInitializationEvent event){
		ItemsRegister.register();
    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
	
}
