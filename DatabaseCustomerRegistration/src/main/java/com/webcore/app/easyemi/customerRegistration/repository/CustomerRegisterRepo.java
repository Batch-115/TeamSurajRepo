package com.webcore.app.easyemi.customerRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;

@Repository
public interface CustomerRegisterRepo extends JpaRepository<CustomerDetails, Integer>{

}
