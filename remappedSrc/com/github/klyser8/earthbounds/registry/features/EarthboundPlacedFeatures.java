package com.github.klyser8.earthbounds.registry.features;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.PlacedFeature;

import static com.github.klyser8.earthbounds.Earthbounds.MOD_ID;

public class EarthboundPlacedFeatures {

    public static PlacedFeature SMALL_COAL_DEN;

    public void register() {
         SMALL_COAL_DEN = Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(MOD_ID, "small_coal_den"),
                EarthboundConfiguredFeatures.SMALL_COAL_DEN.withPlacement(
                        RarityFilterPlacementModifier.of(32),
                        SquarePlacementModifier.of(),
                        HeightmapPlacementModifier.of(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES),
                        BiomePlacementModifier.of()
                ));
    }

}