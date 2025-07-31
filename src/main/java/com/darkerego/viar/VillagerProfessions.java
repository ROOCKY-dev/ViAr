package com.darkerego.viar;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VillagerProfessions {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, ViAr.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, ViAr.MODID);

    public static final RegistryObject<PoiType> GEOLOGY_TABLE_POI = POI_TYPES.register("geology_table",
            () -> new PoiType(ImmutableSet.copyOf(ViAr.GEOLOGY_TABLE.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final RegistryObject<VillagerProfession> GEOLOGIST = VILLAGER_PROFESSIONS.register("geologist",
            () -> new VillagerProfession("geologist", x -> x.get() == GEOLOGY_TABLE_POI.get(), x -> x.get() == GEOLOGY_TABLE_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));
}
