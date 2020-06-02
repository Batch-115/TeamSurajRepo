package com.webcore.app.easyemi.customerRegistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.customerRegistration.dto.CustomerEnquiryDto;
import com.webcore.app.easyemi.customerRegistration.model.CustomerEnquiry;

@Repository
public interface CustomerEnquiryRepository extends JpaRepository<CustomerEnquiry, Integer> {

	
	@Query("select new com.webcore.app.easyemi.customerRegistration.dto.CustomerEnquiryDto(firstName,lastName,mobileNo,productName,city) from CustomerEnquiry")
	List<CustomerEnquiryDto>getAllDetails();
}
