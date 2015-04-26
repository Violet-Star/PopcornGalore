package com.violetstardev.popcorn.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class PopcornBowl extends PopFoodItem{
	
	public PopcornBowl(){
		
		super(3, 3.0F, false);
		this.setUnlocalizedName("popcornBowl");
		GameRegistry.addShapelessRecipe(new ItemStack(this), PopItemsRegistry.poppedKernel, PopItemsRegistry.poppedKernel, PopItemsRegistry.poppedKernel, Items.bowl);
		
	}
	
}
