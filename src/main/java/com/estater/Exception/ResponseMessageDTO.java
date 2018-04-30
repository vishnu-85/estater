package com.estater.Exception;

public class ResponseMessageDTO {
	private String responseCode;
	private String responseMessage;
	private String errorDiscription;
	private Object data;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getErrorDiscription() {
		return errorDiscription;
	}
	public void setErrorDiscription(String errorDiscription) {
		this.errorDiscription = errorDiscription;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
