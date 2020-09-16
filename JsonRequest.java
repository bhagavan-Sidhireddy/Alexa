package com.htc.alexaintegration.model;

public class JsonRequest {

	public String policyNumber;
	public String responseType;

	public String getPolicyNumber() {
		return policyNumber;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

}
