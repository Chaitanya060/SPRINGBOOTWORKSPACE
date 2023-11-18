package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Customer;

public interface CustomerService {

	
	public String addcustomer(Customer customer);
	public String updatecustomer(Customer customer);
	public String deletecustomer(int id);
	public List<Customer> viewallcustomers();
	public Customer viewcustomerbyid(int id);
	
	
}
