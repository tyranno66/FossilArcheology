package mod.fossil.common.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.fossil.common.Fossil;
import net.minecraft.creativetab.CreativeTabs;

public class TabFItems extends CreativeTabs 
{

	public TabFItems(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       return Fossil.dinoPedia.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
     return "Fossil Items";
    }
	
}
