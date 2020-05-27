package com.webcore.app.easyemi.customerRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;

public interface CustomerDocumentRepo extends JpaRepository<CustomerDocument, Integer>{

}
