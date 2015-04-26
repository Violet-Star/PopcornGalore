package com.violetstardev.popcorn.items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class PopcornKernel extends PopItem{
	
	public PopcornKernel(){
		
		this.setUnlocalizedName("popcornKernel");
		MinecraftForge.addGrassSeed(new ItemStack(this), 8);
		
	}
	
}
