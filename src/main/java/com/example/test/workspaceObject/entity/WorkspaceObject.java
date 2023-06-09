package com.example.test.workspaceObject.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name="g_workspaceObject")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
public class WorkspaceObject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uid;
	
	@Column(nullable = false)
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
}
