package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

import org.bukkit.Location;

public interface RegionAPI {

	HashMap<String, RegionImplement> getRegionAPI();

	boolean addImplementation(String pluginName, RegionImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPlugins();

	List<Entry<String, RegionImplement>> findClaimedLocationImplement(Location location);

	Optional<RegionImplement> getRegionImplemented(String pluginName);

}
