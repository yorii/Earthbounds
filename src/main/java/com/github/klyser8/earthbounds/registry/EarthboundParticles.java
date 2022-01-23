package com.github.klyser8.earthbounds.registry;

import com.github.klyser8.earthbounds.Earthbounds;
import com.github.klyser8.earthbounds.client.particle.RuneParticleEffect;
import com.github.klyser8.earthbounds.client.particle.ScorchAshParticle;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EarthboundParticles {

    public static final DefaultParticleType SCORCH_ASH = FabricParticleTypes.simple();
    public static final DefaultParticleType RUNE = FabricParticleTypes.simple();

    public static void register() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(Earthbounds.MOD_ID, "scorch_ash"), SCORCH_ASH);
        ParticleFactoryRegistry.getInstance().register(SCORCH_ASH, ScorchAshParticle.Factory::new);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(Earthbounds.MOD_ID, "rune"), RUNE);
        ParticleFactoryRegistry.getInstance().register(RUNE, RuneParticleEffect.Factory::new);
    }

}
