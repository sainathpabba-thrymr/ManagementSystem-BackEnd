package com.svs.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Email extends BaseEntity {

	private String email;

	@OneToOne
	private Student student;
}
