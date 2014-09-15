package com.mythbusterma.prisonscoreboard;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        setupPermissions();

        saveDefaultConfig();
    }

    @Override
    public void onDisable() {

    }

    @override
    public void onLoad() {

    }
}
