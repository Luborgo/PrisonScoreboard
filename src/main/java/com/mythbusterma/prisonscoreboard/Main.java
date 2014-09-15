package com.mythbusterma.prisonscoreboard;

import net.milkbowl.vault.permission.Permission;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public Permission permission = null;

    @Override
    public void onEnable() {
        setupPermissions();
    }

    @Override
    public void onDisable() {

    }

    private boolean setupPermissions()
    {
        RegisteredServiceProvider<Permission> permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
        if (permissionProvider != null) {
            permission = permissionProvider.getProvider();
        }
        return (permission != null);
    }

    public Permission getPermission () {
        return permission;
    }

}
