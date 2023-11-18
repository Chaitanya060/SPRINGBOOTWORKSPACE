 package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
	private CustomerRepository repository;
	
	 
	
	@Override
	public String addcustomer(Customer customer) {
		
		repository.save(customer);
		return "Customer Add SuccessFully";
	}

	@Override
	public String updatecustomer(Customer customer) {
		Optional<Customer> obj =  repository.findById(customer.getId());
		String msg = null;
		if(obj.isPresent())
		{
			Customer c = obj.get();
			c.setName(customer.getName());
			c.setSalary(customer.getSalary());
			repository.save(c);
			
			msg = "Customer Updated SuccessFully";
		}
		
		else {
			msg = "Customer ID Not Found";
		}
		return msg;
		
	}

	@Override
	public String deletecustomer(int id) {
		Optional<Customer> obj =  repository.findById(id);
		String msg = null;
		if(obj.isPresent())
		{
			Customer c = obj.get();
			repository.delete(c);
			msg = "Customer Deleted SuccessFully";
		}
		else {
			msg = "Customer ID Is Not Found";
		}
		
		return msg;
	}

	@Override
	public List<Customer> viewallcustomers() {
		List<Customer> customerlist = (List<Customer>) repository.findAll();
		return customerlist;

	}

	@Override
	public Customer viewcustomerbyid(int id) {
		Customer c =  repository.findById(id).get();
		return c;
		
		
	}

}
