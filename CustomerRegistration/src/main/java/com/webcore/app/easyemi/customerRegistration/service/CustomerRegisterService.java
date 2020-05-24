package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import com.webcore.app.easyemi.customerRegistration.model.CustomerEmploymentDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEnquiry;
import com.webcore.app.easyemi.customerRegistration.model.CustomerLoanDetails;

public interface CustomerRegisterService {

	void saveLoanDetails(CustomerLoanDetails loanDetails);
    List<CustomerLoanDetails>getLoanDetails();
    CustomerLoanDetails getSingleData(int id);
    void deleteLoanDetails(CustomerLoanDetails customerLoanDetails);
    
    void saveCustomerEnquiry(CustomerEnquiry customrenquiry);
    List<CustomerEnquiry> getCustomerEnquiry();
    CustomerEnquiry getSingle(int id);
    void deleteCustomerEnquiry(CustomerEnquiry customerenquiry);

    void saveCustomerEmployementDeatails(CustomerEmploymentDetails customeremployementdetails);
    List<CustomerEmploymentDetails>getCustomerEmploymentDetails();
    CustomerEmploymentDetails getSingleDetail(int id); 
    void deleteCustomerEmployementDetails(CustomerEmploymentDetails customeremployementdetails);
      
}


