package com.kiran.client.ClientServiceApplications.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.client.ClientServiceApplications.pojo.ResponseStudent;
import com.kiran.client.ClientServiceApplications.pojo.StudentDTO;
import com.kiran.client.ClientServiceApplications.pojo.StudentDetails;
import com.kiran.client.ClientServiceApplications.service.StudentService;

@RestController
public class StudentControllers {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/add")
	public int add(@RequestBody StudentDTO pojo) {
		String str="controller class in service";
		int dto=studentService.add(pojo);
		System.out.println("controller output"+dto);
		return dto;
		
	}

}
