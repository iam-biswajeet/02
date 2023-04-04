package com.ashokit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ashokit.bindings.EmpRequest;
import com.ashokit.entities.EmpEntity;
import com.ashokit.repository.EmpRepository;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class EmpServiceTest {
	@MockBean
	private EmpRepository empRepo;

	
	@InjectMocks
	private EmpServiceImpl service;
	
	@Test
	public void getEmpTest() {
		ArrayList<EmpEntity> arrayList = new ArrayList<EmpEntity>();
		EmpEntity entity = new EmpEntity();
		entity.setId(101);
		arrayList.add(entity);
		when(empRepo.findAll()).thenReturn(arrayList);
		List<EmpRequest> emp = service.getEmp();
		Integer id = emp.get(0).getId();
		assertEquals(101,id);
		
	}

}
