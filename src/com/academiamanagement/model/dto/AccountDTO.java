package com.academiamanagement.model.dto;

public class AccountDTO {
	
	private long id;
	private double balance;
	private long bankId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

}
