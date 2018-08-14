package com.borrisstar.paysystem.domain;

import java.math.BigDecimal;
import java.util.Objects;
//класс для работы с платежами
public class PayInvoice extends Model{
	private String uid;// = UUID.randomUUID().toString();//Псевдоуникальный номер с датой
	private BigDecimal amount;
	private User payer;
	private User recipient;

	public PayInvoice() {
	}

	public PayInvoice(BigDecimal amount, User payer, User recipient) {
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

	public User getPayer() {
		return payer;
	}

	public void setPayer(User payer) {
		this.payer = payer;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}


}
