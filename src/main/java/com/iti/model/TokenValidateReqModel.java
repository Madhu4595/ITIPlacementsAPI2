package com.iti.model;

public class TokenValidateReqModel {
	
	private String jwtToken;
	private String secretKey;
	public TokenValidateReqModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TokenValidateReqModel(String jwtToken, String secretKey) {
		super();
		this.jwtToken = jwtToken;
		this.secretKey = secretKey;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	@Override
	public String toString() {
		return "TokenValidateReqModel [jwtToken=" + jwtToken + ", secretKey=" + secretKey + "]";
	}
	
	

}
