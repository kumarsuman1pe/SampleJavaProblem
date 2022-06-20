package com.rest.webService.restfulwebService;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usersService")
public class UserResources {
	@Autowired
	private UserDAO userDao;

	@GetMapping(path = "/users")
	public List<User> getAllUser() {

		List<User> userList = userDao.findAllUsers();
		return userList;

	}

	@GetMapping(path = "/user/{id}")
	public User getUserByID(@PathVariable Integer id) {
		
		User requestedUser = userDao.getUserById(id);
		if(requestedUser==null)
		{
			throw new UserNotFoundException("User Not Fount "+id);
		}
		
		return requestedUser;
	}

	@PostMapping(path = "/saveUser")
	public ResponseEntity saveUser(@Valid @RequestBody User user) {
		User requestedUser = userDao.save(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(requestedUser.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
}
