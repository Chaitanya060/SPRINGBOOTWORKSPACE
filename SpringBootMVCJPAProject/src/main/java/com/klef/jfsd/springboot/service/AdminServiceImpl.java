package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.CustomerRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;


@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	
	
	private AdminRepository adminRepository ;
	@Autowired
	
	private CustomerRepository customerRepository;
	@Autowired
	
	private EmployeeRepository employeeRepository;
	
	@Override
	
	public List<Employee> viewallemps() {
		return employeeRepository.findAll();
	}

	@Override
	public String deleteemp(int eid) {
		Optional<Employee> obj = employeeRepository.findById(eid);
	    
	    String msg = null;
	    
	    if(obj.isPresent())
	    {
	      Employee emp = obj.get();
	      employeeRepository.delete(emp);
	      msg = "Employee Deleted Successfully";
	    }
	    else
	    {
	      msg = "Employee Not Found";
	    }
	    
	    return msg;
		
	}

	@Override
	public Employee viewempbyid(int eid) {
		Optional<Employee> obj = employeeRepository.findById(eid);    
	    
	    if(obj.isPresent())
	    {
	      Employee emp = obj.get();
	      return emp;
	    }
	    else
	    {
	      return null;
	    }
	}

	@Override
	public Admin checkadminlogin(String auname, String apwd) {
		return adminRepository.checkadminlogin(auname, apwd);
	}

	@Override
	public int updatestatus(boolean active, int eid) {
		return adminRepository.updatestatus(active, eid);
	}

	@Override
	public String addcustomer(Customer c) {
		customerRepository.save(c);
		return "Customer Registered SuccessFully !!";
		
	}

	@Override
	public long empcount() {
		return employeeRepository.count();
		
	}

	@Override
	public long customercount() {
		
		return customerRepository.count();  //her we need to use the long because of .count
	}

}
