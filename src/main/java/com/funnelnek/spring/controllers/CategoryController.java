package com.funnelnek.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funnelnek.spring.entities.Category;
import com.funnelnek.spring.repositories.CategoryRepository;



@RestController
@RequestMapping("api/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categories;
    
    

    public CategoryController() {
        
    }

    @GetMapping("")    
    public Iterable<Category> allCategories() {
        return categories.findAll();
    }

    @GetMapping("/{id}")    
    public Optional<Category> findById(@PathVariable("id") Integer id) {
        return categories.findById(id);
    }
}
