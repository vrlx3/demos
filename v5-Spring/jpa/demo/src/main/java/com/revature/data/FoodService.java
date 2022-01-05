package com.revature.data;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FoodRepository foodRepo ;
	
	
	// add ()
	
	public int add (Food food) {
		Food savedFood = foodRepo.save(food);
		
		int pk = savedFood.getId();
		
		return pk;
	}
	
	
	public List<Food> findAllFoods () {
		return foodRepo.findAll();
	}
}
  