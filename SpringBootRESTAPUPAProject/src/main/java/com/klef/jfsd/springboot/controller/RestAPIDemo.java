package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.service.CustomerService;

@RestController
@RequestMapping("customer") //GET is Default method
public class RestAPIDemo 
{
  @Autowired
  private CustomerService service;
  
  @GetMapping("/")
  public String demo()
  {
    return "Spring boot Rest Api Demo with JPA";
  }
  
  @PostMapping("add")
  public String addcustomer(@RequestBody Customer c) 
  {
    return service.addcustomer(c);
  }
  
  @PutMapping("update")
  public String updatecustomer(@RequestBody Customer c)
  {
    return service.updatecustomer(c);
  }
  
  @DeleteMapping("delete")
  public String deletecustomer(@RequestParam("id") int cid)
  {
    return service.deletecustomer(cid);  
  }
  
  @GetMapping("viewall")
  public List<Customer> viewallcustomers()
  {
    return service.viewallcustomers();
  }
  
  @GetMapping("view")
  public Customer viewcustomerbyid(@RequestParam("id") int cid) {
    return service.viewcustomerbyid(cid);
  }
  
  
}