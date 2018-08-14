package com.borrisstar.paysystem.service;

import com.borrisstar.paysystem.dao.PayInvoiceDAO;
import com.borrisstar.paysystem.dao.UserDAO;
import com.borrisstar.paysystem.domain.PayInvoice;
import com.borrisstar.paysystem.domain.User;
import com.borrisstar.paysystem.dto.CreateInvoiceDto;
import com.borrisstar.paysystem.dto.PayInvoiceDto;
import com.borrisstar.paysystem.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PayInvoiceService {
	@Autowired
	PayInvoiceDAO payInvoiceDAO;
	@Autowired
	UserDAO userDAO;

	public PayInvoiceDto create(CreateInvoiceDto createInvoiceDto){

		PayInvoice payInvoice = new PayInvoice();

		payInvoice.setAmount(createInvoiceDto.getAmount());
		payInvoice.setUid(UUID.randomUUID().toString());
		payInvoice.setPayer(userDAO.getUser(createInvoiceDto.getPayerId()));
		payInvoice.setRecipient(userDAO.getUser(createInvoiceDto.getRecipientId()));
		//if() проверять что плательщик не равен принимающему
		PayInvoice payInvoiceCreated  = payInvoiceDAO.putInvoice(payInvoice);

		// Починить payInvoiceCreated.getPayer() и
		//payInvoiceCreated.getRecipient())!!!

//public PayInvoiceDto(String uid, BigDecimal amount, UserDto payer, UserDto recipient)
		//Преобразовать User  в UserDto
		//public User(String fio, Integer age, Set<String> phones, String rating)
		UserDto userDto1 = new UserDto(payInvoiceCreated.getPayer().getFio(),payInvoiceCreated.getPayer().getAge(),
				payInvoiceCreated.getPayer().getPhones(), null);

		UserDto userDto2 = new UserDto(payInvoiceCreated.getRecipient().getFio(),payInvoiceCreated.getRecipient().getAge(),
				payInvoiceCreated.getRecipient().getPhones(), null);

		return new PayInvoiceDto(payInvoiceCreated.getUid(),payInvoiceCreated.getAmount(), userDto1, userDto2);


	}


	public PayInvoiceDto getInvoice(String uid) {

		 PayInvoice payInvoice = payInvoiceDAO.getInvoice(uid);

		UserDto userDto1 = new UserDto(payInvoice.getPayer().getFio(),payInvoice.getPayer().getAge(),
				payInvoice.getPayer().getPhones(), null);

		UserDto userDto2 = new UserDto(payInvoice.getRecipient().getFio(),payInvoice.getRecipient().getAge(),
				payInvoice.getRecipient().getPhones(), null);

		 return new PayInvoiceDto(payInvoice.getUid(), payInvoice.getAmount(), userDto1, userDto2);
	}
}
