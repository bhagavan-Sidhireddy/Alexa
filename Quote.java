package com.htc.alexaintegration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Quote")
public class Quote {

	@Id
	public int QuoteID;
	@Column(name = "AgencyID")
	public int AgencyID;
	public String ClientID;
	public String Status;
	public String LOB;
	@Column(name = "ManuscriptID")
	public String ManuScriptID;
	@Column(name = "Policynumber")
	public String PolicyNumber;
	@Column(name = "Effectivedate")
	public String EffectiveDate;
	@Column(name = "Expirationdate")
	public String ExpirationDate;
	@Column(name = "Currentpremium")
	public String CurrentPremium;
	public String XMLData;
	@Column(name = "Datemodified")
	public String DateModified;
	@Column(name = "Dateaccessed")
	public String DateAccessed;
	public String Deleted;
	public String Description;
	public String Producer;
	@Column(name = "Creationdate")
	public String CreationDate;
	@Column(name = "Transactiondate")
	public String TransactionDate;
	public String Description2;
	@Column(name = "Policyversion")
	public int PolicyVersion;
	@Column(name = "XMLDataextended")
	public String XMLDataExtended;
	public String TransACTVersion;
	public Long PortfolioID;
	@Column(name = "LockedsessionID")
	public String LockedSessionID;
	@Column(name = "Currencycode")
	public String CurrencyCode;
	@Column(name = "Writingcompany")
	public String WritingCompany;
	@Column(name = "Branchoffice")
	public String BranchOffice;
	public String ZippedXML;

	public int getQuoteID() {
		return QuoteID;
	}

	public void setQuoteID(int quoteID) {
		QuoteID = quoteID;
	}

	public int getAgencyID() {
		return AgencyID;
	}

	public void setAgencyID(int agencyID) {
		AgencyID = agencyID;
	}

	public String getClientID() {
		return ClientID;
	}

	public void setClientID(String clientID) {
		ClientID = clientID;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getLOB() {
		return LOB;
	}

	public void setLOB(String lOB) {
		LOB = lOB;
	}

	public String getManuScriptID() {
		return ManuScriptID;
	}

	public void setManuScriptID(String manuScriptID) {
		ManuScriptID = manuScriptID;
	}

	public String getPolicyNumber() {
		return PolicyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}

	public String getEffectiveDate() {
		return EffectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		EffectiveDate = effectiveDate;
	}

	public String getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}

	public String getCurrentPremium() {
		return CurrentPremium;
	}

	public void setCurrentPremium(String currentPremium) {
		CurrentPremium = currentPremium;
	}

	public String getXMLData() {
		return XMLData;
	}

	public void setXMLData(String xMLData) {
		XMLData = xMLData;
	}

	public String getDateModified() {
		return DateModified;
	}

	public void setDateModified(String dateModified) {
		DateModified = dateModified;
	}

	public String getDateAccessed() {
		return DateAccessed;
	}

	public void setDateAccessed(String dateAccessed) {
		DateAccessed = dateAccessed;
	}

	public String getDeleted() {
		return Deleted;
	}

	public void setDeleted(String deleted) {
		Deleted = deleted;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getProducer() {
		return Producer;
	}

	public void setProducer(String producer) {
		Producer = producer;
	}

	public String getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}

	public String getTransactionDate() {
		return TransactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}

	public String getDescription2() {
		return Description2;
	}

	public void setDescription2(String description2) {
		Description2 = description2;
	}

	public int getPolicyVersion() {
		return PolicyVersion;
	}

	public void setPolicyVersion(int policyVersion) {
		PolicyVersion = policyVersion;
	}

	public String getXMLDataExtended() {
		return XMLDataExtended;
	}

	public void setXMLDataExtended(String xMLDataExtended) {
		XMLDataExtended = xMLDataExtended;
	}

	public String getTransACTVersion() {
		return TransACTVersion;
	}

	public void setTransACTVersion(String transACTVersion) {
		TransACTVersion = transACTVersion;
	}

	public Long getPortfolioID() {
		return PortfolioID;
	}

	public void setPortfolioID(Long portfolioID) {
		PortfolioID = portfolioID;
	}

	public String getLockedSessionID() {
		return LockedSessionID;
	}

	public void setLockedSessionID(String lockedSessionID) {
		LockedSessionID = lockedSessionID;
	}

	public String getCurrencyCode() {
		return CurrencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}

	public String getWritingCompany() {
		return WritingCompany;
	}

	public void setWritingCompany(String writingCompany) {
		WritingCompany = writingCompany;
	}

	public String getBranchOffice() {
		return BranchOffice;
	}

	public void setBranchOffice(String branchOffice) {
		BranchOffice = branchOffice;
	}

	public String getZippedXML() {
		return ZippedXML;
	}

	public void setZippedXML(String zippedXML) {
		ZippedXML = zippedXML;
	}

}