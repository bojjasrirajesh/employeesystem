package com.mq.employeesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mq.employeesystem.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	public Users findByUserNameAndPassword(String userName, String password);
}