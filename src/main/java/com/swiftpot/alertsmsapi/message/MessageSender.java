/**
 * 
 */
package com.swiftpot.alertsmsapi.message;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.swiftpot.alertsmsapi.model.SingleSMSSenderRequest;
import com.swiftpot.alertsmsapi.model.SingleSMSSenderResponse;

/**
 * @author Rodney
 *
 */
public class MessageSender {

	public SingleSMSSenderResponse sendMessage(SingleSMSSenderRequest smsSenderRequest) {

		//SingleSMSSenderRequest singleSMSSenderRequest = new SingleSMSSenderRequest();
		SingleSMSSenderResponse singleResp = new SingleSMSSenderResponse();
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		try {
			ResponseEntity<SingleSMSSenderResponse> singleSMSSenderResponse = restTemplate.postForEntity(
					"http://localhost:8080/alertsms/v1/sendsms", 
					smsSenderRequest, SingleSMSSenderResponse.class);
			
			System.out.println("message:" + singleSMSSenderResponse.getBody().getMessage());
			singleResp = new SingleSMSSenderResponse(singleSMSSenderResponse.getBody().getStatus(),
					singleSMSSenderResponse.getBody().getMessage(),
					singleSMSSenderResponse.getBody().getResponseObject());
		} catch (Exception e) {
			System.err.println("Exception caught while trying to send message\n\n" + smsSenderRequest.getMessage()
					+ "\n\nto" + smsSenderRequest.getRecieverPhoneNum() + "\n\n" + "from\n\n"
					+ smsSenderRequest.getSenderId());
			e.printStackTrace();
			singleResp.setStatus("11");
			singleResp.setMessage("Failed");

		}
		
		return singleResp;

	}
	
	
	public SingleSMSSenderResponse sendMessage(SingleSMSSenderRequest smsSenderRequest,String url) {

		//SingleSMSSenderRequest singleSMSSenderRequest = new SingleSMSSenderRequest();
		SingleSMSSenderResponse singleResp = new SingleSMSSenderResponse();
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		try {
			ResponseEntity<SingleSMSSenderResponse> singleSMSSenderResponse = restTemplate.postForEntity(
					url, 
					smsSenderRequest, SingleSMSSenderResponse.class);
			
			System.out.println("message:" + singleSMSSenderResponse.getBody().getMessage());
			singleResp = new SingleSMSSenderResponse(singleSMSSenderResponse.getBody().getStatus(),
					singleSMSSenderResponse.getBody().getMessage(),
					singleSMSSenderResponse.getBody().getResponseObject());
		} catch (Exception e) {
			System.err.println("Exception caught while trying to send message\n\n" + smsSenderRequest.getMessage()
					+ "\n\nto" + smsSenderRequest.getRecieverPhoneNum() + "\n\n" + "from\n\n"
					+ smsSenderRequest.getSenderId());
			e.printStackTrace();
			singleResp.setStatus("11");
			singleResp.setMessage("Failed");

		}
		
		return singleResp;

	}
}
