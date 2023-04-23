package me.ulrich.clans.api;

import java.util.Optional;
import java.util.UUID;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.DiscordAPI;

public class DiscordAPIManager implements DiscordAPI {

	private final Clans plugin;

	public DiscordAPIManager(Clans clans) {
		this.plugin = clans;
	}
	
	@Override
	public boolean sendClanHookMessage(UUID clanUUID, String title, String content, String autor, String autorIcon ) {
		return this.plugin.getDiscordManager().sendClanHookMessage(clanUUID, title, content, autor, autorIcon);
	}
	
	@Override 
	public boolean hasWebhook(UUID clanUUID) {
		return this.plugin.getDiscordManager().hasWebhook(clanUUID);
	}
	
	@Override
	public Optional<String> getWebhook(UUID clanUUID) {
		return this.plugin.getDiscordManager().getWebhook(clanUUID);
	}
	
	@Override
	public boolean changeWebhook(UUID clanUUID, String url) {
		return this.plugin.getDiscordManager().changeWebhook(clanUUID, url);
	}
	
	@Override
	public boolean removeWebhook(UUID clanUUID) {
		return this.plugin.getDiscordManager().removeWebhook(clanUUID);
	}
}
