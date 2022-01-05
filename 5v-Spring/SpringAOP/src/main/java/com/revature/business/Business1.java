package com.revature.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.data.Dao1;

@Service
public class Business1 {

	@Autowired // dependency injection via Autowire and component scanning
	private Dao1 dao1;

	public String calculateSomething() {
		return dao1.retrieveSomething();
	}
}
