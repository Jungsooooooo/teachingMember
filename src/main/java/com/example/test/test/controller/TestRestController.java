package com.example.test.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.test.dto.TestRequestDto;
import com.example.test.test.dto.TestResponseDto;
import com.example.test.test.entity.Test;
import com.example.test.test.service.TestService;

@RestController
@RequestMapping("/api/tests")
public class TestRestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping
	public ResponseEntity<?> getTest(){
		List<TestResponseDto> testResponseDto =  testService.getTest();
		
		return new ResponseEntity<>(testResponseDto, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> createTest(@RequestBody TestRequestDto testRequestDto){
		Test test = testService.createTest(testRequestDto);
		TestResponseDto testResponseDto = new TestResponseDto(test);
		
		return new ResponseEntity<>(testResponseDto, HttpStatus.CREATED);
	}
	
	@GetMapping("/jpa")
	public ResponseEntity<?> getTestJpa(@RequestBody TestRequestDto testRequestDto){
		
		return null;
	}
}
