package com.mq.employeesystem.dto;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class LoginResponseDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private String message;
	private Integer statusCode;
	private Long userId;
}