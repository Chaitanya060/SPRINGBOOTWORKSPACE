package com.klef.jfsd.springboot.service;

import java.util.List;

public interface ExternalAPIService {

	
	
//	external api [JSON Placeholder]
	public List<Object> viewallposts();      
	public Object viewpostbyid(int id);
	
//	Internal API [SpringBoot RESTAPI Project
	
	public List<Object> viewallcustomers();
	
	
} 
