package com.webcore.app.easyemi.paymentOption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.paymentOption.model.CardPayment;

@Repository
public interface CardPaymentRepository extends JpaRepository<CardPayment, Integer>{

}
