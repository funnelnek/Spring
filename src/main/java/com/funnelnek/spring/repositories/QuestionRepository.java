package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.funnelnek.spring.entities.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {
    
}
