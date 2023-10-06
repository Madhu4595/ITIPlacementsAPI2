package com.iti.reports.transactions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/reports/")
public class ReportsController {
	
	@PostMapping("/getApplicantReport")
	public ResponseEntity<?> getApplicantReport(){
		return null;
	}

}
