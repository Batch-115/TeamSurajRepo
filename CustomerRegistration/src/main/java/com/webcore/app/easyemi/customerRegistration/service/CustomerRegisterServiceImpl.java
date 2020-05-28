package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerDocumentRepo;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerRegisterRepo;

@Service
public class CustomerRegisterServiceImpl implements CustomerRegisterService {

	@Autowired
	CustomerRegisterRepo customerRegisterRepo;
	
	/*
	 * @Autowired CustomerDocumentRepo customerDocumentRepo;
	 */
	
	
	@Override
	public void saveInfo(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		customerRegisterRepo.save(customerDetails);
	}


	@Override
	public List<CustomerDetails> getAll() {
		// TODO Auto-generated method stub
		return customerRegisterRepo.findAll();
	}


	
	@Override 
	public CustomerDocument getImageById(int id) { 
	  return customerRegisterRepo.finddocuments(id); 
	  }


	@Override
	public String getName(int id) {
		// TODO Auto-generated method stub
		return customerRegisterRepo.findname(id);
	}


	/*
	 * @Override public int getDocument(int id) { // TODO Auto-generated method stub
	 * return customerRegisterRepo.findByCustomerDocument(id)(id); }
	 */

	/*
	 * @Override public CustomerDocument getImageById(int id) { // TODO
	 * Auto-generated method stub return
	 * customerRegisterRepo.findByCustomerDocument; }
	 */

	/*
	 * @Override public List getAllData() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public void saveLoanDetails(CustomerLoanDetails loanDetails) { //
	 * TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public List<CustomerLoanDetails> getLoanDetails() { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public CustomerLoanDetails getSingleData(int id) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public void deleteLoanDetails(CustomerLoanDetails
	 * customerLoanDetails) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void saveCustomerEnquiry(CustomerEnquiry customrenquiry) {
	 * // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public List<CustomerEnquiry> getCustomerEnquiry() { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public CustomerEnquiry getSingle(int id) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public void deleteCustomerEnquiry(CustomerEnquiry customerenquiry)
	 * { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void
	 * saveCustomerEmployementDeatails(CustomerEmploymentDetails
	 * customeremployementdetails) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public List<CustomerEmploymentDetails>
	 * getCustomerEmploymentDetails() { // TODO Auto-generated method stub return
	 * null; }
	 * 
	 * @Override public CustomerEmploymentDetails getSingleDetail(int id) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public void
	 * deleteCustomerEmployementDetails(CustomerEmploymentDetails
	 * customeremployementdetails) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public List<CustomerDetails> displayAll() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public void deleteID(int id) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void saveData(CustomerDetails cd) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public CustomerDocument getById(int id) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public void storeImage(CustomerDocument custdocment) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

}
