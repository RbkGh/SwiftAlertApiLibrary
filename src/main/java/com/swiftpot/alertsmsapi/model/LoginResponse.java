/**
 * 
 */
package com.swiftpot.alertsmsapi.model;

/**
 * @url SwiftPot.com
 * @author Rodney on Jan 19, 2016 @ 11:22:32 PM<rbk.unlimited@gmail.com>
 *
 */
public class LoginResponse extends IncomingPayload {

	private LoginResponseObject responseObject;

	public LoginResponseObject getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(LoginResponseObject responseObject) {
		this.responseObject = responseObject;
	}

	public LoginResponse() {
	}

	public class LoginResponseObject {
		private String userName;
		private String toKen;
		private String lastLoginTime;
		private String deviceId;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getToKen() {
			return toKen;
		}

		public void setToKen(String toKen) {
			this.toKen = toKen;
		}

		public String getLastLoginTime() {
			return lastLoginTime;
		}

		public void setLastLoginTime(String lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}

		public String getDeviceId() {
			return deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}
	}

}
