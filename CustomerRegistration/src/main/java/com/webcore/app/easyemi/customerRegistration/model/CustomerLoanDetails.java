package com.webcore.app.easyemi.customerRegistration.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CustomerLoanDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3230253099571919128L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	private String loanCode;
	private double loanAmount;
	private double rateOfInterest;
	private int tenure;
	private double advanceEMI;
	private double processingFees; 
	private double totalInterest;
	private String paymentOption;
	private int status;
	
	public String getPaymentOption() {
		return paymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
	
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanCode() {
		return loanCode;
	}
	public void setLoanCode(String loanCode) {
		this.loanCode = loanCode;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getAdvanceEMI() {
		return advanceEMI;
	}
	public void setAdvanceEMI(double advanceEMI) {
		this.advanceEMI = advanceEMI;
	}
	public double getProcessingFees() {
		return processingFees;
	}
	public void setProcessingFees(double processingFees) {
		this.processingFees = processingFees;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
	

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CustomerLoanDetails [loanId=" + loanId + ", loanCode=" + loanCode + ", loanAmount=" + loanAmount
				+ ", rateOfInterest=" + rateOfInterest + ", tenure=" + tenure + ", advanceEMI=" + advanceEMI
				+ ", processingFees=" + processingFees + ", totalInterest=" + totalInterest + ", paymentOption="
				+ paymentOption + ", status=" + status + "]";
	}
   
}
