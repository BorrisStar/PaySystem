package com.borrisstar.paysystem.dto;

import com.borrisstar.paysystem.domain.User;

import java.math.BigDecimal;

public class PayInvoiceDto {
	private BigDecimal amount;
	private User payer;
	private User recipient;
}
