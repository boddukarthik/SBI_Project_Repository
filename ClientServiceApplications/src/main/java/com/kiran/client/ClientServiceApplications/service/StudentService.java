package com.kiran.client.ClientServiceApplications.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kiran.client.ClientServiceApplications.pojo.StudentDTO;
import com.kiran.client.ClientServiceApplications.pojo.StudentDetails;
import com.kiran.client.ClientServiceApplications.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional
	public int add(StudentDTO dto ) {
		StudentDetails details=new StudentDetails();
		details.setId(Integer.parseInt(dto.getId()));
		details.setDesignation(dto.getDesignation());
		details.setStudentName(dto.getStudentName());
		details.setStudentFee(Float.parseFloat(dto.getStudentFee()));
		
		int v= getDetailsDTO(studentRepository.save(details));
		return v;
		
		
	}
	
	public int getDetailsDTO(StudentDetails details) {
		Integer id=details.getId();
		System.out.println("service output"+id);
		String converid=String.valueOf(id);
		
		Float fee=details.getStudentFee();
		String converfloat=String.valueOf(fee);
		
		String desig=details.getDesignation();
		
		String stdName=details.getStudentName();
		
		StudentDTO dto= new StudentDTO(converid, converfloat, desig,stdName);
		return id;
		
	}

}
