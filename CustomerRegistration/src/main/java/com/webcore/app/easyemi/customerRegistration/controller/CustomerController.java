package com.webcore.app.easyemi.customerRegistration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.ProductDetail;
import com.webcore.app.easyemi.customerRegistration.service.CustomerRegisterService;

@RestController
public class CustomerController {

	@Autowired
	CustomerRegisterService cr;

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public CustomerDetails registerData(@RequestBody CustomerDetails cd) {
		// CustomerDetails cd=new CustomerDetails();
		cd.setCustomerFirstName("Ram");
		cd.setCustomerMiddleName("Sham");
		cd.setCustomerLastName("Kalaje");
		cd.setCustomerDataOfBirth("02/01/1990");
		cd.setCustomerGender("Male");
		cd.setCustomerMaritailStatus("Married");
		cd.setCustomerMobileNumber("4655494545");
		cd.setCustomerAddress("Pune");
		cd.setCustomerEducation("B.A");
		cd.setCustomerAppliedLoadAmount("50,000/-");
		cd.setStatus(1);

		ProductDetail p = new ProductDetail();
		p.setProductName("Onida LCD TV");
		p.setSpecification("36 inch");
		p.setPrice(50000);
		p.setStatus(1);

		List list = new ArrayList();
		list.add(p);

		cd.setProductDetails(list);
		cr.saveData(cd);
		return cd;
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<CustomerDetails> displayData() {
		return cr.displayAll();
	}

	@RequestMapping(value = "/deleteid/{customerId}", method = RequestMethod.DELETE)
	public void deleteData(@PathVariable("customerId") int id) {
		cr.deleteID(id);
	}
}
