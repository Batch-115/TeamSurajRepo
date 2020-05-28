package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;

public interface CustomerRegisterService {

	void saveInfo(CustomerDetails customerDetails);

	List<CustomerDetails> getAll();

	CustomerDocument getImageById(int id);

	String getName(int id);

	//int getDocument(int id);

	//CustomerDocument getImageById(CustomerDocument id);

	/*
	 * List getAllData();
	 * 
	 * 
	 * void saveLoanDetails(CustomerLoanDetails loanDetails);
	 * List<CustomerLoanDetails>getLoanDetails(); CustomerLoanDetails
	 * getSingleData(int id); void deleteLoanDetails(CustomerLoanDetails
	 * customerLoanDetails);
	 * 
	 * void saveCustomerEnquiry(CustomerEnquiry customrenquiry);
	 * List<CustomerEnquiry> getCustomerEnquiry(); CustomerEnquiry getSingle(int
	 * id); void deleteCustomerEnquiry(CustomerEnquiry customerenquiry);
	 * 
	 * void saveCustomerEmployementDeatails(CustomerEmploymentDetails
	 * customeremployementdetails);
	 * List<CustomerEmploymentDetails>getCustomerEmploymentDetails();
	 * CustomerEmploymentDetails getSingleDetail(int id); void
	 * deleteCustomerEmployementDetails(CustomerEmploymentDetails
	 * customeremployementdetails);
	 * 
	 * List<CustomerDetails> displayAll();
	 * 
	 * void deleteID(int id);
	 * 
	 * void saveData(CustomerDetails cd);
	 * 
	 * CustomerDocument getById(int id);
	 * 
	 * void storeImage(CustomerDocument custdocment);
	 */

	

}
