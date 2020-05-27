package com.webcore.app.easyemi.customerRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;
import com.webcore.app.easyemi.customerRegistration.service.CustomerRegisterService;

@RestController
@CrossOrigin("*")
public class CustomerController {
	
	@Autowired
	CustomerRegisterService customerregisterservice;
	
	@RequestMapping(value = "/upload",method = RequestMethod.POST)
	public String imageUpload(@RequestBody CustomerDocument custdocment) {
		
		
		customerregisterservice.storeImage(custdocment);
		
		return "image upload successfully";
	}
	
	
	@RequestMapping(value = "/getImages/{documentId}" , method = RequestMethod.GET)
	public CustomerDocument getAllImages(@PathVariable("documentId")int id) {
		
		CustomerDocument custdoc=customerregisterservice.getById(id);
		
		return custdoc;
	}
	
	

}
