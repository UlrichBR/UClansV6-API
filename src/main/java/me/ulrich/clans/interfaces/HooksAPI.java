package me.ulrich.clans.interfaces;

import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.packets.WorldGuard.WorldGuardManager;

public interface HooksAPI {

	boolean isInDuel(Player player);
	
	Player getEnemyCombat(Player player);
	
	boolean removeCombat(Player player);
	
	boolean isInCombat(Player player);

	boolean isFloodgate();

	String getPlayerName(Player player);

	String parsePapi(Player player, String text);
	
	String parsePapi(UUID player, String text);
	
	boolean isWorldguard();

	WorldGuardManager getWorldguardManager();

	
	
}
