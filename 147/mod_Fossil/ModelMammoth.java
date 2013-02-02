// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package mod_Fossil;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;

public class ModelMammoth extends ModelBase
{
    // fields
    ModelRenderer headmain;
    ModelRenderer buttom;
    ModelRenderer nose1;
    ModelRenderer leftArm;
    ModelRenderer rightArm;
    ModelRenderer nose2;
    ModelRenderer rightLeg;
    ModelRenderer leftLeg;
    ModelRenderer mainBody;
    ModelRenderer headHair;
    ModelRenderer HairFront;
    ModelRenderer HairBack;
    ModelRenderer rightTooth;
    ModelRenderer leftTooth;
    ModelRenderer ahoFur1;
    ModelRenderer ahoFur2;

    public ModelMammoth()
    {
        textureWidth = 64;
        textureHeight = 32;
        headmain = new ModelRenderer(this, 46, 11);
        headmain.addBox(-2F, -3F, -3.5F, 4, 5, 5);
        headmain.setRotationPoint(0F, 15.5F, -1.5F);
        headmain.setTextureSize(64, 32);
        headmain.mirror = true;
        setRotation(headmain, 0F, 0F, 0F);
        buttom = new ModelRenderer(this, 30, 0);
        buttom.addBox(-3F, 0F, 3F, 6, 4, 3);
        buttom.setRotationPoint(0F, 16F, 0F);
        buttom.setTextureSize(64, 32);
        buttom.mirror = true;
        setRotation(buttom, 0F, 0F, 0F);
        nose1 = new ModelRenderer(this, 0, 21);
        nose1.addBox(-1F, 1F, -3.5F, 2, 4, 2);
        nose1.setRotationPoint(0F, 15.5F, -1.5F);
        nose1.setTextureSize(64, 32);
        nose1.mirror = true;
        setRotation(nose1, -0.1897142F, 0F, 0F);
        leftArm = new ModelRenderer(this, 56, 0);
        leftArm.addBox(-1F, 0F, -1F, 2, 7, 2);
        leftArm.setRotationPoint(1.5F, 17F, -1F);
        leftArm.setTextureSize(64, 32);
        leftArm.mirror = true;
        setRotation(leftArm, 0F, 0F, 0F);
        rightArm = new ModelRenderer(this, 48, 0);
        rightArm.addBox(-1F, 0F, -1F, 2, 7, 2);
        rightArm.setRotationPoint(-1.5F, 17F, -1F);
        rightArm.setTextureSize(64, 32);
        rightArm.mirror = true;
        setRotation(rightArm, 0F, 0F, 0F);
        nose2 = new ModelRenderer(this, 0, 27);
        nose2.addBox(-1F, 5F, -1.5F, 2, 3, 2);
        nose2.setRotationPoint(0F, 15.5F, -1.5F);
        nose2.setTextureSize(64, 32);
        nose2.mirror = true;
        setRotation(nose2, -0.5986789F, 0F, 0F);
        rightLeg = new ModelRenderer(this, 48, 0);
        rightLeg.addBox(-1F, 0F, -1F, 2, 7, 2);
        rightLeg.setRotationPoint(-1.5F, 17F, 4.5F);
        rightLeg.setTextureSize(64, 32);
        rightLeg.mirror = true;
        setRotation(rightLeg, 0F, 0F, 0F);
        leftLeg = new ModelRenderer(this, 56, 0);
        leftLeg.addBox(-1F, 0F, -1F, 2, 7, 2);
        leftLeg.setRotationPoint(1.5F, 17F, 4.5F);
        leftLeg.setTextureSize(64, 32);
        leftLeg.mirror = true;
        setRotation(leftLeg, 0F, 0F, 0F);
        mainBody = new ModelRenderer(this, 18, 20);
        mainBody.addBox(-3F, -2F, -3F, 6, 6, 6);
        mainBody.setRotationPoint(0F, 16F, 0F);
        mainBody.setTextureSize(64, 32);
        mainBody.mirror = true;
        setRotation(mainBody, 0F, 0F, 0F);
        headHair = new ModelRenderer(this, 42, 21);
        headHair.addBox(-2.5F, -4F, -4F, 5, 5, 6);
        headHair.setRotationPoint(0F, 15.5F, -1.5F);
        headHair.setTextureSize(64, 32);
        headHair.mirror = true;
        setRotation(headHair, 0F, 0F, 0F);
        HairFront = new ModelRenderer(this, 0, 0);
        HairFront.addBox(-3.5F, -2.5F, 0.5F, 7, 9, 7);
        HairFront.setRotationPoint(0F, 16F, -4F);
        HairFront.setTextureSize(64, 32);
        HairFront.mirror = true;
        setRotation(HairFront, 0F, 0F, 0F);
        HairBack = new ModelRenderer(this, 30, 8);
        HairBack.addBox(-3F, 4F, 3F, 6, 2, 3);
        HairBack.setRotationPoint(0F, 16F, 0F);
        HairBack.setTextureSize(64, 32);
        HairBack.mirror = true;
        setRotation(HairBack, 0F, 0F, 0F);
        rightTooth = new ModelRenderer(this, 30, 5);
        rightTooth.addBox(0F, 1F, -9.5F, 0, 7, 8);
        rightTooth.setRotationPoint(0F, 15.5F, -1.5F);
        rightTooth.setTextureSize(64, 32);
        rightTooth.mirror = true;
        setRotation(rightTooth, 0F, 0F, 0.5235988F);
        leftTooth = new ModelRenderer(this, 30, 5);
        leftTooth.addBox(0F, 1F, -9.5F, 0, 7, 8);
        leftTooth.setRotationPoint(0F, 15.5F, -1.5F);
        leftTooth.setTextureSize(64, 32);
        leftTooth.mirror = true;
        setRotation(leftTooth, 0F, 0F, -0.5235988F);
        ahoFur1 = new ModelRenderer(this, 8, 24);
        ahoFur1.addBox(0F, -7F, -2.5F, 0, 3, 5);
        ahoFur1.setRotationPoint(0F, 15.5F, -1.5F);
        ahoFur1.setTextureSize(64, 32);
        ahoFur1.mirror = true;
        setRotation(ahoFur1, 0F, ((float)Math.PI / 4F), 0F);
        ahoFur2 = new ModelRenderer(this, 8, 24);
        ahoFur2.addBox(0F, -7F, -2.5F, 0, 3, 5);
        ahoFur2.setRotationPoint(0F, 15.5F, -1.5F);
        ahoFur2.setTextureSize(64, 32);
        ahoFur2.mirror = true;
        setRotation(ahoFur2, 0F, -((float)Math.PI / 4F), 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3,
            float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        headmain.render(f5);
        buttom.render(f5);
        nose1.render(f5);
        leftArm.render(f5);
        rightArm.render(f5);
        nose2.render(f5);
        rightLeg.render(f5);
        leftLeg.render(f5);
        mainBody.render(f5);
        headHair.render(f5);
        HairFront.render(f5);
        HairBack.render(f5);
        rightTooth.render(f5);
        leftTooth.render(f5);
        ahoFur1.render(f5);
        ahoFur2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3,
            float par4, float par5, float par6)
    {
        /*
         * this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
         * this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
         * this.body.rotateAngleX = ((float)Math.PI / 2F);
         */
        this.rightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F
                * par2;
        this.leftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F
                + (float) Math.PI)
                * 1.4F * par2;
        this.rightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F
                + (float) Math.PI)
                * 1.4F * par2;
        this.leftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F
                * par2;
    }
    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    public void setLivingAnimations(EntityLiving par1EntityLiving, float par2, float par3, float par4)
    {
        EntityMammoth var5 = (EntityMammoth)par1EntityLiving;
        int var6 = var5.getSwingTick();

        if (var6 > 0)
        {
            this.nose1.rotateAngleX = (-2.0F + 1.5F * this.func_48228_a((float)var6 - par4, 10.0F) / 3) - 0.1897142F;
            this.nose2.rotateAngleX = (-2.0F + 1.5F * this.func_48228_a((float)var6 - par4, 10.0F) / 3) - 0.5986789F;
        }
        else
        {
            this.nose1.rotateAngleX = -0.1897142F;
            this.nose2.rotateAngleX = -0.5986789F;
        }
    }
    private float func_48228_a(float par1, float par2)
    {
        return (Math.abs(par1 % par2 - par2 * 0.5F) - par2 * 0.25F) / (par2 * 0.25F);
    }
}
