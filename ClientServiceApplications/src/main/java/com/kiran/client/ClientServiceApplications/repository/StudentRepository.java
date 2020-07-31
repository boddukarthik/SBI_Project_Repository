package com.kiran.client.ClientServiceApplications.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kiran.client.ClientServiceApplications.pojo.StudentDetails;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails, Long> {
	
	@Query("SELECT sd from StudentDetails sd where sd.studentName=?1")
	List<StudentDetails> findUserByName(String studentName);
	
	

}
