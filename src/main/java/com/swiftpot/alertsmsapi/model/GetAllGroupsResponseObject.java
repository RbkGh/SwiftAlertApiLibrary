/**
 * 
 */
package com.swiftpot.alertsmsapi.model;

/**
 * @author Rodney
 *
 */
public class GetAllGroupsResponseObject {

private Long id;
private String userName;
private String groupId;
private String groupName;
private Long dateCreated;
private String noOfContacts;

/**
* 
* @return
* The id
*/
public Long getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(Long id) {
this.id = id;
}

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
* The groupName
*/
public String getGroupName() {
return groupName;
}

/**
* 
* @param groupName
* The groupName
*/
public void setGroupName(String groupName) {
this.groupName = groupName;
}

/**
* 
* @return
* The dateCreated
*/
public Long getDateCreated() {
return dateCreated;
}

/**
* 
* @param dateCreated
* The dateCreated
*/
public void setDateCreated(Long dateCreated) {
this.dateCreated = dateCreated;
}

/**
 * @return the noOfContacts
 */
public String getNoOfContacts() {
	return noOfContacts;
}

/**
 * @param noOfContacts the noOfContacts to set
 */
public void setNoOfContacts(String noOfContacts) {
	this.noOfContacts = noOfContacts;
}


}
