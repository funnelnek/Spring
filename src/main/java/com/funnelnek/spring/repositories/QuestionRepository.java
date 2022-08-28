package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.funnelnek.spring.entities.Question;



@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {
    
}
