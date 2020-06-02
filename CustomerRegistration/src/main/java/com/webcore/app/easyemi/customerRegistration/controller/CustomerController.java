package com.webcore.app.easyemi.customerRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.customerRegistration.dto.CustomerDetailsDto;
import com.webcore.app.easyemi.customerRegistration.dto.CustomerEnquiryDto;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEmploymentDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEnquiry;
import com.webcore.app.easyemi.customerRegistration.model.CustomerLoanDetails;
import com.webcore.app.easyemi.customerRegistration.service.CustomerRegisterService;

@CrossOrigin(value="http://localhost:4200")
@RestController
public class CustomerController {

	@Autowired
	CustomerRegisterService customerRegisterService;

	//inset all data of customer details
	@RequestMapping(value="/customerDetails",method=RequestMethod.POST)
	public List<CustomerDetails> saveCustomerDetails(@RequestBody CustomerDetails customerDetails){
		customerRegisterService.saveCustomerDetails(customerDetails);
		return customerRegisterService.getCustomerDetails();
	}

	//get all data of customer details
	@RequestMapping(value="/customerDetails",method=RequestMethod.GET)
	public List<CustomerDetails> getCustomerDetails(){
		return customerRegisterService.getCustomerDetails();
	}
	
	//here inserting loan deatils data 
	@RequestMapping(value = "/loandetails", method = RequestMethod.POST)
	public List<CustomerLoanDetails> saveLoanDetail(@RequestBody CustomerLoanDetails loandetails) {
		customerRegisterService.saveLoanDetails(loandetails);
		return customerRegisterService.getLoanDetails();
	}

	//here getting loan deatils data 
	@RequestMapping(value = "/loandetails", method = RequestMethod.GET)
	public List<CustomerLoanDetails> getLoanDetails() {
		return customerRegisterService.getLoanDetails();
	}
	
	
	//here updating loan deatils data 
	@RequestMapping(value="/loandetails/{id}",method=RequestMethod.PUT)
	public List<CustomerLoanDetails>updateLoanDetails(@RequestBody CustomerLoanDetails loandetails,@PathVariable int id){
	CustomerLoanDetails details=customerRegisterService.getSingleData(id);
		 details.setLoanAmount(loandetails.getLoanAmount());
		 details.setAdvanceEMI(loandetails.getAdvanceEMI());
		 details.setLoanCode(loandetails.getLoanCode());
		 details.setProcessingFees(loandetails.getProcessingFees());
		 details.setRateOfInterest(loandetails.getRateOfInterest());
		 details.setTotalInterest(loandetails.getTotalInterest());
		 details.setTenure(loandetails.getTenure());
		 details.setStatus(loandetails.getStatus());
		 
		 customerRegisterService.saveLoanDetails(details);
      	return customerRegisterService.getLoanDetails();
	}
	
	//here deleteing loan deatils data 	
	@RequestMapping(value="/loandetails/{id}",method=RequestMethod.DELETE)
	public List<CustomerLoanDetails>deleteLoanDetails(@PathVariable int id){
             CustomerLoanDetails loandetails= customerRegisterService.getSingleData(id);
		     customerRegisterService.deleteLoanDetails(loandetails);
     return customerRegisterService.getLoanDetails();
	}
	
	
	
	//here inserting customer enquiry data 
	@RequestMapping(value="/enquiry",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public  List<CustomerEnquiry> saveCustomerEnquiry(@RequestBody CustomerEnquiry customerenquiry) {
		 customerRegisterService.saveCustomerEnquiry(customerenquiry);
		 return customerRegisterService.getCustomerEnquiry();
	}

	//here getting customer enquiry data 
	@RequestMapping(value="/enquiry",method=RequestMethod.GET)
	public List<CustomerEnquiry> getCustomerEnquiry() {
		return customerRegisterService.getCustomerEnquiry();
	}
	

	//here updating customer enquiry data 
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
	

	//here deleting customer enquiry data 
	@RequestMapping(value="/enquiry/{id}",method=RequestMethod.DELETE)
	public List<CustomerEnquiry>deleteCustomerEnquiry(@PathVariable int id){
	      CustomerEnquiry enquiry= customerRegisterService.getSingle(id);
		 customerRegisterService.deleteCustomerEnquiry(enquiry);
		return 	customerRegisterService.getCustomerEnquiry();	
	}
	

	//here inserting customer employementDetails  	
	@RequestMapping(value="/employementDetails",method=RequestMethod.POST)
	public List<CustomerEmploymentDetails> saveCustomerEmployementDetails(@RequestBody CustomerEmploymentDetails customerEmploymentDetails) {
		customerRegisterService.saveCustomerEmployementDeatails(customerEmploymentDetails);
		return customerRegisterService.getCustomerEmploymentDetails();
	}
	
	//here getting customer employementDetails 
	@RequestMapping(value="/employementDetails",method=RequestMethod.GET)
	public List<CustomerEmploymentDetails>getCustomerEmployementDetails(){
		return customerRegisterService.getCustomerEmploymentDetails();
	}

	//here update customer employementDetails 
	@RequestMapping(value="/employementDetails/{id}",method=RequestMethod.PUT)
	public  List<CustomerEmploymentDetails>updateCustomerEmployementDetails(@PathVariable int id, @RequestBody CustomerEmploymentDetails customerEmploymentDetails){
		CustomerEmploymentDetails employementdetails=customerRegisterService.getSingleDetail(id);
		employementdetails.setDesgignation(customerEmploymentDetails.getDesgignation());
		employementdetails.setAddressOfCompany(customerEmploymentDetails.getAddressOfCompany());
		employementdetails.setEmployeeType(customerEmploymentDetails.getEmployeeType());
		employementdetails.setIndustryType(customerEmploymentDetails.getIndustryType());
		employementdetails.setNameOfCompany(customerEmploymentDetails.getNameOfCompany());
		employementdetails.setStatus(customerEmploymentDetails.getStatus());
		
		customerRegisterService.saveCustomerEmployementDeatails(employementdetails);
		return customerRegisterService.getCustomerEmploymentDetails(); 
	}
	
	//here deleting customer employementDetails 
	@RequestMapping(value="/employementDetails/{id}",method=RequestMethod.DELETE)
	public List<CustomerEmploymentDetails> deleteCustomerEmployementDetails(@PathVariable int id){
		CustomerEmploymentDetails employementdetails=customerRegisterService.getSingleDetail(id);
		customerRegisterService.deleteCustomerEmployementDetails(employementdetails);
		return customerRegisterService.getCustomerEmploymentDetails();	 
	}
	
	//dto
	
	@RequestMapping(value="/enquiryDto",method=RequestMethod.GET)
	public List<CustomerEnquiryDto>getEnquiryDto(){
		return customerRegisterService.get();
	}
	
	@RequestMapping(value="/getByNumber/{mobileNo}",method=RequestMethod.GET)
	public CustomerDetailsDto get(@PathVariable String mobileNo) {
		return customerRegisterService.getSingleDto(mobileNo);
	}
	
	@RequestMapping(value = "/getImage/{customerId}",method = RequestMethod.GET)
	public CustomerDocument  getImageById(@PathVariable("customerId")int id) {		
		CustomerDocument doc=customerRegisterService.getImageById(id);		
		return doc;
	}
}
