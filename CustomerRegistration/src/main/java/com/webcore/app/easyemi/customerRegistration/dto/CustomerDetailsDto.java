package com.webcore.app.easyemi.customerRegistration.dto;

public class CustomerDetailsDto {

	private int customerId;
	private String customerFirstName;
	private String customerMiddleName;
	private String customerLastName;
	private String customerGender;
	private String customerNetMonthlyIncome;
	private String residenceAddress;
	private String customerMobileNumber;
	
	
	
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
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerNetMonthlyIncome() {
		return customerNetMonthlyIncome;
	}
	public void setCustomerNetMonthlyIncome(String customerNetMonthlyIncome) {
		this.customerNetMonthlyIncome = customerNetMonthlyIncome;
	}
	public String getResidenceAddress() {
		return residenceAddress;
	}
	public void setResidenceAddress(String residenceAddress) {
		this.residenceAddress = residenceAddress;
	}
	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	public CustomerDetailsDto(int customerId,String customerFirstName, String customerMiddleName, String customerLastName,
			String customerGender, String customerNetMonthlyIncome,
			String residenceAddress, String customerMobileNumber) {
		super();
		this.customerId=customerId;
		this.customerFirstName = customerFirstName;
		this.customerMiddleName = customerMiddleName;
		this.customerLastName = customerLastName;
		this.customerGender = customerGender;
		this.customerNetMonthlyIncome = customerNetMonthlyIncome;
		this.residenceAddress = residenceAddress;
		this.customerMobileNumber = customerMobileNumber;
	}
	
	
}
