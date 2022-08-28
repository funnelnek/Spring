package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.funnelnek.spring.entities.Category;



@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    
}
