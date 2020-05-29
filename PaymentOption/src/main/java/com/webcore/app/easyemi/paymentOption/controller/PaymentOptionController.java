package com.webcore.app.easyemi.paymentOption.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.paymentOption.model.CardPayment;
import com.webcore.app.easyemi.paymentOption.model.NeftPayment;
import com.webcore.app.easyemi.paymentOption.model.PhonePayPayment;
import com.webcore.app.easyemi.paymentOption.service.PaymentOptionService;

@RestController
public class PaymentOptionController {

	@Autowired
	PaymentOptionService paymentOptionService;

	@RequestMapping(value = "/saveCardDetils", method = RequestMethod.POST)
	public String cardDetailSave(@RequestBody CardPayment cardPayment) {
		paymentOptionService.saveCardData(cardPayment);
		return "";
	}

	@RequestMapping(value = "/getCardData/{card_Id}", method = RequestMethod.GET)
	public CardPayment getCardDetails(@PathVariable("card_Id") int cardId) {
		CardPayment cardPayment = paymentOptionService.getCardData(cardId);
		return cardPayment;
	}

	@RequestMapping(value = "/saveNeftDetails", method = RequestMethod.POST)
	public String neftDetailSave(@RequestBody NeftPayment neftPayment) {
		paymentOptionService.saveNeftData(neftPayment);
		return "";
	}

	@RequestMapping(value = "/getNeftData/{neft_Id}", method = RequestMethod.GET)
	public NeftPayment getNeftData(@PathVariable("neft_Id") int neftId) {
		NeftPayment neftPayment = paymentOptionService.getNeftDetails(neftId);
		return neftPayment;
	}

	@RequestMapping(value = "/savePhonePayData", method = RequestMethod.POST)
	public String phonePayDetailsSave(@RequestBody PhonePayPayment phonePayPayment) {
		paymentOptionService.savePhonePayData(phonePayPayment);
		return "";
	}

	@RequestMapping(value = "/getPhonePayData/{phonepay_Id}", method = RequestMethod.GET)
	public PhonePayPayment getPhonePayDetails(@PathVariable("phonepay_Id") int phonepayId) {
		PhonePayPayment phonePayPayment = paymentOptionService.getPhonePayData(phonepayId);
		return phonePayPayment;
	}
}
