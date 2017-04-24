package com.svs.entity;

import java.util.Date;

import javax.persistence.Entity;

import com.svs.enums.OneEnumForAll;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Student extends BaseEntity {

	// @Id
	// @GeneratedValue(generator = "uuid")
	// @GenericGenerator(name = "uuid", strategy =
	// "org.hibernate.id.UUIDGenerator")
	// @Column(name = "id", unique = true)
	// private String id = UUID.randomUUID().toString();

	private String studentFirstName;

	private String studentLastName;

	private String studentMiddleName;
	
	private Date studentDOB;

	private String identifcation1;

	private String identifcation2;

	private Long studentMobileNumber;
	
	private OneEnumForAll oneEnumForAll;

}
