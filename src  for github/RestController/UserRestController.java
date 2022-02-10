package com.user.RestController;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.Model.User;
import com.user.Services.Iuser;


@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	Iuser service;
	
	 @PutMapping ("/updateUser/{id}") public ResponseEntity<User>
	  updateUser(@PathVariable int id,@RequestBody User user) {
	  
	  User u = service.updateUser(user);
	  return new ResponseEntity<User>(u,HttpStatus.OK); }
	  
	}
