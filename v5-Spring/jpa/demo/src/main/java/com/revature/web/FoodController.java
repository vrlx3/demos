package com.revature.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.data.Food;
import com.revature.data.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

	// make calls to FoodService
	
	@Autowired
	private FoodService foodService;
	
	@PostMapping("/add")
	public int addFood (@RequestBody Food food) { // comes from request body from http request
		
		return foodService.add(food);
	}
	
	@GetMapping("/all")
	public List<Food> findAllFoods () {
		
		return foodService.findAllFoods();
	}
}
