package com.violetstardev.popcorn.common;

import com.violetstardev.popcorn.items.PopItemsRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class Popcorn {
	
	@Mod.Instance(value = Reference.modid)
	public Popcorn instance;
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent e){
		
		PopItemsRegistry.init();
		
	}
	
}
