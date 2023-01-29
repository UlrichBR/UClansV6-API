package me.ulrich.clans.api;

import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.HooksAPI;
import me.ulrich.clans.packets.WorldGuard.WorldGuardManager;

public class HooksAPIManager implements HooksAPI {


	public HooksAPIManager(Clans plugin) {

	}

	@Override
	public boolean isInDuel(Player player) {
		return false;
	}

	@Override
	public Player getEnemyCombat(Player player) {
		return null;
	}

	@Override
	public boolean removeCombat(Player player) {
		return false;
	}

	@Override
	public boolean isInCombat(Player player) {
		return false;
	}

	@Override
	public boolean isFloodgate() {
		return false;
	}
	
	@Override
	public String getPlayerName(Player player) {
		return null;
	}
	
	@Override
	public String parsePapi(Player player, String text) {
		return null;
	}
	@Override
	public String parsePapi(UUID player, String text) {
		return null;
	}
	
	@Override
	public boolean isWorldguard() {
		return false;
	}

	@Override
	public WorldGuardManager getWorldguardManager() {
		return null;
	}
	
}
