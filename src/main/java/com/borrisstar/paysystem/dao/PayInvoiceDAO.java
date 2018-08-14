package com.borrisstar.paysystem.dao;

import com.borrisstar.paysystem.domain.PayInvoice;
import com.borrisstar.paysystem.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PayInvoiceDAO {
	Map<String, PayInvoice> invoices = new HashMap<>();

	public PayInvoice getInvoice(String uid) {
		return invoices.get(uid);
	}

	public PayInvoice putInvoice(PayInvoice payInvoice){
		 invoices.put(payInvoice.getUid(), payInvoice);
		return payInvoice;
	}


}
