/**
 * 
 */
package com.swiftpot.alertsmsapi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rodney
 *
 */
public class GetAllGroupsResponse {

	private String status;
	private String message;
	private List<GetAllGroupsResponseObject> responseObject = new ArrayList<GetAllGroupsResponseObject>();

	/**
	* 
	* @return
	* The status
	*/
	public String getStatus() {
	return status;
	}

	/**
	* 
	* @param status
	* The status
	*/
	public void setStatus(String status) {
	this.status = status;
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

	/**
	* 
	* @return
	* The responseObject
	*/
	public List<GetAllGroupsResponseObject> getResponseObject() {
	return responseObject;
	}

	/**
	* 
	* @param responseObject
	* The responseObject
	*/
	public void setResponseObject(List<GetAllGroupsResponseObject> responseObject) {
	this.responseObject = responseObject;
	}

}
