package com.revature.advice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.revature.errorhandling.ApiError;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
		return ResponseEntity.status(apiError.getStatus()).body(apiError);
	}

//	@Override
//	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//			
//			String error = "Malformed JSON Request";
//			
//			ApiError apirError = new ApiError(HttpStatus.BAD_REQUEST, error, ex);
//			
//			return buildResponseEntity(apiError);
//			
//	}
}
