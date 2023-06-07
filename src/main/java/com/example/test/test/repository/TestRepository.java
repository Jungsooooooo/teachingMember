package com.example.test.test.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.test.entity.Test;

public interface TestRepository extends JpaRepository<Test,UUID > { 

}
