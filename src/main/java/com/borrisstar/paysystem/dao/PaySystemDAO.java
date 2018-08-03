package com.borrisstar.paysystem.dao;

import com.borrisstar.paysystem.domain.PayInvoice;

//интерфейс для работы с хранилищем
public interface PaySystemDAO {
	void savePaySystem(PayInvoice payInvoice);
}
