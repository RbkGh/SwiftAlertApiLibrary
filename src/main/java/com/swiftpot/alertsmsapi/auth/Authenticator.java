/**
 * 
 */
package com.swiftpot.alertsmsapi.auth;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.swiftpot.alertsmsapi.model.LoginRequest;
import com.swiftpot.alertsmsapi.model.LoginResponse;

/**
 * @url SwiftPot.com
 * @author Rodney on Jan 19, 2016 @ 11:19:46 PM<rbk.unlimited@gmail.com>
 *
 */
public class Authenticator {

	/**
	 * 
	 * Perform A login Request and get an authentication Token as part of 
	 * the LoginResponse.Token will be used for subsequent requests.
	 * 
	 * @param {@link LoginRequest},url
	 * @return {@link LoginResponse}
	 */
	public LoginResponse getAuthKey(LoginRequest loginRequest,String url){
		LoginResponse loginResponse = new LoginResponse();
		try {
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
	        loginResponse = restTemplate.postForObject(url, loginRequest, LoginResponse.class, "");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			loginResponse.setStatus("11");
			loginResponse.setMessage("Failed");
		}
		return loginResponse;
	}
}
