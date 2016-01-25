
package com.swiftpot.alertsmsapi.model;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ResponseSMSBulkObject{

    private Long id;
    private String groupId;
    private String userName;
    private String contactName;
    private String contactPhoneNum;

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId
     *     The groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 
     * @return
     *     The userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName
     *     The userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     * @return
     *     The contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 
     * @param contactName
     *     The contactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 
     * @return
     *     The contactPhoneNum
     */
    public String getContactPhoneNum() {
        return contactPhoneNum;
    }

    /**
     * 
     * @param contactPhoneNum
     *     The contactPhoneNum
     */
    public void setContactPhoneNum(String contactPhoneNum) {
        this.contactPhoneNum = contactPhoneNum;
    }

}
