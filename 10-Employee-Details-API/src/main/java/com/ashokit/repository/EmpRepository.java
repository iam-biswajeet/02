package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.EmpEntity;

public interface EmpRepository extends JpaRepository<EmpEntity, Serializable>{
	public EmpEntity findByName(String name);

}
