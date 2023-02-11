package io.github.vooiid.anticheat.antiwdl;

import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class Receiver implements PluginMessageListener
{

    @Override
    public void onPluginMessageReceived(String channelName, Player player, byte[] bytes) {
        if (channelName.equals("WDL|INIT")) {
            player.kickPlayer("§c§lERRO!\n\n§cDetectamos o uso de clients com sistema de WORLDDOWNLOADER.\n§cUtilize outro client e tente novamente.");
        }
    }

}
