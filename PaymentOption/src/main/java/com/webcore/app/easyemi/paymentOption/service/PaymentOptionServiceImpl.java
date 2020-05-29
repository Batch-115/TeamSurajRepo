package com.webcore.app.easyemi.paymentOption.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.paymentOption.model.CardPayment;
import com.webcore.app.easyemi.paymentOption.model.NeftPayment;
import com.webcore.app.easyemi.paymentOption.model.PhonePayPayment;
import com.webcore.app.easyemi.paymentOption.repository.CardPaymentRepository;
import com.webcore.app.easyemi.paymentOption.repository.NeftPaymentRepository;
import com.webcore.app.easyemi.paymentOption.repository.PhonePayPaymentRepository;

@Service
public class PaymentOptionServiceImpl implements PaymentOptionService{

	@Autowired
	CardPaymentRepository CardPaymentRepository;
	
	@Override
	public void saveCardData(CardPayment cardPayment) {
		
		CardPaymentRepository.save(cardPayment);
	}

	@Override
	public CardPayment getCardData(int cardId) {
		return CardPaymentRepository.findById(cardId).get();
	}

	@Autowired
	NeftPaymentRepository neftPaymentRepository;
	
	@Override
	public void saveNeftData(NeftPayment neftPayment) {
		
		neftPaymentRepository.save(neftPayment);
	}

	@Override
	public NeftPayment getNeftDetails(int neftId) {
	return neftPaymentRepository.findById(neftId).get();
	
	}
	
	@Autowired
    PhonePayPaymentRepository phonePayPaymentRepository;
	
	@Override
	public void savePhonePayData(PhonePayPayment phonePayPayment) {
		phonePayPaymentRepository.save(phonePayPayment);
		
	}

	@Override
	public PhonePayPayment getPhonePayData(int phonepayId) {
		return phonePayPaymentRepository.findById(phonepayId).get();
	}

}
