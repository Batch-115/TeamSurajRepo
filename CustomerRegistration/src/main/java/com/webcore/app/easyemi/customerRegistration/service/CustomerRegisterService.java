package com.webcore.app.easyemi.customerRegistration.service;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;

public interface CustomerRegisterService {

	void storeImage(CustomerDocument custdocment);

	CustomerDocument getById(int id);

}
