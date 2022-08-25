package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.funnelnek.spring.entities.Quiz;



public interface QuizRepository extends CrudRepository<Quiz, Integer> {
    
}
