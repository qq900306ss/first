package org.example1.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.example1.firstplugin.CopyConfig.CopyConfig;
import org.example1.firstplugin.CopyConfig.LoadConfig;
import org.example1.firstplugin.announcement.SendMessage;
import org.example1.firstplugin.command.MainCommand;
import org.example1.firstplugin.command.TabCommand;

public final class Firstplugin extends JavaPlugin {

    public static  Firstplugin firstplugin;

    @Override
    public void onEnable() {
        firstplugin = this;
        this.getLogger().info("第一次做插件");
        firstplugin.getLogger().info("第一次做插件2");
        // Plugin startup logic
        Bukkit.getPluginCommand("first").setExecutor(new MainCommand());

        Bukkit.getPluginCommand("first").setTabCompleter(new TabCommand());

        CopyConfig.copy();
        SendMessage.send();
        LoadConfig.load();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
