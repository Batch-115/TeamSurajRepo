package com.webcore.app.easyemi.customerRegistration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerFirstName;
	private String customerMiddleName;
	private String customerLastName;
	private String customerDataOfBirth;
	private String customerGender;
	private String customerMaritailStatus;
	private String customerMobileNumber;
	private String customerAddress;
	private String customerEducation;
	private String customerAppliedLoadAmount;
	private int status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerDocument customerDocument;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddr;

	@OneToMany(cascade = CascadeType.ALL)
	private List<ProductDetail> productDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerEmploymentDetails customerEmploymentDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<CustomerLoanDetails> customerLoanDetails;

	
	
	public CustomerDocument getCustomerDocument() {
		return customerDocument;
	}

	public void setCustomerDocument(CustomerDocument customerDocument) {
		this.customerDocument = customerDocument;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerMiddleName() {
		return customerMiddleName;
	}

	public void setCustomerMiddleName(String customerMiddleName) {
		this.customerMiddleName = customerMiddleName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerDataOfBirth() {
		return customerDataOfBirth;
	}

	public void setCustomerDataOfBirth(String customerDataOfBirth) {
		this.customerDataOfBirth = customerDataOfBirth;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerMaritailStatus() {
		return customerMaritailStatus;
	}

	public void setCustomerMaritailStatus(String customerMaritailStatus) {
		this.customerMaritailStatus = customerMaritailStatus;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEducation() {
		return customerEducation;
	}

	public void setCustomerEducation(String customerEducation) {
		this.customerEducation = customerEducation;
	}

	public String getCustomerAppliedLoadAmount() {
		return customerAppliedLoadAmount;
	}

	public void setCustomerAppliedLoadAmount(String customerAppliedLoadAmount) {
		this.customerAppliedLoadAmount = customerAppliedLoadAmount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public CustomerAddress getCustomerAddr() {
		return customerAddr;
	}

	public void setCustomerAddr(CustomerAddress customerAddr) {
		this.customerAddr = customerAddr;
	}

	public List<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

	public CustomerEmploymentDetails getCustomerEmploymentDetails() {
		return customerEmploymentDetails;
	}

	public void setCustomerEmploymentDetails(CustomerEmploymentDetails customerEmploymentDetails) {
		this.customerEmploymentDetails = customerEmploymentDetails;
	}

	public List<CustomerLoanDetails> getCustomerLoanDetails() {
		return customerLoanDetails;
	}

	public void setCustomerLoanDetails(List<CustomerLoanDetails> customerLoanDetails) {
		this.customerLoanDetails = customerLoanDetails;
	}
	private Double customerNetMonthlyIncome;
	

	public Double getCustomerNetMonthlyIncome() {
		return customerNetMonthlyIncome;
	}

	public void setCustomerNetMonthlyIncome(Double customerNetMonthlyIncome) {
		this.customerNetMonthlyIncome = customerNetMonthlyIncome;
	}

	
}
//
//	/*
//	 * @OneToOne private CustomerDocument customerDocument;
//	 */
//	/*
//	 * 
//}
