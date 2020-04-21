package com.vs.userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping
	public User create(@RequestBody User user) {
		return userService.create(user);
	}
	
	

}
