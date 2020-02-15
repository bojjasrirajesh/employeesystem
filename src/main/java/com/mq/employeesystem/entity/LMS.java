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

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LMS {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long lmsId;
	private String annualLeaves;
	private Long myLeaves;
	private String ristrictedLeaves;
	private Long userId;
}
