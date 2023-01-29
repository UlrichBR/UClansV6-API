package me.ulrich.clans;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.api.AddonAPIManager;
import me.ulrich.clans.api.BossBarAPIManager;
import me.ulrich.clans.api.ClanAPIManager;
import me.ulrich.clans.api.HooksAPIManager;
import me.ulrich.clans.api.LibAPIManager;
import me.ulrich.clans.api.MoneyAPIManager;
import me.ulrich.clans.api.PlayerAPIManager;
import me.ulrich.clans.data.Addon;
import me.ulrich.clans.interfaces.UClans;
import me.ulrich.clans.manager.HologramManager;

public final class Clans extends JavaPlugin implements UClans{

	//addon usage
	private HashMap<Addon, Boolean> addonEnabledList = new HashMap<Addon, Boolean>();
	private boolean multiServer = false;
	
	private final ClanAPIManager ClanAPI;
	private final PlayerAPIManager PlayerAPI;
	private final MoneyAPIManager MoneyAPI;
	private final HooksAPIManager HooksAPI;
	private final BossBarAPIManager BossBarAPI;
	private final LibAPIManager libAPI;
	private final AddonAPIManager AddonAPI;
	private HologramManager hologramManager;

	public Clans() {
		this.ClanAPI = new ClanAPIManager(this);
		this.PlayerAPI = new PlayerAPIManager(this);
		this.MoneyAPI = new MoneyAPIManager(this);
		this.HooksAPI = new HooksAPIManager(this);
		this.BossBarAPI = new BossBarAPIManager(this);
		this.libAPI = new LibAPIManager(this);
		this.AddonAPI = new AddonAPIManager(this);
		}
	
	@Override
	public JavaPlugin getPlugin() {
		return null;
	}

	@Override
	public ClanAPIManager getClanAPI() {
		return null;
	}

	@Override
	public PlayerAPIManager getPlayerAPI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibAPIManager getLibAPI() {
		return null;
	}
	
	@Override
	public MoneyAPIManager getMoneyAPI() {
		return null;
	}

	@Override
	public HooksAPIManager getHooksAPI() {
		return null;
	}

	@Override
	public BossBarAPIManager getBossBarAPI() {
		return null;
	}
	
	@Override
	public AddonAPIManager getAddonAPI() {
		return null;
	}
	
	public HashMap<Addon, Boolean> getAddonEnabledList() {
		return addonEnabledList;
	}

	public boolean isMultiServer() {
		return multiServer;
	}

	public HologramManager getHologramManager() {
		return hologramManager;
	}

	@Override
	public void loadAddons() {
		
	}

	@Override
	public void startTasks() {
		
	}

	@Override
	public void registerEvents() {
		
	}



}
