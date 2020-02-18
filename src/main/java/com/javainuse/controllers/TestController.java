package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

import java.net.InetAddress;

@RestController
public class TestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloPage() {
		return "Hello Spring Boot";
        }

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		try {
			InetAddress iAddress = InetAddress.getLocalHost();
			String hostName = iAddress.getHostName();

			emp.setLocation(hostName);
		} catch (Exception e) {

		}

		return emp;
	}

}
