package com.borrisstar.paysystem.dao;

import com.borrisstar.paysystem.domain.User;
import com.borrisstar.paysystem.dto.CreateUserDto;
import com.borrisstar.paysystem.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Repository //Для создания бина спрингом
public class UserDAO {

	List<User> users = new ArrayList<>();

	public User getUser(Integer userId) {
		return users.get(userId);
	}

	//Из полученого CreateUserDto создаем UserDto
	public User addUser(User user) {
		if (users.add(user)) {
			return user;
		}
		return null;
	}
}
