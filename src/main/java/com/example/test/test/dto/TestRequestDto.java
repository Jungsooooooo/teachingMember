package com.example.test.test.dto;

import com.example.test.test.entity.Test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TestRequestDto {
	
	private String name;
	private String testObject;
	
	
	public Test toEntity() {
		Test test = new Test();
		
		test.setName(name);
		test.setTest(testObject);
		
		return test;
		
	}
}
