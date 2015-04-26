package com.violetstardev.popcorn.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class PopItemsRegistry {
	
	//Items:
	public static final PopItem popcornKernel = new PopcornKernel();
	public static final PopItem poppedKernel = new PoppedKernel();
	public static final PopFoodItem popcornBowl = new PopcornBowl();
	
	public static void init(){
		
		GameRegistry.registerItem(popcornKernel, "popcornKernel");
		GameRegistry.registerItem(poppedKernel, "poppedKernel");
		GameRegistry.registerItem(popcornBowl, "popcornBowl");
		
	}
	
}
