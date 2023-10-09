package com.iti.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.iti.model.ApiError;

@ControllerAdvice
public class CustomRestExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		
			System.out.println("handleMethodArgumentNotValid");
		// TODO Auto-generated method stub
		List<String> errors = new ArrayList<String>();
		
		for(FieldError error:ex.getBindingResult().getFieldErrors()){
			System.out.println("FieldError");
			errors.add(error.getField() + ":" + error.getDefaultMessage());
		}
		
		for(ObjectError error:ex.getBindingResult().getGlobalErrors()){
			System.out.println("ObjectError");
			errors.add(error.getObjectName() + ":" + error.getDefaultMessage());
		}
		
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, errors);
		
		return new ResponseEntity<>(apiError, HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(MissingServletRequestParameterException.class)
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex) {
		// TODO Auto-generated method stub
		System.out.println("handleMissingServletRequestParameter");
		// TODO Auto-generated method stub
		List<String> errors = new ArrayList<String>();
		 
		errors.add("Missing required parameter: "+ex.getParameterName());
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, errors);
		
		return new ResponseEntity<>(apiError, HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(BindException.class)
	protected ResponseEntity<Object> handleBindException(BindException ex) {
		System.out.println("handleBindException");
		// TODO Auto-generated method stub
		List<String> errors = new ArrayList<String>();
		
		for(FieldError error:ex.getBindingResult().getFieldErrors()){
			System.out.println("handleBindException=>FieldError");
			errors.add(error.getField() + ":" + error.getDefaultMessage());
		}
		
		for(ObjectError error:ex.getBindingResult().getGlobalErrors()){
			System.out.println("handleBindException=>ObjectError");
			errors.add(error.getObjectName() + ":" + error.getDefaultMessage());
		}
		
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, errors);
		
		return new ResponseEntity<>(apiError, HttpStatus.UNPROCESSABLE_ENTITY);
	}
//	@Override
//	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		
//		System.out.println("handleMethodArgumentNotValid");
//		// TODO Auto-generated method stub
//		List<String> errors = new ArrayList<String>();
//		
//		for(FieldError error:ex.getBindingResult().getFieldErrors()){
//			System.out.println("FieldError");
//			errors.add(error.getField() + ":" + error.getDefaultMessage());
//		}
//		
//		for(ObjectError error:ex.getBindingResult().getGlobalErrors()){
//			System.out.println("ObjectError");
//			errors.add(error.getObjectName() + ":" + error.getDefaultMessage());
//		}
//		
//		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, errors);
//		
//		return handleExceptionInternal(ex, apiError, headers, apiError.getStatus(), request);
//	}
//	
//	@Override
//	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		// TODO Auto-generated method stub
//		System.out.println("handleMissingServletRequestParameter");
//		// TODO Auto-generated method stub
//		List<String> errors = new ArrayList<String>();
//		
//		errors.add("Missing required parameter: "+ex.getParameterName());
//		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, errors);
//		
//		return handleExceptionInternal(ex, apiError, headers, apiError.getStatus(), request);
//	}
//	
//	@Override
//	protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status,
//			WebRequest request) {
//		System.out.println("handleBindException");
//		// TODO Auto-generated method stub
//		List<String> errors = new ArrayList<String>();
//		
//		for(FieldError error:ex.getBindingResult().getFieldErrors()){
//			System.out.println("handleBindException=>FieldError");
//			errors.add(error.getField() + ":" + error.getDefaultMessage());
//		}
//		
//		for(ObjectError error:ex.getBindingResult().getGlobalErrors()){
//			System.out.println("handleBindException=>ObjectError");
//			errors.add(error.getObjectName() + ":" + error.getDefaultMessage());
//		}
//		
//		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, errors);
//		
//		return handleExceptionInternal(ex, apiError, headers, apiError.getStatus(), request);
//	}
	
}
