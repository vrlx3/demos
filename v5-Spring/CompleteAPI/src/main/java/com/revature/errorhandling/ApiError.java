package com.revature.errorhandling;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
public class ApiError {
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy hh:mm:ss")
	
	private LocalDateTime timeStamp;
	
	private int status;
	
	private String error;
	
	private String message;
	
	private String debugMessage;
	
	private List <ApiSubError> subErrors = new ArrayList<>();

	public ApiError() {
		super();
		this.timeStamp = LocalDateTime.now();
	}

	public ApiError(HttpStatus status) {
		super();
		this.status = status.value();
		this.error = status.getReasonPhrase();
	}

	public ApiError(HttpStatus status, Throwable ex) {
		super();
		this.message = "No message available";
		this.debugMessage = ex.getLocalizedMessage();
		
	}
	
	public void addSubError(ApiError err) {
		this.subErrors.add(err);
	}
	
	
	
}
