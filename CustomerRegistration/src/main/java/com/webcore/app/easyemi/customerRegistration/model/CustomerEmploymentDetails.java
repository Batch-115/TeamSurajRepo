package com.webcore.app.easyemi.customerRegistration.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerEmploymentDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3414642251134705713L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int employeeDetailsId;	
    private String employeeType;	
	private String industryType;	
	private String nameOfCompany;	
	private String desgignation;	
	private String addressOfCompany;	
	private int status;
	public int getEmployeeDetailsId() {
		return employeeDetailsId;
	}
	public void setEmployeeDetailsId(int employeeDetailsId) {
		this.employeeDetailsId = employeeDetailsId;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public String getDesgignation() {
		return desgignation;
	}
	public void setDesgignation(String desgignation) {
		this.desgignation = desgignation;
	}
	public String getAddressOfCompany() {
		return addressOfCompany;
	}
	public void setAddressOfCompany(String addressOfCompany) {
		this.addressOfCompany = addressOfCompany;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
