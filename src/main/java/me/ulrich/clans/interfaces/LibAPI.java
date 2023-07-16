package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanEnum.TranslatableKey;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public interface LibAPI {

	

	void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut);

	void sendActionBar(Player p, String message);

	String getPluginTag();

	boolean isHoloEnabled();
	
	Hologram createHolo(final Location location, String id, Object extra);

	BukkitAudiences getAdventure();

	boolean isUseGUI();

	boolean removeIfPreset(String id);

	Optional<Hologram> getHolo(String id);

	String translate(TranslatableKey trans, String object, String... args);
	
}
