package com.borrisstar.paysystem.dao;

import com.borrisstar.paysystem.domain.PaySystem;

//интерфейс для работы с хранилищем
public interface PaySystemDAO {
	void savePaySystem(PaySystem paySystem);
}
