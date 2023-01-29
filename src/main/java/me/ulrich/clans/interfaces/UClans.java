package me.ulrich.clans.interfaces;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.api.AddonAPIManager;
import me.ulrich.clans.api.BossBarAPIManager;
import me.ulrich.clans.api.ClanAPIManager;
import me.ulrich.clans.api.HooksAPIManager;
import me.ulrich.clans.api.LibAPIManager;
import me.ulrich.clans.api.MoneyAPIManager;
import me.ulrich.clans.api.PlayerAPIManager;

public interface UClans {

	JavaPlugin getPlugin();

	ClanAPIManager getClanAPI();

	PlayerAPIManager getPlayerAPI();
	
	MoneyAPIManager getMoneyAPI();
	
	HooksAPIManager getHooksAPI();
	
	BossBarAPIManager getBossBarAPI();
	
	AddonAPIManager getAddonAPI();
	
	LibAPIManager getLibAPI();

	void loadAddons();
	void startTasks();
	void registerEvents();

	
	

}
