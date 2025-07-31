package me.rarehyperion.autoreplant.managers;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigManager {

    private final JavaPlugin plugin;
    private FileConfiguration config;

    public ConfigManager(final JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void load() {
        this.plugin.saveDefaultConfig();
        this.plugin.reloadConfig();

        final FileConfiguration config = this.plugin.getConfig();

    }

    public void reload() {
        this.load();
    }

}
