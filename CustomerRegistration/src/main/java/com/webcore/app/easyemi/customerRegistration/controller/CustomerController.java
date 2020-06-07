package com.webcore.app.easyemi.customerRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.customerRegistration.dto.CustomerDetailsDto;
import com.webcore.app.easyemi.customerRegistration.dto.CustomerEnquiryDto;
import com.webcore.app.easyemi.customerRegistration.exception.ResourceNotFoundException;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEmploymentDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEnquiry;
import com.webcore.app.easyemi.customerRegistration.model.CustomerLoanDetails;
import com.webcore.app.easyemi.customerRegistration.service.CustomerRegisterService;

@CrossOrigin(value = "http://localhost:4200")
@RestController
public class CustomerController implements ErrorController {

	@Autowired
	CustomerRegisterService customerRegisterService;

	// error page
	public static final String PATH = "/error";

	@RequestMapping(value = PATH)
	public String defaultErrorMassage() {
		return "Requested resource not found";
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return PATH;
	}

	// insert all data of customer details
	@RequestMapping(value = "/customerDetails", method = RequestMethod.POST)
	public List<CustomerDetails> saveCustomerDetails(@RequestBody CustomerDetails customerDetails) {
		customerRegisterService.saveCustomerDetails(customerDetails);
		return customerRegisterService.getCustomerDetails();
	}

	// get all data of customer details
	@RequestMapping(value = "/customerDetails", method = RequestMethod.GET)
	public List<CustomerDetails> getCustomerDetails() {
		List<CustomerDetails> list= customerRegisterService.getCustomerDetails();
		if(list.isEmpty()) {
			throw new ResourceNotFoundException(" customer details Not found "); 
		}
		else {
			return list;
		}
			
	}

	// sending enquery data
	@RequestMapping(value = "/enquiry", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerEnquiry> saveCustomerEnquiry(@RequestBody CustomerEnquiry customerenquiry) {
		customerRegisterService.saveCustomerEnquiry(customerenquiry);
		return customerRegisterService.getCustomerEnquiry();
	}

	// dto
	@RequestMapping(value = "/enquiryDto", method = RequestMethod.GET)
	public List<CustomerEnquiryDto> getEnquiryDto() {
		List<CustomerEnquiryDto> dto= customerRegisterService.get();
		if(dto==null) {
			throw new ResourceNotFoundException("not found");
		}
		else {
			return dto;
		}
	}

	// login using mobile Number
	@RequestMapping(value = "/getByNumber/{mobileNo}", method = RequestMethod.GET)
	public CustomerDetailsDto get(@PathVariable String mobileNo) {

		CustomerDetailsDto dto = customerRegisterService.getSingleDto(mobileNo);
		if (dto == null) {
			throw new ResourceNotFoundException("customer not found of " + mobileNo);
		} else {
			return dto;
		}

	}

	// document
	@RequestMapping(value = "/getImage/{customerId}", method = RequestMethod.GET)
	public CustomerDocument getImageById(@PathVariable("customerId") int id) {
		CustomerDocument doc = customerRegisterService.getImageById(id);
		if (doc == null) {
			throw new ResourceNotFoundException("document not found of " + id);
		} else {
			return doc;
		}

	}

	// sending new loan details
	@RequestMapping(value = "/oldCustomer", method = RequestMethod.POST)
	public void getOldLoan(@RequestBody CustomerDetails customerLoanDetails) {
		customerRegisterService.saveCustomerDetails(customerLoanDetails);
	}

	// get one customer
	@RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
	public CustomerDetails getCust(@PathVariable int id) {

		CustomerDetails details = customerRegisterService.getCustomer(id);
		if (details == null) {
			throw new ResourceNotFoundException("customer details not found of " + id);
		} else {
			return details;
		}

	}

}
