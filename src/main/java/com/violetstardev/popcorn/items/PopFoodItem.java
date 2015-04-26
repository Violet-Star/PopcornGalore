package com.violetstardev.popcorn.items;

import com.violetstardev.popcorn.common.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class PopFoodItem extends ItemFood{
	
	public PopFoodItem(int regenAmount, float saturation, boolean wolvesCanEat){
		
		super(regenAmount, saturation, wolvesCanEat);
		
	}	
	
	@Override
	public String getUnlocalizedName() {
		
		return String.format("item.%s%s", Reference.modid.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		
		return String.format("item.%s%s", Reference.modid.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
		
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
		
	}
	
}
