/**
 * 
 */
package com.swiftpot.alertsmsapi.groups;

import com.swiftpot.alertsmsapi.extra.ResponseCodes;
import com.swiftpot.alertsmsapi.extra.ResponseMessages;
import com.swiftpot.alertsmsapi.model.AddContactsToGroupRequest;
import com.swiftpot.alertsmsapi.model.AddContactsToGroupResponse;
import com.swiftpot.alertsmsapi.model.GetAllGroupsResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rodney
 *
 */
public class GroupsManager {

	public GroupsManager(){}

	public GroupsManager getInstance() {
		return new GroupsManager();
	}

	/**
	 *	This will return all Groups Registered to Account.
	 * @param userName {@link String}
 	 * @param  url {@link String}url of endPoint
	 * @param tokenId {@link String}
	 * @return {@link GetAllGroupsResponse}
	 */
	public GetAllGroupsResponse getAllGroupsOnAccount(String userName,String tokenId, String url) {

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

		Map<String, String> params = new HashMap<String, String>();


		HttpEntity<GetAllGroupsResponse> entityRequest = new HttpEntity<GetAllGroupsResponse>(headers);

		RestTemplate restTemplate = new RestTemplate();
		GetAllGroupsResponse getAllGroupsResponse = new GetAllGroupsResponse();
		try {
			ResponseEntity<GetAllGroupsResponse> entityResponse = restTemplate.postForEntity(url+"?userName="+userName+"&tokenId="+tokenId, entityRequest,
					GetAllGroupsResponse.class, params);
			getAllGroupsResponse.setStatus(entityResponse.getBody().getStatus());
			getAllGroupsResponse.setMessage(entityResponse.getBody().getMessage());
			getAllGroupsResponse.setResponseObject(entityResponse.getBody().getResponseObject());;
		} catch (Exception e) {
			// TODO: handle exception
			getAllGroupsResponse.setStatus("11");
			getAllGroupsResponse.setMessage("Failed");
			System.err.println("Error=\n\n::");
			e.printStackTrace();
		}
		

		return getAllGroupsResponse;

	}

	/**
	 *
	 * @param addContactsToGroupRequest {@link AddContactsToGroupRequest} object with set parameters
	 * @param url-the url endpoint of resource {@link String}
	 * @return {@link AddContactsToGroupResponse}
	 *
	 */
	public AddContactsToGroupResponse addContactsToGroup(AddContactsToGroupRequest addContactsToGroupRequest,String url){


		AddContactsToGroupResponse addContactsToGroupResponse = new AddContactsToGroupResponse();
	try {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		ResponseEntity<AddContactsToGroupResponse> entityResponse = restTemplate.postForEntity(url,addContactsToGroupRequest,AddContactsToGroupResponse.class);
		addContactsToGroupResponse.setStatus(entityResponse.getBody().getStatus());
		addContactsToGroupResponse.setMessage(entityResponse.getBody().getMessage());
		addContactsToGroupResponse.setResponseObject(entityResponse.getBody().getResponseObject());
	}catch (Exception e){
		addContactsToGroupResponse.setStatus(String.valueOf(ResponseCodes.ERROR.getResponseCode()));
		addContactsToGroupResponse.setMessage(ResponseMessages.ERROR.getResponseMsg());
		System.err.println("Error=\n\n::");
		e.printStackTrace();
	}



		return addContactsToGroupResponse;
	}


}
