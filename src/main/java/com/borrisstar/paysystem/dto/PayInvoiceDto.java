package com.borrisstar.paysystem.dto;

import com.borrisstar.paysystem.domain.User;

import java.math.BigDecimal;

public class PayInvoiceDto {
	private String uid;// = UUID.randomUUID().toString();//Псевдоуникальный номер с датой
	private BigDecimal amount;
	private UserDto payer;
	private UserDto recipient;


	public PayInvoiceDto(String uid, BigDecimal amount, UserDto payer, UserDto recipient) {
		this.uid = uid;
		this.amount = amount;
		this.payer = payer;
		this.recipient = recipient;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public UserDto getPayer() {
		return payer;
	}

	public void setPayer(UserDto payer) {
		this.payer = payer;
	}

	public UserDto getRecipient() {
		return recipient;
	}

	public void setRecipient(UserDto recipient) {
		this.recipient = recipient;
	}
}
