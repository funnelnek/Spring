package com.funnelnek.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funnelnek.spring.entities.Exam;
import com.funnelnek.spring.repositories.ExamRepository;


@RestController
@RequestMapping("api/exams")
public class ExamController {
    @Autowired
    private ExamRepository exams;

    public ExamController() {
        
    }

    @GetMapping("")
    public Iterable<Exam> allExams() {
        return exams.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Exam> findById(@PathVariable() Integer id) {
        return exams.findById(id);
    }
}
