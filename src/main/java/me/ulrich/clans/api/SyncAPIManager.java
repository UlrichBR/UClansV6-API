package me.ulrich.clans.api;

import java.util.List;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanEnum.RedisType;
import me.ulrich.clans.interfaces.SyncAPI;

public class SyncAPIManager implements SyncAPI {

	private final Clans plugin;

	public SyncAPIManager(Clans clans) {
		this.plugin = clans;
	}
	
	@Override
	public boolean syncEnabled() {
		return false;
	}

	@Override
	public void newSync(RedisType type, String string) {

	}
	
	@Override
	public void serverConnector(Player player, String server) {

	}
	
	@Override
	public List<String> getProxyedPlayers() {
		return null;
	}

	@Override
	public void setProxyedPlayers(List<String> proxyedPlayers) {

	}
	
	public Clans getPlugin() {
		return plugin;
	}
}
