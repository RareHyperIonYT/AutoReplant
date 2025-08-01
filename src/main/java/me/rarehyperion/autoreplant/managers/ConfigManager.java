package me.rarehyperion.autoreplant.managers;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigManager {

    private final JavaPlugin plugin;

    // SFX
    private boolean soundEffects;
    private float soundVolume, soundPitch;
    private String soundSource;
    
    public ConfigManager(final JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void load() {
        this.plugin.saveDefaultConfig();
        this.plugin.reloadConfig();

        final FileConfiguration config = this.plugin.getConfig();

        // Replant SFX
        this.soundEffects = config.getBoolean("sound.enabled", true);
        this.soundSource = config.getString("sound.source", "entity.ender_dragon.flap");
        this.soundVolume = (float) config.getDouble("sound.volume", 0.5D);
        this.soundPitch = (float) config.getDouble("sound.pitch", 1.32D);
    }

    public void reload() {
        this.load();
    }

    public boolean shouldPlaySoundEffects() {
        return this.soundEffects;
    }
    
    public float getSoundVolume() {
        return this.soundVolume;
    }

    public float getSoundPitch() {
        return this.soundPitch;
    }

    public String getSoundSource() {
        return this.soundSource;
    }
    
}
