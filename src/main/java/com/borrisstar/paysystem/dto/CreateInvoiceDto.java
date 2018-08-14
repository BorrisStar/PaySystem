package com.borrisstar.paysystem.dto;

import com.borrisstar.paysystem.domain.User;

import java.math.BigDecimal;

public class CreateInvoiceDto {
	private BigDecimal amount;
	private Integer payerId;
	private Integer recipientId;

	public CreateInvoiceDto(BigDecimal amount, Integer payerId, Integer recipientId) {
		this.amount = amount;
		this.payerId = payerId;
		this.recipientId = recipientId;
	}
	public CreateInvoiceDto(){

	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getPayerId() {
		return payerId;
	}

	public void setPayerId(Integer payerId) {
		this.payerId = payerId;
	}

	public Integer getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(Integer recipientId) {
		this.recipientId = recipientId;
	}
}
