package org.example1.firstplugin.announcement;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import org.bukkit.scheduler.BukkitRunnable;
import org.example1.firstplugin.CopyConfig.LoadConfig;
import org.example1.firstplugin.Firstplugin;

import java.io.File;
import java.util.List;

public class SendMessage {
    public  static void send(){
        File file = new File(Firstplugin.firstplugin.getDataFolder(), "/announcement.yml");

        FileConfiguration aConfig = YamlConfiguration.loadConfiguration(file);

        int time = aConfig.getInt("announcement.long");

        boolean random = aConfig.getBoolean("announcement.random");

        String test = aConfig.getString("announcement.Test");

        List<String> aList = aConfig.getStringList("announcement.List");

        BukkitRunnable bukkitRunnable = new BukkitRunnable() {
            int order = 0;
            @Override
            public void run() {
                for(Player player : Bukkit.getOnlinePlayers()){
                    player.sendMessage(LoadConfig.aList.get(order));
                }
                order++;
                if(order >= LoadConfig.aList.size()){
                    order = 0;
                }


            }
        };
        bukkitRunnable.runTaskTimer(Firstplugin.firstplugin , 0 ,time * 20);

    }
}
