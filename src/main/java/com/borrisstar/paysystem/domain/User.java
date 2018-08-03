package com.borrisstar.paysystem.domain;

import java.util.Set;
import java.util.UUID;

/**
 * Entity
 */
public class User extends Model {
	private String fio;
	private Integer age;
	private Set<String>  phones;
	private String rating; // Если плохой, то -1

	public User(String fio, Integer age, Set<String> phones, String rating) {
		this.fio = fio;
		this.age = age;
		this.phones = phones;
		this.rating = rating;
	}
}
