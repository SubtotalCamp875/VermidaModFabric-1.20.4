package net.subtotalcamp875.vermidamod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.subtotalcamp875.vermidamod.VermidaModFabric;

public class ModSounds {

    public static final SoundEvent ECHOS_OF_SUMMONS = registerSoundEvent("echos_of_summons");
    public static final SoundEvent BRONZE_SHAMAN_CAMP_AMBIENCE = registerSoundEvent("bronze_shaman_camp_ambience");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(VermidaModFabric.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        VermidaModFabric.LOGGER.info("Registering Sounds for " + VermidaModFabric.MOD_ID);
    }
}
