package com.htc.alexaintegration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyDetails {

	@Id
	@Column(name = "Policynumber")
	public String policyNumber;

	@Column(name = "Historyid")
	public Long historyId;
	@Column(name = "Quoteid")
	public Long quoteId;

	@Column(name = "Currenttranstype")
	public String currentTransType;

	@Column(name = "Effectivedate")
	public String effectiveDate;

	@Column(name = "Renewaleffectivedate")
	public String renewalEffectiveDate;

	@Column(name = "Insured Name")
	public String insuredName;
	@Column(name = "Insured Email")
	public String insuredEmail;

	@Column(name = "Insured Complete Address")
	public String insuredCompleteAddress;

	@Column(name = "Address 1")
	public String address1;

	public String city;

	public String state;

	@Column(name = "Zipcode")
	public Long zipCode;

	@Column(name = "New Premium")
	public float newPremium;

	public float charge;

	public String status;

	@Column(name = "Sessionletterpath")
	public String sessionLetterPath;

	public String getSessionLetterPath() {
		return sessionLetterPath;
	}

	public void setSessionLetterPath(String sessionLetterPath) {
		this.sessionLetterPath = sessionLetterPath;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getCurrentTransType() {
		return currentTransType;
	}

	public void setCurrentTransType(String currentTransType) {
		this.currentTransType = currentTransType;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getRenewalEffectiveDate() {
		return renewalEffectiveDate;
	}

	public void setRenewalEffectiveDate(String renewalEffectiveDate) {
		this.renewalEffectiveDate = renewalEffectiveDate;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getInsuredCompleteAddress() {
		return insuredCompleteAddress;
	}

	public void setInsuredCompleteAddress(String insuredCompleteAddress) {
		this.insuredCompleteAddress = insuredCompleteAddress;
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

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public float getCharge() {
		return charge;
	}

	public void setCharge(float charge) {
		this.charge = charge;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public float getNewPremium() {
		return newPremium;
	}

	public void setNewPremium(float newPremium) {
		this.newPremium = newPremium;
	}

	public Long getHistoryId() {
		return historyId;
	}

	public void setHistoryId(Long historyId) {
		this.historyId = historyId;
	}

	public Long getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(Long quoteId) {
		this.quoteId = quoteId;
	}

	public String getInsuredEmail() {
		return insuredEmail;
	}

	public void setInsuredEmail(String insuredEmail) {
		this.insuredEmail = insuredEmail;
	}

}
