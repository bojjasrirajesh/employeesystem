package com.mq.employeesystem.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String userName;
	private Long mobile;
	private String email;
	private String password;
	private String designation;
	private String dateOfJoining;
	private Double salary;
	private String role;
	private String status;
	public Users(Long userId, String userName, Long mobile, String email, String password, String designation,
			String dateOfJoining, Double salary, String role, String status) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.role = role;
		this.status = status;
	}
	
}
