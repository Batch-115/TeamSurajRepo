package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;

public interface CustomerRegisterService {
	
	public void saveInfo(CustomerDetails cd);

	public List getAllData();

}
