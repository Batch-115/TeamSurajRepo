package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.customerRegistration.dto.CustomerDetailsDto;
import com.webcore.app.easyemi.customerRegistration.dto.CustomerEnquiryDto;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEmploymentDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEnquiry;
import com.webcore.app.easyemi.customerRegistration.model.CustomerLoanDetails;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerDetailsRepository;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerEmploymentDetailsRepository;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerEnquiryRepository;
import com.webcore.app.easyemi.customerRegistration.repository.LoanDetailsRepository;

@Service
public class CustomerRegisterServiceImpl implements CustomerRegisterService {

	@Autowired
	CustomerDetailsRepository customerdetailrepo; 
	
	@Autowired
	 LoanDetailsRepository loandetailsrepo;
	
	@Autowired
	 CustomerEnquiryRepository customerenquiryrepo;
	
	@Autowired
	CustomerEmploymentDetailsRepository customeremployementdetailsrepo;
	
	
	
	@Override
	public void saveCustomerDetails(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		customerdetailrepo.save(customerDetails);	
	}

	@Override
	public List<CustomerDetails> getCustomerDetails() {
		// TODO Auto-generated method stub
		return customerdetailrepo.findAll();
	}
	
	
	
	@Override
	public void saveLoanDetails(CustomerLoanDetails loanDetails) {
		// TODO Auto-generated method stub
		 loandetailsrepo.save(loanDetails);
	}

	@Override
	public List<CustomerLoanDetails> getLoanDetails() {
		// TODO Auto-generated method stub
		return loandetailsrepo.findAll();
	}

	@Override
	public CustomerLoanDetails getSingleData(int id) {
		// TODO Auto-generated method stub
		return loandetailsrepo.findById(id).get();
	}


	@Override
	public void deleteLoanDetails(CustomerLoanDetails customerLoanDetails) {
		// TODO Auto-generated method stub
	    loandetailsrepo.delete(customerLoanDetails);	
	}
	
	@Override
	public void saveCustomerEnquiry(CustomerEnquiry customrenquiry) {
		// TODO Auto-generated method stub
		customerenquiryrepo.save(customrenquiry);
	}

	@Override
	public List<CustomerEnquiry> getCustomerEnquiry() {
		// TODO Auto-generated method stub
		return customerenquiryrepo.findAll();
	}

	@Override
	public CustomerEnquiry getSingle(int id) {
		// TODO Auto-generated method stub
		return customerenquiryrepo.findById(id).get();
	}

	@Override
	public void deleteCustomerEnquiry(CustomerEnquiry customerenquiry) {
		// TODO Auto-generated method stub
		customerenquiryrepo.delete(customerenquiry);
	}

	@Override
	public void saveCustomerEmployementDeatails(CustomerEmploymentDetails customeremployementdetails) {
		// TODO Auto-generated method stub
		customeremployementdetailsrepo.save(customeremployementdetails);
	}

	@Override
	public List<CustomerEmploymentDetails> getCustomerEmploymentDetails() {
		// TODO Auto-generated method stub
		return customeremployementdetailsrepo.findAll();
	}

	@Override
	public CustomerEmploymentDetails getSingleDetail(int id) {
		// TODO Auto-generated method stub
		return customeremployementdetailsrepo.findById(id).get();
	}

	@Override
	public void deleteCustomerEmployementDetails(CustomerEmploymentDetails customeremployementdetails) {
		// TODO Auto-generated method stub
		customeremployementdetailsrepo.delete(customeremployementdetails);
	}

	@Override
	public List<CustomerEnquiryDto> get() {
		// TODO Auto-g						enerated method stub
		return customerenquiryrepo.getAllDetails();
	}

	@Override
	public CustomerDetailsDto getSingleDto(String customerMobileNumber) {
		// TODO Auto-generated method stub
		return customerdetailrepo.Find(customerMobileNumber);
	}

	@Override
	public CustomerDocument getImageById(int id) {
		// TODO Auto-generated method stub
		return customerdetailrepo.finddocuments(id);
	}

	


	
}
