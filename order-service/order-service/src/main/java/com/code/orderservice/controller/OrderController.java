package com.code.orderservice.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("/orderservice")
	public class OrderController {
		@GetMapping(value = "/HelloTest", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> helloTest() {
					return ResponseEntity.ok("Hello World 4");
			}
			
		}


