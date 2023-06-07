package com.example.test.test.dto;

import com.example.test.test.entity.Test;
import com.example.test.workspaceObject.dto.WorkspaceObjectResponseDto;
import com.example.test.workspaceObject.entity.WorkspaceObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class TestResponseDto extends WorkspaceObjectResponseDto {
	
	private String test;
	
	public TestResponseDto(Test item) {
		super(item);
		this.test = item.getTest();
	}
}
