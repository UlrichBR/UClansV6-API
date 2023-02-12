package me.ulrich.clans.data;

public class ClanEnum {
	
	public enum ClanLangs{
		EN, ES, RU, DE, BR;
	}
	
	public enum PlayerLeaveReaction{
		KICK, LEAVE;
	}
	
	public enum EnumExpand {
		VERT, UP, DOWN;
	}
	
	public enum MoneyType{
		VAULT, PLAYERPOINTS, CLANSOULS, TOKENENCHANT, DISABLED, ULTRAECONOMY;
	}
	public enum ImportStorage{
		MYSQL, SQLITE;
	}

	public enum ClanStorage{
		MYSQL, SQLITE, YAML, H2;
	}
	
	public enum MsgUsage{
		help, usage, error, success;
	}

	
	public enum SyncName {
		NULL, UPDATE, CHEST, BROADCAST, CLANCHAT, INVITE, ALLYINVITE, RIVALREMOVE;
	}
	
	public enum AllyInviteReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_INVITED;
	}
	public enum RivalRemoveReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_SENDED;
	}
	public enum WarReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_INVITED;
	}
	public enum EventState {
		STOPED, INLOBBY, STARTED, ENDING, CANCELED, INWAIT;
	}
	
	public enum BuyChestResponse {
		NEEDMONEY, ERROR, SUCCESS;
	}

	public enum PlaceholderTop{
		KILL, DEATH, KDR, MEMBER, BANK, LEVEL, WAR, ALL, POINT, PATENT;
	}
	
	public enum ClanActions{
		CREATE, NEWMEMBER, REMOVEMEMBER, WARWIN, WARLOSE, NEWALLIANCE, REMOVEALLIANCE, NEWRIVAL, REMOVERIVAL, PROMOTEMEMBER, DEMOTEMEMBER, DEATHMEMBER, KILLMEMBER;
	}
	
	public enum RivalAllyCount{
		RIVAL, ALLY;
	}
	
	public enum SettingsType{
		WARINVITE, ALLYSHAREDCHAT, JOINLEAVE, ALLYSHAREDHOME, CLANFF, OPENED, PUBLICHOMES;
	}
	
	public enum PlayerSettingsType{
		INVITATIONS;
	}
	
	public enum SettingsFlagsAccept {
		TRUE, FALSE, TOGGLE;
	}
	
	public enum ClanCommandActions{
		CREATE, DELETE, JOIN, LEAVE, MODTAG;
	}
	
	public enum HoloPreference{
		ANY, CMI, HOLOGRAPHICDISPLAYS, HOLOGRAMS, DECENTHOLOGRAMS;
	}
	
	public enum ChatDataType {
		CHANGENICKNAME, COMMANDUNKNOWNPLAYER, COMMANDUNKNOWNADMIN, CLANLEVELRECEIVED, CLANPATENTRECEIVED, CLANHOMECREATE, CLANCREATE, CLANMODTAG, CLANDESC, INVITERECEIVE, CLANREGROUPRECEIVE, CLANINVITE, CLANALLYRECEIVE, CLANRIVALREMOVE;
	}
	
}
