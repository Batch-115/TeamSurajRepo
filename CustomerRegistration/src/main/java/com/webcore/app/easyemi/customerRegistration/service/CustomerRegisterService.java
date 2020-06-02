package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import com.webcore.app.easyemi.customerRegistration.dto.CustomerDetailsDto;
import com.webcore.app.easyemi.customerRegistration.dto.CustomerEnquiryDto;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEmploymentDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEnquiry;
import com.webcore.app.easyemi.customerRegistration.model.CustomerLoanDetails;

public interface CustomerRegisterService {

	//save and get Customer details
	void saveCustomerDetails(CustomerDetails customerDetails);
	List<CustomerDetails> getCustomerDetails();
	
	//loan crud
	void saveLoanDetails(CustomerLoanDetails loanDetails);
    List<CustomerLoanDetails>getLoanDetails();
    CustomerLoanDetails getSingleData(int id);
    void deleteLoanDetails(CustomerLoanDetails customerLoanDetails);
    
    //enquiry crud
    void saveCustomerEnquiry(CustomerEnquiry customrenquiry);
    List<CustomerEnquiry> getCustomerEnquiry();
    CustomerEnquiry getSingle(int id);
    void deleteCustomerEnquiry(CustomerEnquiry customerenquiry);

    //employementdetails crud
    void saveCustomerEmployementDeatails(CustomerEmploymentDetails customeremployementdetails);
    List<CustomerEmploymentDetails>getCustomerEmploymentDetails();
    CustomerEmploymentDetails getSingleDetail(int id); 
    void deleteCustomerEmployementDetails(CustomerEmploymentDetails customeremployementdetails);
     
    
    //dto
    
    List<CustomerEnquiryDto>get();
    
    public CustomerDetailsDto getSingleDto(String customerMobileNumber);
    CustomerDocument getImageById(int id);				
    

}


