
package com.swiftpot.alertsmsapi.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseObject {

    private String messageId;
    private String networkId;
    private Integer status;
    private String clientReference;
    private String detail;
    private int rate;
    /**
     * 
     * @return
     *     The messageId
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * 
     * @param messageId
     *     The messageId
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * 
     * @return
     *     The networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * 
     * @param networkId
     *     The networkId
     */
    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

	public String getClientReference() {
		return clientReference;
	}

	public void setClientReference(String clientReference) {
		this.clientReference = clientReference;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

    
    
}
