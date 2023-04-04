package com.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.bindings.EmpRequest;
import com.ashokit.service.EmpService;

@RestController
public class EmpRestController {
	@Autowired
	private EmpService service;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmpRequest request) {
		String saveEmp = service.saveEmp(request);
		return saveEmp;
	}
	@GetMapping("/getEmp")
	public List<EmpRequest> findAllRecond(){
		List<EmpRequest> emps = service.getEmp();
		return emps;
	}

}
