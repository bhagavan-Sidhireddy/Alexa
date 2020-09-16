package com.htc.alexaintegration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "History")
public class History {

	@Id
	public int HistoryID;

	public int QuoteID;

	@Column(name = "Changedate")
	public String ChangeDate;

	public String Change;

	@Column(name = "Previouspremium")
	public float PreviousPremium;

	public String Comment;

	public String Deleted;

	@Column(name = "ManuscriptID")
	public String ManuScriptID;

	public String XMLData;

	public String FormsXML;

	@Column(name = "FormstempXML")
	public String FormsTempXML;

	public String TransACTVersion;

	@Column(name = "Policynumber")
	public String PolicyNumber;

	@Column(name = "Cancellationdate")
	public String CancellationDate;

	@Column(name = "Policyeffectivedate")
	public String PolicyEffectiveDate;

	@Column(name = "Expirationdate")
	public String ExpirationDate;

	@Column(name = "Policystatus")
	public String PolicyStatus;

	public String State;

	@Column(name = "Transactionstatus")
	public String TransactionStatus;

	@Column(name = "Transactioneffectivedate")
	public String TransactionEffectiveDate;

	public String Type;

	@Column(name = "Scheduledate")
	public String ScheduleDate;

	@Column(name = "Deprecatedby")
	public String DeprecatedBy;

	public Long UserID;

	@Column(name = "Transactiondate")
	public String TransactionDate;

	@Column(name = "Duplicaterow")
	public String DuplicateRow;

	@Column(name = "Offsetdate")
	public String OffsetDate;

	@Column(name = "Haspremiumimpact")
	public String HasPremiumImpact;

	@Column(name = "Writtenpremium")
	public String WrittenPremium;

	@Column(name = "Changepremium")
	public String ChangePremium;

	public String ZippedXML;

	public int getHistoryID() {
		return HistoryID;
	}

	public void setHistoryID(int historyID) {
		HistoryID = historyID;
	}

	public int getQuoteID() {
		return QuoteID;
	}

	public void setQuoteID(int quoteID) {
		QuoteID = quoteID;
	}

	public String getChangeDate() {
		return ChangeDate;
	}

	public void setChangeDate(String changeDate) {
		ChangeDate = changeDate;
	}

	public String getChange() {
		return Change;
	}

	public void setChange(String change) {
		Change = change;
	}

	public float getPreviousPremium() {
		return PreviousPremium;
	}

	public void setPreviousPremium(float previousPremium) {
		PreviousPremium = previousPremium;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

	public String getDeleted() {
		return Deleted;
	}

	public void setDeleted(String deleted) {
		Deleted = deleted;
	}

	public String getManuScriptID() {
		return ManuScriptID;
	}

	public void setManuScriptID(String manuScriptID) {
		ManuScriptID = manuScriptID;
	}

	public String getXMLData() {
		return XMLData;
	}

	public void setXMLData(String xMLData) {
		XMLData = xMLData;
	}

	public String getFormsXML() {
		return FormsXML;
	}

	public void setFormsXML(String formsXML) {
		FormsXML = formsXML;
	}

	public String getFormsTempXML() {
		return FormsTempXML;
	}

	public void setFormsTempXML(String formsTempXML) {
		FormsTempXML = formsTempXML;
	}

	public String getTransACTVersion() {
		return TransACTVersion;
	}

	public void setTransACTVersion(String transACTVersion) {
		TransACTVersion = transACTVersion;
	}

	public String getPolicyNumber() {
		return PolicyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}

	public String getCancellationDate() {
		return CancellationDate;
	}

	public void setCancellationDate(String cancellationDate) {
		CancellationDate = cancellationDate;
	}

	public String getPolicyEffectiveDate() {
		return PolicyEffectiveDate;
	}

	public void setPolicyEffectiveDate(String policyEffectiveDate) {
		PolicyEffectiveDate = policyEffectiveDate;
	}

	public String getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}

	public String getPolicyStatus() {
		return PolicyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		PolicyStatus = policyStatus;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getTransactionStatus() {
		return TransactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		TransactionStatus = transactionStatus;
	}

	public String getTransactionEffectiveDate() {
		return TransactionEffectiveDate;
	}

	public void setTransactionEffectiveDate(String transactionEffectiveDate) {
		TransactionEffectiveDate = transactionEffectiveDate;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getScheduleDate() {
		return ScheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		ScheduleDate = scheduleDate;
	}

	public String getDeprecatedBy() {
		return DeprecatedBy;
	}

	public void setDeprecatedBy(String deprecatedBy) {
		DeprecatedBy = deprecatedBy;
	}

	public Long getUserID() {
		return UserID;
	}

	public void setUserID(Long userID) {
		UserID = userID;
	}

	public String getTransactionDate() {
		return TransactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}

	public String getDuplicateRow() {
		return DuplicateRow;
	}

	public void setDuplicateRow(String duplicateRow) {
		DuplicateRow = duplicateRow;
	}

	public String getOffsetDate() {
		return OffsetDate;
	}

	public void setOffsetDate(String offsetDate) {
		OffsetDate = offsetDate;
	}

	public String getHasPremiumImpact() {
		return HasPremiumImpact;
	}

	public void setHasPremiumImpact(String hasPremiumImpact) {
		HasPremiumImpact = hasPremiumImpact;
	}

	public String getWrittenPremium() {
		return WrittenPremium;
	}

	public void setWrittenPremium(String writtenPremium) {
		WrittenPremium = writtenPremium;
	}

	public String getChangePremium() {
		return ChangePremium;
	}

	public void setChangePremium(String changePremium) {
		ChangePremium = changePremium;
	}

	public String getZippedXML() {
		return ZippedXML;
	}

	public void setZippedXML(String zippedXML) {
		ZippedXML = zippedXML;
	}

}