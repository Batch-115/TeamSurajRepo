package com.webcore.app.easyemi.customerRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.webcore.app.easyemi.customerRegistration.model.CustomerLoanDetails;


@Repository
public interface LoanDetailsRepository extends JpaRepository<CustomerLoanDetails, Integer> {

}
