package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bindings.EmpRequest;
import com.ashokit.entities.EmpEntity;
import com.ashokit.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepo;
	Logger logger=LoggerFactory.getLogger(EmpService.class);

	@Override
	public String saveEmp(EmpRequest request) {
		logger.info("saveEmp ::start");
		EmpEntity entity = new EmpEntity();
		BeanUtils.copyProperties(request, entity);
		EmpEntity save = empRepo.save(entity);
		logger.info("saveEmp::end");
		return save.toString();
	}

	@Override
	public List<EmpRequest> getEmp() {
		logger.info("getEmp ::start");
		List<EmpEntity> findAll = empRepo.findAll();
		List<EmpRequest> emps = new ArrayList<EmpRequest>();
		findAll.forEach(e -> {
			EmpRequest request = new EmpRequest();
			BeanUtils.copyProperties(e, request);
			emps.add(request);
		});
		logger.info("getEmp ::end");
		return emps;
	}

}
