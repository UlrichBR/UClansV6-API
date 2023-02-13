package me.ulrich.clans.interfaces;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.CommandData;
import me.ulrich.clans.data.CommandData_actionbar;
import me.ulrich.clans.data.CommandData_disable;
import me.ulrich.clans.data.CommandData_show;
import me.ulrich.clans.data.CommandData_sound;
import me.ulrich.clans.data.CommandData_title;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public interface LibAPI {

	HashMap<String, CommandData> getClanCommander();

	HashMap<String, CommandData> getUClanCommander();
	
	void unRegisterCommand(String command);

	void insertCommand(String command, String permission, String alias, double value, int cooldown, CommandData_show data,CommandData_title title, CommandData_actionbar actionbar, CommandData_sound sound, HashMap<String, CommandData_show> subcommands, CommandData_disable disable);

	void registerCommand(String alias, ClansCommand command);

	void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut);

	void sendActionBar(Player p, String message);

	String getPluginTag();

	boolean isHoloEnabled();
	
	Hologram createHolo(final Location location, String id, Object extra);

	BukkitAudiences getAdventure();

	HashMap<String, String> getCommandAliases();

	HashMap<String, String> getMainCommandAliases();

	String replaceMainCmd(String string);

	String replaceCmd(String string);

	void showHelpSubmessage(CommandSender sender, CommandData commander);

	boolean findAliases(String sub, String alias);

	String findReturnAliases(String sub);

	String findReturnMain(String sub);

	String findAliasesByValue(String sub);

	boolean isUseGUI();
	
}
