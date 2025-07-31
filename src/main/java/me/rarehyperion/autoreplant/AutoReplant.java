package me.rarehyperion.autoreplant;

import me.rarehyperion.autoreplant.listeners.CropHarvestListener;
import me.rarehyperion.autoreplant.managers.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoReplant extends JavaPlugin {

    @Override
    public void onEnable() {
        final ConfigManager configManager = new ConfigManager(this);
//        configManager.load();

        this.getServer().getPluginManager().registerEvents(new CropHarvestListener(configManager), this);
    }

    @Override
    public void onDisable() {

    }
}
