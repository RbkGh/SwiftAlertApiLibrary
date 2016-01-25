/**
 * 
 */
package com.swiftpot.alertsmsapi.groups;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.swiftpot.alertsmsapi.model.GetAllGroupsResponse;

/**
 * @author Rodney
 *
 */
public class GroupsManager {

	public GroupsManager(){}

	public GroupsManager getInstance() {
		return new GroupsManager();
	}

	public GetAllGroupsResponse getAllGroupsOnAccount(String userName, String url) {

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		headers.add("Accept", "application/json");

		Map<String, String> params = new HashMap<String, String>();


		HttpEntity<GetAllGroupsResponse> entityRequest = new HttpEntity<GetAllGroupsResponse>(headers);

		RestTemplate restTemplate = new RestTemplate();
		GetAllGroupsResponse getAllGroupsResponse = new GetAllGroupsResponse();
		try {
			ResponseEntity<GetAllGroupsResponse> entityResponse = restTemplate.postForEntity(url+"?userName="+userName, entityRequest,
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

}
