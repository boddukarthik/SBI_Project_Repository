package com.kiran.client.ClientServiceApplications.pojo;

public class StudentDTO {
	private String id;
	private String studentName;
	private String designation;
	private String studentFee;
	
	public String getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(String studentFee) {
		this.studentFee = studentFee;
	}

	public StudentDTO(String id,String studentName,String designation,String studentFee ) {
		this.id=id;
		this.studentName=studentName;
		this.designation=designation;
		this.studentFee=studentFee;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	

}
