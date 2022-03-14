package com.demo.rs;

public class MainApp {
	public static void main(String[] args) {
		CustomerDb customerDb = new CustomerDb();
		try {
			customerDb.CustomerNotFound(108);
		}catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

	
}
