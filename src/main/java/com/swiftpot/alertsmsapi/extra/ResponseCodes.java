package com.swiftpot.alertsmsapi.extra;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at rbk.unlimited@gmail.com> on
 *         28-Feb-16
 */
public enum ResponseCodes {

    SUCCESS(00),
    ERROR(11);


    private int responseCode;
    ResponseCodes(int responseCode){
        this.responseCode = responseCode;
    }

    public int getResponseCode(){
        return responseCode;
    }


}
