package com.ashokit.service;

import java.util.List;

import com.ashokit.bindings.EmpRequest;

public interface EmpService {
	public String saveEmp(EmpRequest request);
	public List<EmpRequest> getEmp();

}
