package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entities.EmpEntity;
import com.ashokit.repository.EmpRepository;

@SpringBootApplication
public class Application {
	private static String msg="abc";
	public static void main(String[] args) {
		System.out.println("Application::start");
		System.out.println(1);
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpRepository bean = context.getBean(EmpRepository.class);
		EmpEntity findByName = bean.findByName("Pipu");
		System.out.println("Name:::"+findByName);
		System.out.println("Application::end");
	}

}
