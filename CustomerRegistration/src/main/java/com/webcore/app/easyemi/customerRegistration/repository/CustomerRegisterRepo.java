package com.webcore.app.easyemi.customerRegistration.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;

@Repository
public interface CustomerRegisterRepo extends CrudRepository<CustomerDetails, Integer>{

}
