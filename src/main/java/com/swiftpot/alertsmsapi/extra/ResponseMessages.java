package com.swiftpot.alertsmsapi.extra;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at rbk.unlimited@gmail.com> on
 *         28-Feb-16
 */
public enum ResponseMessages {

    SUCCESS("Successful"),
    ERROR("Error");

    String responseMsg;
    ResponseMessages(String responseMsg){
        this.responseMsg = responseMsg;
    }

    public String getResponseMsg(){
        return responseMsg;
    }
}
