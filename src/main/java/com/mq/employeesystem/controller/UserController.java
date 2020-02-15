package com.mq.employeesystem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mq.employeesystem.dto.LoginDto;
import com.mq.employeesystem.dto.LoginResponseDto;
import com.mq.employeesystem.dto.RegisterResponseDto;
import com.mq.employeesystem.dto.RegistrationDto;
import com.mq.employeesystem.service.UserService;

/**
 * 
 * @author bojja.r
 * @version 1.0
 * @since 30-01-2020
 */

@RestController
@RequestMapping("/users")
@CrossOrigin(allowedHeaders = {"*","*/"}, origins = {"*","*/"})
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	
	 @Autowired 
	 UserService userService;
	 /**
		 * This method is used to validating the user by providing the input as LoginDto 
		 * @param loginDto
		 * @return responseDTO 
		 */
	 @PostMapping(value = "/login") 
	 public LoginResponseDto usersLogin(@RequestBody LoginDto loginDto) { 
		 LOGGER.info("login method");
		 return userService.usersLogin(loginDto);
	 }
	 /**
		 * This method is used to register the user 
		 * @param registrationDto
		 * @return registrationDto 
		 */
	 @PostMapping(value = "/register") 
	 public RegisterResponseDto	 usersRegister(@RequestBody RegistrationDto registrationDto) {
	 LOGGER.info("usersRegster method");
	 return	 userService.usersRegister(registrationDto); 
	 }
	 

}