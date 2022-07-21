package com.code.managementservice.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("/managementservice")
	public class ManagementController {
		@GetMapping(value = "/HelloTest", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> helloTest() {
					return ResponseEntity.ok("Hello World 5");
			}
			
		}


