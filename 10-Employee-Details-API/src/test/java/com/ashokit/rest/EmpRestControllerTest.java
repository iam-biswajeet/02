package com.ashokit.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ashokit.bindings.EmpRequest;
import com.ashokit.service.EmpService;

@WebMvcTest(value=EmpRestController.class)
public class EmpRestControllerTest {
	@MockBean
	private EmpService service;
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void getEmployeeTest() throws Exception {
		ArrayList<EmpRequest> arrayList = new ArrayList<EmpRequest>();
		EmpRequest empRequest = new EmpRequest();
		empRequest.setId(101);
		arrayList.add(empRequest);
		when(service.getEmp()).thenReturn(arrayList);
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getEmp");
		MvcResult andReturn = mockMvc.perform(requestBuilder).andReturn();
		int status = andReturn.getResponse().getStatus();
		assertEquals(status,200);
		
	}

}
