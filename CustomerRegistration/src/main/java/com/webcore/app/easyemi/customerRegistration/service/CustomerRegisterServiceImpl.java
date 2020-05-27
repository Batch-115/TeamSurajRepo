package com.webcore.app.easyemi.customerRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerDocumentRepo;

@Service
public class CustomerRegisterServiceImpl implements CustomerRegisterService {

	@Autowired
	CustomerDocumentRepo customerDocumentRepo;
	
	@Override
	public void storeImage(CustomerDocument custdocment) {
		customerDocumentRepo.save(custdocment);
		
	}

	@Override
	public CustomerDocument getById(int id) {
		// TODO Auto-generated method stub
		return customerDocumentRepo.findById(id).get();
	}

}
