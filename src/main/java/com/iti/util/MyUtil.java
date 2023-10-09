package com.iti.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.iti.model.ResponseObject;
import com.iti.model.TokenRequestModel;
import com.iti.model.TokenResponseModel;
import com.iti.model.TokenValidateReqModel;
import com.iti.model.TokenValidateRespModel;



@Component
public class MyUtil {
	
	
	@Value("${generateToken}") private String generateToken;
	@Value("${validateToken}") private String validateToken;

	public static Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			// live connection
//			connection = DriverManager.getConnection("jdbc:postgresql://10.160.6.203:5432/itiap",
//					"itiap_25032022", "25032022_itiap");

//			//local connection
			//connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/iti_plcmt", "postgres", "mknic123");
			//connection = DriverManager.getConnection("jdbc:postgresql://10.242.162.237:5432/iti_plcmt", "postgres", "mknic123");
			connection = DriverManager.getConnection("jdbc:postgresql://10.96.64.62:5432/iti_plcmt", "postgres", "mknic123");
			System.out.println("connn ====iti_db_live_copy========> " + connection);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	public String getTradeName(String trade_code) throws SQLException {
		String trade_name = "";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = MyUtil.getConnection();
			ps = con.prepareStatement("select trade_code,trade_name from ititrade_master where trade_code=?");
			ps.setInt(1, Integer.parseInt(trade_code));
			ResultSet rs = ps.executeQuery();
			System.out.println("======MyUtil===getTradeName(String trade_code)==ps=>" + ps);

			if (rs.next()) {
				trade_name = rs.getString("trade_name");
			}
		} catch (Exception e) {
			System.out.println("exception is--->" + e);
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		return trade_name;
	}
	
	public String getEntryDistCode(String ins_code) {
		String dist_code = "";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = MyUtil.getConnection();
			ps = con.prepareStatement("select dist_code from iti where iti_code=?");
			ps.setString(1, ins_code);
			ResultSet rs = ps.executeQuery();
			System.out.println("======MyUtil===getTradeName(String trade_code)==ps=>" + ps);

			if (rs.next()) {
				dist_code = rs.getString("dist_code");
			}
		} catch (Exception e) {
			System.out.println("exception is--->" + e);
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		return dist_code;
		
	}
	
	public String generateToken(TokenRequestModel entity) {
		System.out.println("generateToken=>"+entity.toString());
		String jwtToken = null;
		
		try {
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<TokenResponseModel> responsee = restTemplate.postForEntity(generateToken, entity, TokenResponseModel.class);
			System.out.println("response==>"+responsee.getBody());

			if (responsee.getStatusCode().is2xxSuccessful()) {
				// Handle the response
				jwtToken = responsee.getBody().getJwtToken();
			}
			
		}catch (RestClientException e) {
			// TODO Auto-generated catch block
			System.out.println("RestClientException"+e);
			e.printStackTrace();
		}
		return jwtToken;
	}
	public String validateToken(TokenValidateReqModel entity) {
		System.out.println("validateToken=>"+entity.toString());
		String valid = null;
		
		try {
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<TokenValidateRespModel> responsee = restTemplate.postForEntity(validateToken, entity, TokenValidateRespModel.class);
			System.out.println("response==>"+responsee.getBody());
			
			if (responsee.getStatusCode().is2xxSuccessful()) {
				// Handle the response
				valid = responsee.getBody().getValid();
			}
			
		}catch (RestClientException e) {
			// TODO Auto-generated catch block
			System.out.println("RestClientException"+e);
			e.printStackTrace();
		}
		
		return valid;
	}
	
	

	public ResponseObject validToken(String authorizationHeader) {
		
		System.out.println("validToken");
		ResponseObject responseObject = null;
		try {
			//String apiUrl = "http://10.242.162.237:8080/jwtAuthServer/validateToken";
			String apiUrl = "http://itiadmissions.ap.gov.in/jwtAuthServer/validateToken";
			//String apiUrl = "http://localhost:8888/validateToken";
			RestTemplate restTemplate = new RestTemplate();

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Authorization", authorizationHeader);

			HttpEntity<String> requesthadeer = new HttpEntity<>(headers);
			
			ResponseEntity<ResponseObject> responsee = restTemplate.postForEntity(apiUrl, requesthadeer, ResponseObject.class);
			System.out.println("responsee=>" + responsee.toString());
			System.out.println("responsee=>" + responsee.getBody().getValidToken());
			System.out.println("responsee.getStatusCode()=>" + responsee.getStatusCode());
			if (responsee.getStatusCode().is2xxSuccessful()) {
				// Handle the response
				responseObject = new ResponseObject();
				responseObject.setValidToken(Boolean.valueOf(responsee.getBody().getValidToken()));
				responseObject.setInsCode(responsee.getBody().getInsCode());
				responseObject.setRoleId(responsee.getBody().getRoleId());
				 
			} else {
				// Handle error
				responseObject = new ResponseObject();
				responseObject.setValidToken(Boolean.valueOf(responsee.getStatusCode().toString()));
				System.out.println("Handle error");
			}
		} catch (RestClientException e) {
			// TODO Auto-generated catch block
			System.out.println("RestClientException"+e);
			responseObject = new ResponseObject();
			responseObject.setValidToken(false);
			e.printStackTrace();
		}
		System.out.println("responseObject=>"+responseObject.toString());
		return responseObject;
	}
}

