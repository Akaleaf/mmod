package com.akaleaf.mmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.akaleaf.mmod.items.ItemTestIngot;

public class ItemsRegister {

	public static Item test_ingot = new ItemTestIngot("test_ingot");
	
	public static void register() {
		setRegister(test_ingot);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender() {
		setRender(test_ingot);
	}
	
	private static void setRegister(Item item) {
		ForgeRegistries.ITEMS.register(item);
	}
	
	@SideOnly(Side.CLIENT)
	private static void setRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
