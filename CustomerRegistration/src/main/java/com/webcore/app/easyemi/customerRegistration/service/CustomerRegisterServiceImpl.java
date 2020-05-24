package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.repository.CustomerRegisterRepo;

@Service
public class CustomerRegisterServiceImpl implements CustomerRegisterService {

	@Autowired
	CustomerRegisterRepo cr;
	
	@Override
	public void saveInfo(CustomerDetails cd) {
		cr.save(cd);
		
	}

	@Override
	public List getAllData() {
		return cr.findAll();
	}

}
