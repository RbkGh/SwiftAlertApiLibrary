/**
 * 
 */
package com.swiftpot.alertsmsapi.model;

/**
 * @url SwiftPot.com
 * @author Rodney on Jan 10, 2016 @ 4:14:23 PM<rbk.unlimited@gmail.com>
 *
 */

public class SingleSMSSenderRequest {
	
	private String senderId;
	private String message;
	private String recieverPhoneNum;
	
	public SingleSMSSenderRequest(){}
	public SingleSMSSenderRequest(String senderId, String message, String recieverPhoneNum) {
		super();
		this.senderId = senderId;
		this.message = message;
		this.recieverPhoneNum = recieverPhoneNum;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRecieverPhoneNum() {
		return recieverPhoneNum;
	}
	public void setRecieverPhoneNum(String recieverPhoneNum) {
		this.recieverPhoneNum = recieverPhoneNum;
	}
	

}
