package me.rarehyperion.autoreplant;

import com.cryptomorin.xseries.XSound;
import me.rarehyperion.autoreplant.commands.AutoReplantCommand;
import me.rarehyperion.autoreplant.listeners.CropHarvestListener;
import me.rarehyperion.autoreplant.managers.ConfigManager;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class AutoReplant extends JavaPlugin {

    public static String VERSION = "UNKNOWN";

    @Override
    public void onLoad() {
        VERSION = this.getDescription().getVersion();
    }

    @Override
    public void onEnable() {
        final PluginManager pluginManager = this.getServer().getPluginManager();
        final ConfigManager configManager = new ConfigManager(this);

        configManager.load();

        pluginManager.registerEvents(new CropHarvestListener(this, configManager), this);

        final AutoReplantCommand executor = new AutoReplantCommand(configManager);
        final PluginCommand command = Objects.requireNonNull(this.getCommand("autoreplant"));

        command.setExecutor(executor);
        command.setTabCompleter(executor);
    }

    @Override
    public void onDisable() {

    }
}
