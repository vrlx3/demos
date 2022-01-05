package com.revature;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.data.Food;
import com.revature.data.FoodService;

@SpringBootApplication
public class SpringDataJpaApplication  implements CommandLineRunner {

	
	
	@Autowired
	FoodService foodServ;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		Food f1 = new Food ("pasta", 200);
		foodServ.add(f1);
			
	}

}
