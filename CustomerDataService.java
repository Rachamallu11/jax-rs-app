package com.demo.rs;

import java.util.List;

public interface CustomerDataService{
public Customer findOne(int CustomerId) throws CustomerNotFoundException;
public List<Customer> listAll();
public String delete(int customerId) throws CustomerNotFoundException;
public Customer saveCustomer(Customer c) throws CustomerExistsException;
}

