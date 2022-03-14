package com.demo.rs;


import java.util.HashMap;

public class CustomerDb {
	private static HashMap<Integer, Customer> db = new HashMap<Integer, Customer>();

	public static HashMap<Integer, Customer> getDb() {
		return db;
	}
	
	public CustomerDb() {
		db.put(100, new Customer(100, "Shantanu", "Hyderabad", 798753124));
		db.put(101, new Customer(101, "Pavan", "Hyderabad", 989876776));
		db.put(102, new Customer(102, "Arun", "Chennai", 788765787));
		db.put(103, new Customer(103, "Raja", "Chennai", 989865424));
		db.put(104, new Customer(104, "Ranga", "Bangalore", 897686545));
		db.put(105, new Customer(105, "Pretham", "Bangalore", 956321347));
		db.put(106, new Customer(106, "Chandra", "Pune", 897897656));
		db.put(107, new Customer(107, "Vamshi", "Pune", 987674323));
	}

	public void CustomerNotFound(int i) {
		
		
	}
}
