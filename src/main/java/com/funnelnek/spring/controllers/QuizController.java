package com.funnelnek.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funnelnek.spring.entities.Quiz;
import com.funnelnek.spring.repositories.QuizRepository;


@RestController
@RequestMapping("api/quizzes")
public class QuizController {
    @Autowired
    private QuizRepository quizzes;

    

    public QuizController() {
        
    }


    @GetMapping("")
    public Iterable<Quiz> allQuizzez() {
        return quizzes.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Quiz> findById(@PathVariable("id") Integer id) {
        return quizzes.findById(id);
    }
}
