package com.ashokit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmpEntity {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private double sal;
	private String desg;

}
