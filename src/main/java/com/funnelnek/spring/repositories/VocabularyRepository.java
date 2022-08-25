package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.funnelnek.spring.entities.Vocabulary;

public interface VocabularyRepository extends CrudRepository<Vocabulary, Integer> {
    
}
