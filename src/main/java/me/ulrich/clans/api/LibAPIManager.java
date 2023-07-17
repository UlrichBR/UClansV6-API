package me.ulrich.clans.api;

import java.util.Optional;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanEnum.TranslatableKey;
import me.ulrich.clans.interfaces.Hologram;
import me.ulrich.clans.interfaces.LibAPI;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public class LibAPIManager implements LibAPI {


	public LibAPIManager(Clans clans) {}
	
	@Override
	public BukkitAudiences getAdventure() {
		return null;
	}
	
	@Override
	public boolean isUseGUI() {
		return false;
	}
	
	@Override
	public String getPluginTag() {
		return null;
	}
	
	@Override
	public void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut) {}
	
	@Override
	public void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut) {}
	
	@Override
	public void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut) {}
	
	@Override
	public void sendActionBar(Player p, String message) {}
	
	@Override
	public boolean isHoloEnabled() {
		return false;
	}

	@Override
	public Hologram createHolo(Location location, String id, Object extra) {
		return null;
	}
	
	public Clans getPlugin() {
		return null;
	}

	@Override
	public boolean removeIfPreset(String id) {
		return false;
	}

	@Override
	public Optional<Hologram> getHolo(String id) {
		return Optional.empty();
	}

	@Override
	public String translate(TranslatableKey trans, String object, String... args) {
		return null;
	}
	
	@Override
	@Deprecated
	public String translateOutReference(String key, String object, String... args) {
		return null;
	}

}
