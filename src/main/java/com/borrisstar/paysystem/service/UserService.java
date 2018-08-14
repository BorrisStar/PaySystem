package com.borrisstar.paysystem.service;

import com.borrisstar.paysystem.dao.UserDAO;
import com.borrisstar.paysystem.domain.User;
import com.borrisstar.paysystem.dto.CreateUserDto;
import com.borrisstar.paysystem.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;

	public UserDto getUser(Integer userId) {
		User user = userDAO.getUser(userId);

		return new UserDto(user.getFio(), user.getAge(),user.getPhones(), user.getRating());

	}

	public UserDto addUser(CreateUserDto createUserDto) {
		//Создаем нового юзера
		User user = new User(createUserDto.getFio(), createUserDto.getAge(),createUserDto.getPhones(), null);
		//Отправляем его в ДАО и получаем в ответ созданного юзера
		User userCreated = userDAO.addUser(user);
		//Возвращаем ДТОшку из созданного юзера
		return  new UserDto(userCreated.getFio(), userCreated.getAge(),userCreated.getPhones(), userCreated.getRating());
	}


}
