package com.borrisstar.paysystem.service;

import com.borrisstar.paysystem.domain.PayInvoice;


import java.math.BigDecimal;

//интерфейс сервиса, который будет отвечать за создание платежей в системе
public interface PaySystemService {
	PayInvoice createPaySystem(long payerId, long recipientId, BigDecimal amount);
}
