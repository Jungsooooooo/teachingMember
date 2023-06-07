package com.example.test.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.test.workspaceObject.entity.WorkspaceObject;

import lombok.Getter;

@Entity
@Table(name = "g_test")
@Getter
public class Test extends WorkspaceObject {
	
	@Column
	private String Test;
	
	public void setTest(String test) {
		this.Test = test;
	}
}
