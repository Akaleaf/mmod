package com.akaleaf.mmod.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.akaleaf.mmod.init.InitBlocks;
import com.akaleaf.mmod.proxy.CommonProxy;
import com.akaleaf.mmod.reference.Reference;

@Mod(modid = Reference.MODID,
name = Reference.NAME,
version = Reference.VERSION,
acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		System.out.println("\u001B[32m" + "[Starting MMod PRE-INITIALIZATION]" + "\u001B[0m");
//		InitBlocks.registerBlocks();
	};
	

	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		System.out.println("\u001B[32m" + "[Starting MMod INITIALIZATION]" + "\u001B[0m");
//		InitBlocks.registerBlocksRender();
	};
	

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		System.out.println("\u001B[32m" + "[Starting MMod POST-INITIALIZATION]" + "\u001B[0m");
	};
	
}
