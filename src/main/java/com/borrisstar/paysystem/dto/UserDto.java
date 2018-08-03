package com.borrisstar.paysystem.dto;

import java.util.Set;

/**
 * Исходящая DTO
 */

public class UserDto {
	private String fio;
	private Integer age;
	private Set<String> phones;
	private String rating; // Если плохой, то -1

	public UserDto(String fio, Integer age, Set<String> phones, String rating) {
		this.fio = fio;
		this.age = age;
		this.phones = phones;
		this.rating = rating;
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
}