package com.svs.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", unique = true)
	private String id = "stu-"+UUID.randomUUID().toString();
	
	private String studentFirstName;
	
	private String studentLastName;
	
	private String studentMiddleName;
	
	private Date studentDOB;
	
	private String identifcation1;
	
	private String identifcation2;
	
	private Long studentMobileNumber;
	
}
