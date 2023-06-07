package com.example.test.workspaceObject.dto;

import java.util.UUID;

import com.example.test.workspaceObject.entity.WorkspaceObject;

import lombok.Getter;

@Getter
public class WorkspaceObjectResponseDto {
	
	private UUID uid;
	private String name;
	
	public WorkspaceObjectResponseDto(WorkspaceObject wo) {
		this.uid = wo.getUid();
		this.name = wo.getName();
	}
}
