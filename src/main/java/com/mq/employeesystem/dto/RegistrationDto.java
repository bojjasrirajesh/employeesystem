package com.mq.employeesystem.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegistrationDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private String mobNum;
	private String eMail;
	private String designation;
	private String role;
	private String status;

}