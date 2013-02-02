package mod_Fossil;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;

public class WaterDinoAINearestAttackableTarget extends
    EntityAINearestAttackableTarget
{
    public WaterDinoAINearestAttackableTarget(EntityLiving par1EntityLiving,
            Class par2Class, float par3, int par4, boolean par5)
    {
        super(par1EntityLiving, par2Class, par3, par4, par5);
        // TODO Auto-generated constructor stub
    }
    protected boolean isSuitableTarget(EntityLiving par1EntityLiving, boolean par2)
    {
        if (par1EntityLiving != null && !par1EntityLiving.isInWater())
        {
            return false;
        }

        return super.isSuitableTarget(par1EntityLiving, par2);
    }
}
