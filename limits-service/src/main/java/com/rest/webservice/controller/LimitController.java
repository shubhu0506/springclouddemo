package com.rest.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservice.limitservice.beans.Limits;
import com.rest.webservice.limitservice.configuration.Configuration;



@RestController
public class LimitController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits()
	{
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		
	}
}
