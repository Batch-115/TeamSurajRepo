package com.webcore.app.easyemi.customerRegistration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerAddressId ;		

    private String residenceIs;
	private String residenceAddress;
	private String area ;
	private String landmark;
	private String city ;
	private String state;
	private String country;
	private String pincode;
	private String residenceSince ;


	private String localResidenceIs ;	
	private String  localResidenceAddress;
	private String localArea;
	private String localLandmark;
	private String localCity;
	private String  localState ;	
	private String localPincode;
	private String localResidenceSince ;
 
	private int  status ;

	public int getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(int customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	public String getResidenceIs() {
		return residenceIs;
	}

	public void setResidenceIs(String residenceIs) {
		this.residenceIs = residenceIs;
	}

	public String getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(String residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getResidenceSince() {
		return residenceSince;
	}

	public void setResidenceSince(String residenceSince) {
		this.residenceSince = residenceSince;
	}

	public String getLocalResidenceIs() {
		return localResidenceIs;
	}

	public void setLocalResidenceIs(String localResidenceIs) {
		this.localResidenceIs = localResidenceIs;
	}

	public String getLocalResidenceAddress() {
		return localResidenceAddress;
	}

	public void setLocalResidenceAddress(String localResidenceAddress) {
		this.localResidenceAddress = localResidenceAddress;
	}

	public String getLocalArea() {
		return localArea;
	}

	public void setLocalArea(String localArea) {
		this.localArea = localArea;
	}

	public String getLocalLandmark() {
		return localLandmark;
	}

	public void setLocalLandmark(String localLandmark) {
		this.localLandmark = localLandmark;
	}

	public String getLocalCity() {
		return localCity;
	}

	public void setLocalCity(String localCity) {
		this.localCity = localCity;
	}

	public String getLocalState() {
		return localState;
	}

	public void setLocalState(String localState) {
		this.localState = localState;
	}

	public String getLocalPincode() {
		return localPincode;
	}

	public void setLocalPincode(String localPincode) {
		this.localPincode = localPincode;
	}

	public String getLocalResidenceSince() {
		return localResidenceSince;
	}

	public void setLocalResidenceSince(String localResidenceSince) {
		this.localResidenceSince = localResidenceSince;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
