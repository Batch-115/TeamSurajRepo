package com.webcore.app.easyemi.customerRegistration.service;

import java.util.List;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;

public interface CustomerRegisterService {

	public void saveData(CustomerDetails cd);

	public List<CustomerDetails> displayAll();

	public void deleteID(int id);
}
