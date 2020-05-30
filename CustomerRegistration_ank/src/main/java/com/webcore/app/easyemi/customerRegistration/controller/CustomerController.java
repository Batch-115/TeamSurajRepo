package com.webcore.app.easyemi.customerRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;
import com.webcore.app.easyemi.customerRegistration.service.CustomerRegisterService;

@RestController
public class CustomerController {

	@Autowired
	CustomerRegisterService customerRegisterService;
	
	
	@RequestMapping(value = "/saveALLDetail",method = RequestMethod.POST)
	public String customerDetailSave(@RequestBody CustomerDetails customerDetails) {
		
		customerRegisterService.saveInfo(customerDetails);
		
		return "";
	}

	
	@RequestMapping(value = "/getAllData",method = RequestMethod.GET)
	public List<CustomerDetails> getAllData(){
		
		List<CustomerDetails> list=customerRegisterService.getAll();
	
		return list;
	}
	
	
	@RequestMapping(value = "/getImage/{customerId}",method = RequestMethod.GET)
	public CustomerDocument  getImageById(@PathVariable("customerId")int id) {
		System.out.println(id);
		
		CustomerDocument doc=customerRegisterService.getImageById(id);
		
		//String name=customerRegisterService.getName(id);
		
		//int id1=customerRegisterService.getDocument(id);
		System.out.println(doc.getAddressProof());
		System.out.println(doc.getBankStatement());
		System.out.println(doc.getBlankcheque());
		System.out.println(doc.getIdProof());
		System.out.println(doc.getPhoto());
		System.out.println(doc.getSignature());
		System.out.println(doc.getStatus());
		return doc;
	}
	

	@RequestMapping(value="/getsingledata/{customerId}" ,method = RequestMethod.GET)
	public CustomerDetails getparticulardata(@PathVariable("customerId") int id) {
		
		
		return (CustomerDetails) customerRegisterService.getSingleData(id);
	}
	
}
