package com.github.klyser8.earthbounds.entity.model;

import com.github.klyser8.earthbounds.entity.CarboraneaEntity;
import com.github.klyser8.earthbounds.entity.RubroEntity;
import com.github.klyser8.earthbounds.registry.EarthboundEntities;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class RubroEntityModel extends EarthboundMobModel<RubroEntity> {

    public RubroEntityModel() {
        super(EarthboundEntities.RUBRO);
    }

    /**
     * Allows the head to move.
     */
    @Override
    public void setLivingAnimations(RubroEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");
        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 300F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 270F));
        }

    }

}
