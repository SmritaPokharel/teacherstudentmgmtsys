package com.academiamanagement.model.dto;

public class UserLinkAccountDTO {
	
	private long userId;
	private long accountId;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

}
