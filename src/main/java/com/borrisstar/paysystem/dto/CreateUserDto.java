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

	public CreateUserDto(String fio, Integer age, Set<String> phones) {
		this.fio = fio;
		this.age = age;
		this.phones = phones;
	}

	public CreateUserDto() {

	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
}