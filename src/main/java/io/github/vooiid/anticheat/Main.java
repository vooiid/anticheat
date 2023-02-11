package io.github.vooiid.anticheat;

import io.github.vooiid.anticheat.antiwdl.Receiver;
import io.github.vooiid.anticheat.string.Strings;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.plugin.PluginManager;

@Getter
public class Main extends Management
{

    @Getter
    private static Main instance;
    PluginManager pm = Bukkit.getPluginManager();

    public void setup() {
        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        getServer().getMessenger().registerOutgoingPluginChannel(this, "WDL|CONTROL");
        getServer().getMessenger().registerIncomingPluginChannel(this, "WDL|INIT", new Receiver());

    }

    @Override
    public void load() {
        instance = this;
    }

    @Override
    public void enable() {
        setup();
        Bukkit.getConsoleSender().sendMessage(Color.GREEN + Strings.PREFIX_CONSOLE + "§aSistema inicializado com sucesso.");
    }

    @Override
    public void disable() {
        Bukkit.getConsoleSender().sendMessage(Color.RED + Strings.PREFIX_CONSOLE + "§aSistema inicializado com sucesso.");
    }

}