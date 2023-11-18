package com.klef.jfsd.springboot.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	
	List<Employee> emplist = new ArrayList<Employee>();
  
  @RequestMapping(path = "/", method=RequestMethod.GET)
  public String demo()
  {
    return "Spring Boot Application";
  }
  @RequestMapping(path = "demo1")               //GET is default Method
  public int demo1()
  {
	return 1555;
	  
  }
  @RequestMapping("demo2")                //GET is default method  
  public String demo2()
  {
	  return "surya bhai";
  }
  @GetMapping("demo3")
  public String demo3()
  {
	return "my name is chaitanya";
	  
  }
  
  @GetMapping("demo4/{id}")
  public String demo4(@PathVariable("id") int eid)
  {
	  return Integer.toString(eid);
  }
  @GetMapping("demo5/{a}/{b}")
  public int demo5(@PathVariable("a") int p,@PathVariable("b") int q)
  {
	  return p+q;
  }
  @GetMapping("demo6")
  public String demo6(@RequestParam("id") int eid)
  {
	return "ID = " + eid;  
  }
  @GetMapping("demo7")
  public String demo7(@RequestParam("name") String name)
  {
	return name;
	  
  }
  
  @GetMapping("demo8")
  public String demo8(@RequestParam("fname") String fname , @RequestParam("lname") String lname)
  {
	return fname+" " + lname;
	  
  }
  @GetMapping("demo9")
  public String demo9()
  {
	  return "<font color = blue >Hi Spring Boot ✌️</font>";
  }
  
  @PostMapping("addemp")
  public String addemployee(@RequestBody Employee emp)              //@Request Body it will take the json data to state it
  {
	  emplist.add(emp);
	return "Employee Added Successfully";
	  
  }
  @GetMapping("view")
  public List<Employee> viewemployees()
  {
	  return emplist;
  }
}