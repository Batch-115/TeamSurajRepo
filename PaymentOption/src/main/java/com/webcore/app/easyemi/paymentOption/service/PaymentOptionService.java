package com.webcore.app.easyemi.paymentOption.service;

import com.webcore.app.easyemi.paymentOption.model.CardPayment;
import com.webcore.app.easyemi.paymentOption.model.NeftPayment;
import com.webcore.app.easyemi.paymentOption.model.PhonePayPayment;

public interface PaymentOptionService {

	void saveCardData(CardPayment cardPayment);

	CardPayment getCardData(int cardId);

	void saveNeftData(NeftPayment neftPayment);

	NeftPayment getNeftDetails(int neftId);

	void savePhonePayData(PhonePayPayment phonePayPayment);

	PhonePayPayment getPhonePayData(int phonepayId);

}
