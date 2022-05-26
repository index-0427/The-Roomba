package com.github.index0427.theroomba.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * roomba3 - Undefined
 * Created using Tabula 7.1.0
 */
public class ModelRoomba extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;

    public ModelRoomba() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.shape2 = new ModelRenderer(this, 32, 0);
        this.shape2.setRotationPoint(-1.7F, 0.0F, 4.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F);
        this.setRotateAngle(shape2, 0.0F, 0.7853981633974483F, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
