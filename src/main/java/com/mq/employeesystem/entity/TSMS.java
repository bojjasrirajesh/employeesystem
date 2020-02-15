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
@AllArgsConstructor
public class TSMS {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tsmsId;
	private String activity;
	private Long day;
	private String date;
	private Long hours;
	private String totalTimeHrs;
	private String designation;
	private Long userId;
}
