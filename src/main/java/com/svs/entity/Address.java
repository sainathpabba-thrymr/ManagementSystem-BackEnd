package com.svs.entity;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper=false)
public class Address extends BaseEntity {
	private String hNoAndVillage;
	
	private String district;
	
	private String state;
	
	private String country;
	
	private Long pincode;

}
