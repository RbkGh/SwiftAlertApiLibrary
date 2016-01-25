/**
 * 
 */
package org.gradle;

import com.swiftpot.alertsmsapi.message.MessageSender;
import com.swiftpot.alertsmsapi.model.SingleSMSSenderRequest;
import com.swiftpot.alertsmsapi.model.SingleSMSSenderResponse;

/**
 * @author Rodney
 *
 */
public class TestSendMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{SingleSMSSenderRequest singleRequest = new SingleSMSSenderRequest("SWIFTPOT", 
				"hELLO,tEST FROM API LIBRARY", 
				"0206895796");
		MessageSender msgSender = new MessageSender();
		SingleSMSSenderResponse response = msgSender.sendMessage(singleRequest);
		
		System.err.println("\n"+response.getMessage());
		System.err.println("\n"+response.getStatus());}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
