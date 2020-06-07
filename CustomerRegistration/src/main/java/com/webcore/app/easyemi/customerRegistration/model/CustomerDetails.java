package com.webcore.app.easyemi.customerRegistration.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2956355056489900505L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int customerId;	
	 private String customerFirstName;
	 private String customerMiddleName;
	 private String customerLastName;
	 private String customerMobileNumber;
	 private String customerDataOfBirth;
	 private String customerGender;
	 private String customerMaritailStatus;
	 private String customerEducation;
	 private String customerNetMonthlyIncome;
	 private String customergmail;
     private int status;
	


    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
      private CustomerAddress customerAddr;

    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private CustomerDocument customerDocument;
    
 	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
 	private CustomerEmploymentDetails customerEmploymentDetails;
 	
   @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
 	 	private CustomerLoanDetails customerLoanDetails;
   
   @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   private  ProductDetail productDetails;

public ProductDetail getProductDetails() {
	return productDetails;
}

public void setProductDetails(ProductDetail productDetails) {
	this.productDetails = productDetails;
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

public String getCustomerMobileNumber() {
	return customerMobileNumber;
}

public void setCustomerMobileNumber(String customerMobileNumber) {
	this.customerMobileNumber = customerMobileNumber;
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

public String getCustomerEducation() {
	return customerEducation;
}

public void setCustomerEducation(String customerEducation) {
	this.customerEducation = customerEducation;
}

public String getCustomerNetMonthlyIncome() {
	return customerNetMonthlyIncome;
}

public void setCustomerNetMonthlyIncome(String customerNetMonthlyIncome) {
	this.customerNetMonthlyIncome = customerNetMonthlyIncome;
}



public String getCustomergmail() {
	return customergmail;
}

public void setCustomergmail(String customergmail) {
	this.customergmail = customergmail;
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

public CustomerEmploymentDetails getCustomerEmploymentDetails() {
	return customerEmploymentDetails;
}

public void setCustomerEmploymentDetails(CustomerEmploymentDetails customerEmploymentDetails) {
	this.customerEmploymentDetails = customerEmploymentDetails;
}






public CustomerLoanDetails getCustomerLoanDetails() {
	return customerLoanDetails;
}

public void setCustomerLoanDetails(CustomerLoanDetails customerLoanDetails) {
	this.customerLoanDetails = customerLoanDetails;
}

public CustomerDocument getCustomerDocument() {
	return customerDocument;
}

public void setCustomerDocument(CustomerDocument customerDocument) {
	this.customerDocument = customerDocument;
}

@Override
public String toString() {
	return "CustomerDetails [customerId=" + customerId + ", customerFirstName=" + customerFirstName
			+ ", customerMiddleName=" + customerMiddleName + ", customerLastName=" + customerLastName
			+ ", customerMobileNumber=" + customerMobileNumber + ", customerDataOfBirth=" + customerDataOfBirth
			+ ", customerGender=" + customerGender + ", customerMaritailStatus=" + customerMaritailStatus
			+ ", customerEducation=" + customerEducation + ", customerNetMonthlyIncome=" + customerNetMonthlyIncome
			+ ", customergmail=" + customergmail + ", status=" + status + ", customerAddr=" + customerAddr
			+ ", customerDocument=" + customerDocument + ", customerEmploymentDetails=" + customerEmploymentDetails
			+ ", customerLoanDetails=" + customerLoanDetails + ", productDetails=" + productDetails + "]";
}



   
   

 	

}
