package com.webcore.app.easyemi.paymentOption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.paymentOption.model.PhonePayPayment;

@Repository
public interface PhonePayPaymentRepository extends JpaRepository<PhonePayPayment, Integer>{

}
