package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.LoggerData;
import me.ulrich.clans.interfaces.LoggerAPI;

public class LoggerAPIManager implements LoggerAPI {

	public LoggerAPIManager(Clans clans) {
		
	}
	
	@Override
	public List<LoggerData> getClanLogger(UUID clanUUID) {
		return null;
	}
	
	@Override
	public List<LoggerData> getPluginLogger(UUID clanUUID, String plugin) {
		return null;
	}
	
	@Override
	public boolean removeClanLogger(UUID clanUUID, UUID loggerUUID) {
		return false;
	}
	
	@Override
	public boolean removeClanPluginLogger(UUID clanUUID, String plugin) {
		return false;
	}
	
	@Override
	public boolean clearClanLogger(UUID clanUUID) {
		return false;
	}
	
	@Override
	public boolean addClanLogger(UUID clanUUID, String text, String plugin) {
		return false;
	}
	
	@Override
	public HashMap<UUID, List<LoggerData>> getLoggerData() {
		return null;
	}
}
