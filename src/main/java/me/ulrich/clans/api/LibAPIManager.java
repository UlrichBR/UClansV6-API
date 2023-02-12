package me.ulrich.clans.api;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import me.ulrich.clans.Clans;
import me.ulrich.clans.data.CommandData;
import me.ulrich.clans.data.CommandData_actionbar;
import me.ulrich.clans.data.CommandData_disable;
import me.ulrich.clans.data.CommandData_show;
import me.ulrich.clans.data.CommandData_sound;
import me.ulrich.clans.data.CommandData_title;
import me.ulrich.clans.interfaces.ClansCommand;
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
	public HashMap<String, CommandData> getClanCommander() {
		return null;
	}

	@Override
	public HashMap<String, CommandData> getUClanCommander() {
		return null;
	}
	
	@Override
	public void unRegisterCommand(String command) {}
	
	@Override
	public void registerCommand(String alias, ClansCommand command) {}

	@Override
	public void insertCommand(String command, String permission, String alias, double value, int cooldown, CommandData_show data,CommandData_title title, CommandData_actionbar actionbar, CommandData_sound sound, HashMap<String, CommandData_show> subcommands, CommandData_disable disable) {}
	
	@Override
	public HashMap<String, String> getCommandAliases(){
		return null;
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

	

}
