package com.rest.webService.restfulwebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	public static List<User> userList = new ArrayList<>();
	public static int userCount = 3;
	static {
		userList.add(new User(1, "Suman", new Date()));
		userList.add(new User(2, "Ashish", new Date()));
		userList.add(new User(3, "Anjali", new Date()));
	}

	public List<User> findAllUsers() {
		return userList;
	}

	public User getUserById(int id) {
		for (User user : userList) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;

	}

	public User save(User user) {

		if (null == user.getId()) {
			user.setId(++userCount);
		}
		userList.add(user);
		return user;
	}
}
