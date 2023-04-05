package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entities.EmpEntity;
import com.ashokit.repository.EmpRepository;

@SpringBootApplication
public class Application {
	private static Integer num=123;
	public static void main(String[] args) {
		System.out.println("Application::start");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpRepository bean = context.getBean(EmpRepository.class);
		EmpEntity findByName = bean.findByName("Pipu");
		System.out.println("Name:::"+findByName);
		System.out.println("Application::end");
	}
	public String m1(){
		//write logic

}
