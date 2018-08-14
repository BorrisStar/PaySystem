package com.borrisstar.paysystem.rest.controllers;

import com.borrisstar.paysystem.dto.CreateUserDto;
import com.borrisstar.paysystem.dto.UserDto;
import com.borrisstar.paysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * CRU - операции - сделать сервис, из которого будет вызываться DAO и операции!, DELETE  - опасная операция
 */
@RestController
@RequestMapping(path = "user")  //http://localhost:8080/user
public class UserController {

	@Autowired
	UserService userService;// Контроллер оработает только с сервисами. Не с ДАО!!!

	/*
	Для Постмена
	POST	http://localhost:8080/getuser
	HEADER	Content-Type:json
	BODY	{"fio":"FIO","age":45,"phones":["2222","11111"]}

	{
    "fio": "FIO 997",
    "age": 45,
    "phones": [
        "2222",
        "11111"
    ],
    "rating": "BB+"
}
	 */


	@GetMapping(path = "{userId}")//@PathVariable - переменная из строки урла
	public UserDto getUser(@PathVariable Integer userId) {
		return userService.getUser(userId);
//		return new UserDto("FIO", 45, new HashSet<>(Arrays.asList("11111", "2222")), "BB+");
	}


	@PostMapping()
	// Получаем CreateUserDto и возвращаем UserDto
	public UserDto addUser(@RequestBody CreateUserDto createUserDto) {
			return userService.addUser(createUserDto);
	}

	//Update users
	@RequestMapping(method = RequestMethod.PUT)
	public void updateUser(@RequestBody CreateUserDto createUserDtoo) {
		{
			//проверить есть ли такой юзер в хранилище, если да то перезаписать его, если нет .
		}
	}
}
