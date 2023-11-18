package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.service.ExternalAPIService;

@RestController
public class RestAPIController {
	
	@Autowired
	private ExternalAPIService apiservice;
	
	@GetMapping("/")
	public String demo()
	{
		return "MicroService Demo using External API</br>";            //application program interface  -> APi full form
	}
	
	@GetMapping("posts")
	public List<Object> viewallposts()
	{
		return apiservice.viewallposts();
	}

	
	@GetMapping("post/{id}")
	public Object viewpostbyid(@PathVariable("id") int id)
	{
		return apiservice.viewpostbyid(id);
	}
	
	@GetMapping("customers")
	public List<Object> viewallcustomers()
	{
		return apiservice.viewallcustomers();
	}
	
	
}
