package org.example1.firstplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.example1.firstplugin.CopyConfig.LoadConfig;
import org.example1.firstplugin.Firstplugin;

public class MainCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(args.length == 1){
            if(args[0].equals("test")){
                Firstplugin.firstplugin.getLogger().info("本人");
                if(sender instanceof Player){
                    Player player = (Player) sender;
                    player.sendMessage("測試發送給玩家");
                }
            }


        }
        if(args.length ==1){
            if(args[0].equals("reload")){
                LoadConfig.load();;
                Firstplugin.firstplugin.getLogger().info("重新讀取設定");
                if(sender instanceof Player){
                    Player player = (Player) sender;
                    player.sendMessage(("發現給玩家重新讀取囉"));
                }
            }
        }
        return false;
    }
}
