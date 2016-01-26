/**
 * 
 */
package com.swiftpot.alertsmsapi.model;

/**
 * @author Rodney
 *
 */
public class SendSMSBulkRequest{
	private String userName;
	private String groupId;
	private String message;
	private String tokenId;
	/**
	* 
	* @return
	* The userName
	*/
	public String getUserName() {
	return userName;
	}

	/**
	* 
	* @param userName
	* The userName
	*/
	public void setUserName(String userName) {
	this.userName = userName;
	}

	/**
	* 
	* @return
	* The groupId
	*/
	public String getGroupId() {
	return groupId;
	}

	/**
	* 
	* @param groupId
	* The groupId
	*/
	public void setGroupId(String groupId) {
	this.groupId = groupId;
	}

	/**
	* 
	* @return
	* The message
	*/
	public String getMessage() {
	return message;
	}

	/**
	* 
	* @param message
	* The message
	*/
	public void setMessage(String message) {
	this.message = message;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}


}
