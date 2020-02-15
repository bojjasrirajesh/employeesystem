package com.mq.employeesystem.service;
import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import com.mq.employeesystem.dto.LoginDto;
import com.mq.employeesystem.dto.LoginResponseDto;
import com.mq.employeesystem.dto.RegisterResponseDto;
import com.mq.employeesystem.dto.RegistrationDto;
import com.mq.employeesystem.entity.Users;
import com.mq.employeesystem.exception.RegistrationFailedExcpetion;
import com.mq.employeesystem.exception.UserNotFoundException;
import com.mq.employeesystem.repository.UserRepository;
/**
 *   This class used to check login weather the user is patient or doctor
*/
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Override
	public LoginResponseDto usersLogin(LoginDto userDto) {
		LoginResponseDto responseDto = new LoginResponseDto();
		Users user = userRepository.findByUserNameAndPassword(userDto.getuName(), userDto.getPassword());
		if (!Objects.isNull(user)) {
			responseDto.setMessage("success");
			responseDto.setStatusCode(HttpStatus.OK.value());
			responseDto.setUserId(user.getUserId());
		} else {
			throw new UserNotFoundException("Invalid User");
		}
		return responseDto;
	}
	@Override
	@JmsListener(destination = "inbound.topic")
	@SendTo("outbound.topic")
	public RegisterResponseDto usersRegister(RegistrationDto registrationDto) {
			
			if(registrationDto.getUserName()==null||registrationDto.getPassword()==null) {
				throw new RegistrationFailedExcpetion("provide the all details");
			}
			Users user = new Users();
			BeanUtils.copyProperties(registrationDto, user);
			Users users = userRepository.save(user);
			JmsTemplate jmsTemplate=new JmsTemplate();
			jmsTemplate.convertAndSend(users);
			RegisterResponseDto responseDto = new RegisterResponseDto();
			responseDto.setMessage("success");
			responseDto.setStatusCode(HttpStatus.OK.value());
			return responseDto;
	}
}
