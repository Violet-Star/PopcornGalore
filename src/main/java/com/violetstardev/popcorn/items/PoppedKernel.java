package com.violetstardev.popcorn.items;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class PoppedKernel extends PopItem{
	
	public PoppedKernel(){
		
		this.setUnlocalizedName("poppedKernel");
		GameRegistry.addSmelting(PopItemsRegistry.popcornKernel, new ItemStack(this, 3), 0.8F);
		
	}
	
}
