package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.funnelnek.spring.entities.Exam;

public interface ExamRepository extends CrudRepository<Exam, Integer> {
    
}
