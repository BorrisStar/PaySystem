package com.borrisstar.paysystem;

//Экспериментальная система  платежей
import com.borrisstar.paysystem.service.PaySystemService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPay {
	public static void main(String[] args) {
		//Создаем spring контекст
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-context.xml");
		//достаем из контекста сервис для тестов
		PaySystemService service = (PaySystemService) context.getBean("paySystemService");
	}
}
