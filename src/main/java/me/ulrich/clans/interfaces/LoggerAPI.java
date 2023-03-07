package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import me.ulrich.clans.data.LoggerData;

public interface LoggerAPI {

	List<LoggerData> getClanLogger(UUID clanUUID);

	List<LoggerData> getPluginLogger(UUID clanUUID, String plugin);

	boolean removeClanLogger(UUID clanUUID, UUID loggerUUID);

	boolean removeClanPluginLogger(UUID clanUUID, String plugin);

	boolean clearClanLogger(UUID clanUUID);

	boolean addClanLogger(UUID clanUUID, String text, String plugin);

	HashMap<UUID, List<LoggerData>> getLoggerData();

}
