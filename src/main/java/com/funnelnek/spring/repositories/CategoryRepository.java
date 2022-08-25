package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.funnelnek.spring.entities.Category;


public interface CategoryRepository extends CrudRepository<Category, Integer> {
    
}
