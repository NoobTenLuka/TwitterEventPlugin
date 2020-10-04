package io.github.noobtenluka.twittereventplugin;

import io.github.noobtenluka.twittereventplugin.listeners.PlayerJoin;
import io.github.noobtenluka.twittereventplugin.listeners.PlayerQuit;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TwitterEventPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoin(), this);
        pluginManager.registerEvents(new PlayerQuit(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}
