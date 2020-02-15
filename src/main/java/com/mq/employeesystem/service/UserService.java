package com.mq.employeesystem.service;

import com.mq.employeesystem.dto.LoginDto;
import com.mq.employeesystem.dto.LoginResponseDto;
import com.mq.employeesystem.dto.RegisterResponseDto;
import com.mq.employeesystem.dto.RegistrationDto;

public interface UserService {
	LoginResponseDto usersLogin(LoginDto userDto);

	RegisterResponseDto usersRegister(RegistrationDto registrationDto);
}
