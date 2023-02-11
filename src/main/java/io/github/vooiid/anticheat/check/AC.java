package io.github.vooiid.anticheat.check;

import java.util.function.Predicate;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import lombok.Getter;
import lombok.Setter;

@Getter
public class AC implements Listener
{

    private String name;

    @Setter
    private boolean autoBan;
    @Setter
    private int maxAlerts = 30;
    @Setter
    private boolean alertBungee;

	public AC() {
    name = getClass().getSimpleName().replace("AC", "");
//		alertMap = new HashMap<>();
}

    public void alert(Player player) {
    alert(player, 0);
}

    public void alert(Player player, int cps) {

        broadcast(player.getPlayer(), "§9Anticheat> §fO jogador §d" + player.getName() + "§f está usando §c" + getName()
                + (cps > 0 ? " §4(" + cps + " cps)" : "") + " §7(" + 1 + "/" + maxAlerts + ")!");

    }

    public void broadcast(Player staffMember, String message) {
        if (staffMember.hasPermission("anticheat.alerts")) {
            staffMember.sendMessage(message);
        }
    }

}