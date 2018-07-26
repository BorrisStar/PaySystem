package com.borrisstar.paysystem.service;

import com.borrisstar.paysystem.domain.PaySystem;

import java.math.BigDecimal;

//интерфейс сервиса, который будет отвечать за создание платежей в системе
public interface PaySystemService {
	PaySystem createPaySystem(long payerId, long recipientId, BigDecimal amount);
}
