package com.github.index0427.theroomba.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRoomba extends ModelBase {
//    public ModelRoomba() { }

    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;

    public ModelRoomba() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(0.0F, 18.3F, 7.6F);
        this.shape3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(shape3, 0.2617993877991494F, 0.0F, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 15);
        this.shape2.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.shape2.addBox(-3.5F, -1.7F, -2.2000000000000006F, 7, 7, 10, 0.0F);
        this.shape1 = new ModelRenderer(this, 4, 0);
        this.shape1.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.shape1.addBox(-5.0F, -4.5F, -12.199999999999992F, 10, 10, 10, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shape3.render(f5);
        this.shape2.render(f5);
        this.shape1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}