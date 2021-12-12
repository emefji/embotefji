package com.emefji.embotefji;

import com.emefji.embotefji.commands.CommandRegistry;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        new CommandRegistry(this).Init();

        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "embotefji is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "embotefji is disabled!");
    }
}
