package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface RegionAPI {
	
	boolean hasClaimLocation(String pluginName, Location location);
	
	boolean isOwnerClaimLocation(String pluginName, Player player, Location location);

	boolean isMemberClaimLocation(String pluginName, Player player, Location location);
	
	Optional<UUID> getClaimOwner(String pluginName, Location location);

	Location[] getClaimCornersLocation(String pluginName, Player player, Location location);

	boolean canDestroyClaimLocation(String pluginName, Player player, Location location);
	
	Optional<String> getClaimName(String pluginName, Location location);
	
	Optional<String> getPluginVersion(String pluginName);

}
