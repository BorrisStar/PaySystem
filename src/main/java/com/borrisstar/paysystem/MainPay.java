package com.borrisstar.paysystem;

//Экспериментальная система  платежей REST
/*
Результатом работы веб-приложения будет:
		Добавить новый платеж: POST http://http://localhost:8080/paysystem
		Получить список платежей: GET http://localhost:8080/paysystem
		//Получить описание платежа в виде html: GET http://localhost:8080/paysystem/{id платежа}
		//Получить описание платежа в виде xml: GET content-type:application/xml http://localhost:8080/paysystem/{id платежа}
Получить описание платежа в виде JSON

Отправитель и получатель платежа - UserDto
UserDto


*/

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MainPay {
	public static void main(String[] args) {
		//Создаем spring контекст
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-context.xml");
		//достаем из контекста сервис для тестов
		//PaySystemService service = (PaySystemService) context.getBean("paySystemService");
		SpringApplication.run(MainPay.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
