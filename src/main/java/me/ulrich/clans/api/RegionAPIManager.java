package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.RegionAPI;

public class RegionAPIManager implements RegionAPI {

	public HashMap<String, RegionAPI> getRegionAPI(){
		return null;
	}
	
	public RegionAPIManager(Clans clans) {
	
	}
	
	public boolean addImplementation(String pluginName, RegionAPI region) {
		return false;
	}

	public boolean hasPluginImplemented(String pluginName) {
		return false;
	}
	
	public boolean removeImplementation(String pluginName) {
		return false;
	}
	
	public List<String> getImplementationPlugins() {
		return null;
	}
	
	public List<Entry<String, RegionAPI>> findClaimedLocationImplement(Location location){
		return null;
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
	public Location[] getClaimCornersLocation(String pluginName, Player player, Location location) {
		return new Location[0];
	}

	@Override
	public boolean canDestroyClaimLocation(String pluginName, Player player, Location location) {
		return false;
	}

	@Override
	public Optional<String> getPluginVersion(String pluginName) {
		return Optional.empty();
	}

	@Override
	public Optional<String> getClaimName(String pluginName, Location location) {
		return Optional.empty();
	}





	

}
