package com.borrisstar.paysystem.service;

import com.borrisstar.paysystem.dao.PaySystemDAO;
import com.borrisstar.paysystem.domain.PayInvoice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

//реализация сервиса
@Service(value = "paySystemService")
public class PaySystemServiceImpl implements PaySystemService {

	@Resource(name = "paySystemDAO")//Эта аннотация сообщает spring'у, сделать инъекцию при инициализации класса
	private PaySystemDAO dao;

	public PayInvoice createPaySystem(long payerId, long recipientId, BigDecimal amount) {
		//PayInvoice payInvoice = new PayInvoice(amount, payerId, recipientId);

		//dao.savePaySystem(payInvoice);
		return null;//payInvoice;
	}
}
