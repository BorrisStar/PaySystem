package com.borrisstar.paysystem.dao;

import com.borrisstar.paysystem.domain.PaySystem;
import org.springframework.stereotype.Repository;

//Реализация хранилища
@Repository(value = "paySystemDAO")
//чтобы spring смог сделать инъекцию  dao-имплементации в сервисный класс
//атрибут value задаёт имя бина
public class PaySystemDAOImpl implements PaySystemDAO {

	public void savePaySystem(PaySystem paySystem) {

	}
}
