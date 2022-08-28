package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.funnelnek.spring.entities.Vocabulary;



@Repository
public interface VocabularyRepository extends CrudRepository<Vocabulary, Integer> {
    
}
