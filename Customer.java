package com.demo.rs;

public class Customer{
	private int customerId;
	private String customerName;
	private String city;
	private int phoneNo;

public Customer(int customerId, String customerName, String city, int phoneNo) {
	this.city=city;
	this.customerId=customerId;
	this.customerName=customerName;
	this.phoneNo=phoneNo;
	
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}

//constructors
//setter and getters
}

