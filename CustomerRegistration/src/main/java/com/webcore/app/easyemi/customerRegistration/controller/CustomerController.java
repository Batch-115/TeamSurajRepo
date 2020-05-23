package com.webcore.app.easyemi.customerRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.customerRegistration.model.CustomerEnquiry;
import com.webcore.app.easyemi.customerRegistration.model.CustomerLoanDetails;
import com.webcore.app.easyemi.customerRegistration.service.CustomerRegisterService;

@RestController
public class CustomerController {

	@Autowired
	CustomerRegisterService customerRegisterService;

	@RequestMapping(value = "/loandetails", method = RequestMethod.POST)
	public String saveLoanDetail(@RequestBody CustomerLoanDetails loandetails) {
		customerRegisterService.saveLoanDetails(loandetails);
		return "";
	}

	@RequestMapping(value = "/loandetails", method = RequestMethod.GET)
	public List<CustomerLoanDetails> getLoanDetails() {
		return customerRegisterService.getLoanDetails();
	}
	
	
	@RequestMapping(value="/loandetails/{id}",method=RequestMethod.PUT)
	public List<CustomerLoanDetails>updateLoanDetails(@RequestBody CustomerLoanDetails loandetails,@PathVariable int id){
	CustomerLoanDetails details=customerRegisterService.getSingleData(id);
		 details.setLoanAmount(loandetails.getLoanAmount());
		 details.setAdvanceEMI(loandetails.getAdvanceEMI());
		 details.setLoanCode(loandetails.getLoanCode());
		 details.setCustomerId(loandetails.getCustomerId());
		 details.setProcessingFees(loandetails.getProcessingFees());
		 details.setRateOfInterest(loandetails.getRateOfInterest());
		 details.setSanctionDate(loandetails.getSanctionDate());
		 details.setTotalInterest(loandetails.getTotalInterest());
		 details.setTenure(loandetails.getTenure());
		 details.setStatus(loandetails.getStatus());
		 
		 customerRegisterService.saveLoanDetails(details);
      	return customerRegisterService.getLoanDetails();
	}
	
	
	@RequestMapping(value="/loandetails/{id}",method=RequestMethod.DELETE)
	public List<CustomerLoanDetails>deleteLoanDetails(@PathVariable int id){
             CustomerLoanDetails loandetails= customerRegisterService.getSingleData(id);
		     customerRegisterService.deleteLoanDetails(loandetails);
     return customerRegisterService.getLoanDetails();
	}
	
	
	
	
	@RequestMapping(value="/enquiry",method=RequestMethod.POST)
	public String saveCustomerEnquiry(@RequestBody CustomerEnquiry customerenquiry) {
		 customerRegisterService.saveCustomerEnquiry(customerenquiry);
		return "";
	}

	@RequestMapping(value="/enquiry",method=RequestMethod.GET)
	public List<CustomerEnquiry> getCustomerEnquiry() {
		return customerRegisterService.getCustomerEnquiry();
	}
	
	@RequestMapping(value="/enquiry/{id}",method=RequestMethod.PUT)
	public List<CustomerEnquiry>updateCustomerEnquiry(@RequestBody CustomerEnquiry customerEnquiry,@PathVariable int id){
	CustomerEnquiry enquiry=customerRegisterService.getSingle(id);
	   enquiry.setFirstName(customerEnquiry.getFirstName());
	   enquiry.setLastName(customerEnquiry.getLastName());
       enquiry.setMobileNo(customerEnquiry.getMobileNo());
       enquiry.setProductName(customerEnquiry.getProductName());
       enquiry.setCity(customerEnquiry.getCity());
       enquiry.setEmail(customerEnquiry.getEmail());
       enquiry.setState(customerEnquiry.getState());
	   
       customerRegisterService.saveCustomerEnquiry(enquiry);
		return customerRegisterService.getCustomerEnquiry();
	}
	
	@RequestMapping(value="/enquiry/{id}",method=RequestMethod.DELETE)
	public List<CustomerEnquiry>deleteCustomerEnquiry(@PathVariable int id){
	      CustomerEnquiry enquiry= customerRegisterService.getSingle(id);
		 customerRegisterService.deleteCustomerEnquiry(enquiry);
		return 	customerRegisterService.getCustomerEnquiry();	
	}
	

	
}
