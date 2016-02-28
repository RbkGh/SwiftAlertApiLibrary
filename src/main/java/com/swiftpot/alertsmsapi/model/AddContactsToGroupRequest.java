/**
 * 
 */
package com.swiftpot.alertsmsapi.model;

import java.util.ArrayList;

/**
 * @url SwiftPot.com
 * @author Rodney on Feb 5, 2016 @ 11:39:52 AM<rbk.unlimited@gmail.com>
 *
 */
public class AddContactsToGroupRequest {

	private String groupId;
	private String tokenId;
	private ArrayList<SingleContact> contactsList;

	
	public String getGroupId() {
		return groupId;
	}


	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}


	public String getTokenId() {
		return tokenId;
	}


	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}


	public ArrayList<SingleContact> getContactsList() {
		return contactsList;
	}


	public void setContactsList(ArrayList<SingleContact> contactsList) {
		this.contactsList = contactsList;
	}


	
}
