package com.iti.model;

public class TokenValidateRespModel {

	private String valid;
	

	public TokenValidateRespModel(String valid) {
		super();
		this.valid = valid;
	}

	public TokenValidateRespModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "TokenValidateRespModel [valid=" + valid + "]";
	}
	
	
}
