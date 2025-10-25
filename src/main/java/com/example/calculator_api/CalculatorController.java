package com.example.calculator_api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {
	
	@GetMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return a+b;
	}
	
	
	@GetMapping("/sub")
	public int sub(@RequestParam int a, @RequestParam int b) {
		return a-b;
	}
	
	
	@GetMapping("/multi")
	public int multi(@RequestParam int a, @RequestParam int b) {
		return a+b;
	}
	
	@GetMapping("/div")
	public int divide(@RequestParam int a, @RequestParam int b) {
		return a+b;
	}
	
}
