package com.emefji.embotefji.commands;

import org.bukkit.plugin.java.JavaPlugin;

public class CommandRegistry {

    JavaPlugin plugin;

    public CommandRegistry(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void Init() {
        plugin.getCommand("ping").setExecutor(new Ping());
    }
}
