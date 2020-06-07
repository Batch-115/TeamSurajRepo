package com.webcore.app.easyemi.customerRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.customerRegistration.dto.CustomerDetailsDto;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer> {

	@Query("select new com.webcore.app.easyemi.customerRegistration.dto.CustomerDetailsDto(c.customerId,c.customerFirstName,c.customerMiddleName,c.customerLastName,c.customerGender,c.customerNetMonthlyIncome,l.residenceAddress,c.customerMobileNumber) from CustomerDetails c INNER JOIN c.customerAddr l where c.customerMobileNumber=:customerMobileNumber")
	CustomerDetailsDto Find(String customerMobileNumber);

	@Query(value = "select customerDocument from CustomerDetails c where c.customerId=:id")
	CustomerDocument finddocuments(int id);
}
