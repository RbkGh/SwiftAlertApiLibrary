
package com.swiftpot.alertsmsapi.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleSMSSenderResponse {

    private String status;
    private String message;
    private ResponseObject responseObject;

    public SingleSMSSenderResponse(){}
    
    
    public SingleSMSSenderResponse(String status, String message, ResponseObject responseObject) {
		super();
		this.status = status;
		this.message = message;
		this.responseObject = responseObject;
	}

	/**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 
     * @return
     *     The responseObject
     */
    public ResponseObject getResponseObject() {
        return responseObject;
    }

    /**
     * 
     * @param responseObject
     *     The responseObject
     */
    public void setResponseObject(ResponseObject responseObject) {
        this.responseObject = responseObject;
    }

}
