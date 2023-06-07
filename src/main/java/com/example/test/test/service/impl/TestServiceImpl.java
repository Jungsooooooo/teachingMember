package com.example.test.test.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.test.dto.TestRequestDto;
import com.example.test.test.dto.TestResponseDto;
import com.example.test.test.entity.Test;
import com.example.test.test.repository.TestRepository;
import com.example.test.test.service.TestService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestRepository testRepository;
	
	@Override
		public List<TestResponseDto> getTest() {
			List<Test> test = testRepository.findAll();
			

			return test.stream().map(item-> new TestResponseDto(item)).collect(Collectors.toList());
		}
	
	@Override
	public Test createTest(TestRequestDto testRequestDto) {
		Test test = testRequestDto.toEntity();
		
		test = testRepository.save(test);
		
		return test;
	}
	
}
