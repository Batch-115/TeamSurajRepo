package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.customerRegistration.model.CustomerEnquiry;
import com.webcore.app.easyemi.customerRegistration.model.CustomerLoanDetails;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerEnquiryRepository;
import com.webcore.app.easyemi.customerRegistration.repository.LoanDetailsRepository;

@Service
public class CustomerRegisterServiceImpl implements CustomerRegisterService {

	@Autowired
	 LoanDetailsRepository loandetailsrepo;
	
	@Autowired
	 CustomerEnquiryRepository customerenquiryrepo;
	
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


	
}
