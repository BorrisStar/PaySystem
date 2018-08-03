package com.borrisstar.paysystem.dto;

import java.util.Set;

/**
 * Входящая DTO
 */
public class CreateUserDto {
	private String fio;
	private Integer age;
	private Set<String> phones;
	//private String rating; // Если плохой, то -1

}