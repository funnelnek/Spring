package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.funnelnek.spring.entities.Quiz;


@Repository
public interface QuizRepository extends CrudRepository<Quiz, Integer> {
    
}
