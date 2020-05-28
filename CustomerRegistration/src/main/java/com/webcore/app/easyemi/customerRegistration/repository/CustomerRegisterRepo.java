package com.webcore.app.easyemi.customerRegistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDetails;
import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;

@Repository
public interface CustomerRegisterRepo extends JpaRepository<CustomerDetails, Integer>{
	/*
	 * @Query("select addressProof,") CustomerDocument findByCustomerId(int id);
	 */
	
	@Query(value = "select customerFirstName from CustomerDetails c where c.customerId=:id")
	String findname(int id);
	
	@Query(value = "select customerDocument from CustomerDetails c where c.customerId=:id")
	CustomerDocument finddocuments(int id);
	
	//@Query(value = "select name,author,price from Book b where b.price>?1 and b.price<?2")
	//List<Book> findByPriceRange(long price1, long price2);
	
	

}
