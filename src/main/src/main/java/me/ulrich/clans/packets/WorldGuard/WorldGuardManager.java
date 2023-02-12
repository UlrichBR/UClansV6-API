package me.ulrich.clans.packets.WorldGuard;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class WorldGuardManager {

    public void setEnabled(boolean enabled) {}

    public boolean isEnabled() {
		return false;
    }

    public void initializeWg(Plugin plugin) { }
    
    public boolean isInRegion(Player player, String region) {
		return false;
    }

    public List<String> getPlayerRegion(Player player) {
		return null;
    }
}
