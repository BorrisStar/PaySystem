package com.borrisstar.paysystem.rest.controllers;

import com.borrisstar.paysystem.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;

/**
 * CRUD - операции
 */
@RestController()
public class UserController {

	@GetMapping("getuser")
	public UserDto index() {
		return new UserDto("FIO", 45, new HashSet<>(Arrays.asList("11111", "2222")), "BB+");
	}
}
