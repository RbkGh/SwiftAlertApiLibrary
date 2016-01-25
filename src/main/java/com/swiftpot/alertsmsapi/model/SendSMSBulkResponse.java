
package com.swiftpot.alertsmsapi.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class SendSMSBulkResponse {

    private String status;
    private String message;
    private List<ResponseSMSBulkObject> responseObject = new ArrayList<ResponseSMSBulkObject>();

    
    public SendSMSBulkResponse(){}
    
    public SendSMSBulkResponse(String status, String message, List<ResponseSMSBulkObject> responseObject) {
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
    public List<ResponseSMSBulkObject> getResponseObject() {
        return responseObject;
    }

    /**
     * 
     * @param responseObject
     *     The responseObject
     */
    public void setResponseObject(List<ResponseSMSBulkObject> responseObject) {
        this.responseObject = responseObject;
    }

}
