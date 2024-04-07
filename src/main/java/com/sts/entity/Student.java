package com.sts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
 
	@Id
	@Column(nullable = false , name = "student_id")
	private String studId ;
	@Column(nullable = false , name = "first_name")
	private String firstName ;
	@Column(nullable = false , name = "last_name")
	private String lastName ;
	@Column(nullable = false , name = "last_name")
	private Integer rollNo ;
	@Column(nullable = false , name = "date_of_birth")
	private String dateOfBirth ;
	@Column(nullable = false , name = "date_of_birth")
	private String branch ;
	@Column(nullable = false , name = "email")
	private String email ;
	@Column(nullable = false , name = "phone_number")
	private String phoneNumber ;
	
	@OneToOne
	public Address address ;
	
	
	
}
