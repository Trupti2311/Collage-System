package com.sts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Address {
	@Id
	@Column(nullable = false , name = "addId")
	private Integer addId ;
	@Column(nullable = false , name = "street")
	private String street ;
	@Column(nullable = false , name = "last_name")
	private String city ;
	@Column(nullable = false , name = "pincode")
	private Integer pincode ;
	
}
