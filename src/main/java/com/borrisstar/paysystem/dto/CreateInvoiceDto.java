package com.borrisstar.paysystem.dto;

import com.borrisstar.paysystem.domain.User;

import java.math.BigDecimal;

public class CreateInvoiceDto {
	private BigDecimal amount;
	private long payerId;
	private long recipientId;
}
