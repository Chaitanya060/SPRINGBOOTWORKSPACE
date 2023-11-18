package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Employee;

public interface AdminService {
  public List<Employee> viewallemps();
  public String deleteemp(int eid);
  public Employee viewempbyid(int eid);
  public Admin checkadminlogin(String auname , String apwd);
  public int updatestatus(boolean active,int eid);
  public String addcustomer(Customer c);
  
  
  public long empcount();   //count(*)
  public long customercount();    //count
  
  
}
