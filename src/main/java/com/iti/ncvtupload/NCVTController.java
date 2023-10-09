package com.iti.ncvtupload;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iti.model.ResponseObject;
import com.iti.model.ResponseRest;
import com.iti.repo.transactions.AdmissionsRepo;
import com.iti.util.MyUtil;

@RestController
@RequestMapping("/api/ncvt/")
@CrossOrigin(origins = "*")
public class NCVTController {
	
	@Autowired private AdmissionsRepo admissionsRepo;
	@Autowired private MyUtil myUtil;
	
	
	@PostMapping("getDashboardreportIti")
	public ResponseEntity<?> getDashboardreportIti(HttpServletRequest request){
		
		System.out.println("/api/ncvt/getDashboardreportIti");
		final String authorizationHeader = request.getHeader("Authorization");
		System.out.println("authorizationHeader=>"+authorizationHeader);
		
		ResponseObject responseObject = myUtil.validToken(authorizationHeader);
		if(responseObject.getValidToken()) {
			if(responseObject.getRoleId().equalsIgnoreCase("4")) {
				NcvtProjection getDashboardreportIti = admissionsRepo.getDashboardreportIti(responseObject.getInsCode());
				return new ResponseEntity<>(getDashboardreportIti,HttpStatus.OK);
			}else {
				String msg = "Your Not Authorized to this Page";
				ResponseRest resp = new ResponseRest();
				resp.setMsg(msg);
				return new ResponseEntity<>(resp,HttpStatus.NOT_FOUND);
			}
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Your Given Token is Invalid.");
		}
	}

}
