package me.ulrich.clans.data;

public class SettingsData {

	private boolean warInvite;
	private boolean allySharedChat;
	private boolean joinLeave;
	private boolean allySharedHome;
	private boolean memberManagerWars;
	private boolean memberManagerHomes;
	private boolean opened;
	private boolean publicHomes;

	public SettingsData(boolean warInvite, boolean allySharedChat, boolean joinLeave, boolean allySharedHome, boolean memberManagerWars, boolean memberManagerHomes, boolean opened, boolean publicHomes) {
		this.setWarInvite(warInvite);
		this.setAllySharedChat(allySharedChat);
		this.setJoinLeave(joinLeave);
		this.setAllySharedHome(allySharedHome);
		this.setMemberManagerWars(memberManagerWars);
		this.setMemberManagerHomes(memberManagerHomes);
		this.setOpened(opened);
		this.setPublicHomes(publicHomes);

	}

	public boolean isWarInvite() {
		return warInvite;
	}

	public void setWarInvite(boolean warInvite) {
		this.warInvite = warInvite;
	}

	public boolean isAllySharedChat() {
		return allySharedChat;
	}

	public void setAllySharedChat(boolean allySharedChat) {
		this.allySharedChat = allySharedChat;
	}

	public boolean isJoinLeave() {
		return joinLeave;
	}

	public void setJoinLeave(boolean joinLeave) {
		this.joinLeave = joinLeave;
	}

	public boolean isAllySharedHome() {
		return allySharedHome;
	}

	public void setAllySharedHome(boolean allySharedHome) {
		this.allySharedHome = allySharedHome;
	}

	public boolean isMemberManagerWars() {
		return memberManagerWars;
	}

	public void setMemberManagerWars(boolean memberManagerWars) {
		this.memberManagerWars = memberManagerWars;
	}

	public boolean isMemberManagerHomes() {
		return memberManagerHomes;
	}

	public void setMemberManagerHomes(boolean memberManagerHomes) {
		this.memberManagerHomes = memberManagerHomes;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public boolean isPublicHomes() {
		return publicHomes;
	}

	public void setPublicHomes(boolean publicHomes) {
		this.publicHomes = publicHomes;
	}
}
