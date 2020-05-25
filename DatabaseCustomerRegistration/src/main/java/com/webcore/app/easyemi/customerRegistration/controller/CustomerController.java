package com.webcore.app.easyemi.customerRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.service.CustomerRegisterService;

@RestController
public class CustomerController {
	@Autowired
	CustomerRegisterService cs;
	
	@RequestMapping("/")
	public String welcomeMessage() {
		return "Your Code Working fine";
	}
	@RequestMapping("/save")
	public String saveInformation(@RequestBody CustomerDetails customerDetails) {
		cs.saveInfo(customerDetails);
		return "Information saved successfully";
	}
	@RequestMapping("/getAll")
	public List getAll() {
	return cs.getAllData();
	}

}
