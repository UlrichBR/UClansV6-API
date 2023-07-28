package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.RegionAPI;
import me.ulrich.clans.utils.Cuboid;

public class RegionAPIManager implements RegionAPI {

	public HashMap<String, RegionAPI> getRegionAPI(){
		return null;
	}
	
	public RegionAPIManager(Clans clans) {
	
	}

	@Override
	public boolean hasClaimLocation(String pluginName, Location location) {
		return false;
	}

	@Override
	public boolean isOwnerClaimLocation(String pluginName, Player player, Location location) {
		return false;
	}

	@Override
	public boolean isMemberClaimLocation(String pluginName, Player player, Location location) {
		return false;
	}

	@Override
	public Optional<UUID> getClaimOwner(String pluginName, Location location) {
		return null;
	}

	@Override
	public Optional<Cuboid> getClaimCuboidLocation(String pluginName, Player player, Location location) {
		return Optional.empty();
	}

	@Override
	public boolean canDestroyClaimLocation(String pluginName, Player player, Location location) {
		return false;
	}

	@Override
	public Optional<String> getPluginVersion(String pluginName) {
		return Optional.empty();
	}





	

}
