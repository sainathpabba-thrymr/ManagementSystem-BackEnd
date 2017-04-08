package com.svs.bean;

import java.util.Date;

import lombok.Data;

@Data
public class StudentBean {

	private String studentFirstName;

	private String studentLastName;

	private String studentMiddleName;

	private Date studentDOB;

	private String identifcation1;

	private String identifcation2;

	private Long studentMobileNumber;
}
