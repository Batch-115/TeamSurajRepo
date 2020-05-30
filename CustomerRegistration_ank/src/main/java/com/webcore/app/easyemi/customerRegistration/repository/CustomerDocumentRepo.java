package com.webcore.app.easyemi.customerRegistration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.customerRegistration.model.CustomerDocument;

@Repository
public interface CustomerDocumentRepo extends JpaRepository<CustomerDocument, Integer>{


}
