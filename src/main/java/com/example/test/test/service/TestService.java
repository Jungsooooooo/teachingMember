package com.example.test.test.service;

import java.util.List;

import com.example.test.test.dto.TestRequestDto;
import com.example.test.test.dto.TestResponseDto;
import com.example.test.test.entity.Test;

public interface TestService {
	
	public List<TestResponseDto> getTest();

	public Test createTest(TestRequestDto testRequestDto);
}
