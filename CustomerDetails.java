package com.webcore.app.easyemi.customerRegistration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	private String custFirstName;
	private String custMiddleName;
	private String custLastName;
	private String custFatherName;
	private String custMotherName;
	private String custDob;
	private String custGender;
	private String custMaritalStatus;
	private String custEducation;
	private String custNetMontlyIncome;
	private String custAppliedLoanAmount;
	private String custTurnover;
	private String custMobileNum;
	private String custPhone;
}
