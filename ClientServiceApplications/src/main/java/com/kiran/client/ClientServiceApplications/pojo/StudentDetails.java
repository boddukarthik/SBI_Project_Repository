package com.kiran.client.ClientServiceApplications.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Studnet_table")
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_designation")
	private String designation;
	
	@Column(name = "student_fee")
	private Float studentFee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(float studentFee) {
		this.studentFee = studentFee;
	}
	

}
