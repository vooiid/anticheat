package io.github.vooiid.anticheat;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class Management extends JavaPlugin
{

    public abstract void load();

    public abstract void enable();

    public abstract void disable();

    @Override
    public void onLoad() {
        this.load();
    }

    @Override
    public void onEnable() {
        this.enable();
    }

    @Override
    public void onDisable() {
        this.disable();
    }

}
