package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.utils.Cuboid;

public interface RegionAPI {
	
	boolean hasClaimLocation(String pluginName, Location location);
	
	boolean isOwnerClaimLocation(String pluginName, Player player, Location location);

	boolean isMemberClaimLocation(String pluginName, Player player, Location location);
	
	boolean getClaimOwner(String pluginName, Location location);

	Optional<Cuboid> getClaimCuboidLocation(String pluginName, Player player, Location location);

	boolean canDestroyClaimLocation(String pluginName, Player player, Location location);

	Optional<String> getPluginVersion(String pluginName);

}
