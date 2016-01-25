/**
 * 
 */
package com.swiftpot.alertsmsapi.message;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.swiftpot.alertsmsapi.model.SendSMSBulkRequest;
import com.swiftpot.alertsmsapi.model.SendSMSBulkResponse;

/**
 * @author Rodney
 *
 */
public class BulkMessageSender {

	public SendSMSBulkResponse sendBulkMessage(SendSMSBulkRequest request,String url){
		SendSMSBulkResponse sendSMSBulkResponse = new SendSMSBulkResponse();
		try {
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
	        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
	        ResponseEntity<SendSMSBulkResponse> response = restTemplate.postForEntity(url, request, SendSMSBulkResponse.class);
	        
	        sendSMSBulkResponse = new SendSMSBulkResponse(response.getBody().getStatus(),
	        											  response.getBody().getMessage(),
	        											  response.getBody().getResponseObject());
	        
		} catch (Exception e) {
			sendSMSBulkResponse.setMessage("Failed");
			sendSMSBulkResponse.setStatus("11");
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return sendSMSBulkResponse;
	}
}
