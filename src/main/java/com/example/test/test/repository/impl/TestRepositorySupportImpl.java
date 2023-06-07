package com.example.test.test.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.test.test.entity.QTest;
import com.example.test.test.entity.Test;
import com.example.test.test.repository.TestRepositorySupport;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class TestRepositorySupportImpl implements TestRepositorySupport  {
	
	@Autowired
	private JPAQueryFactory jpaQueryFactory;
	
	public List<Test> findAll(){
		QTest test = QTest.test;
		return null;
		
	}

}
