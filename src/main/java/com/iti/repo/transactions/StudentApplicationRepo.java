package com.iti.repo.transactions;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iti.entity.transactions.StudentApplication;

public interface StudentApplicationRepo extends JpaRepository<StudentApplication, Integer>{
	
	

}
