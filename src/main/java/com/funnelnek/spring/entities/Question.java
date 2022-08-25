package com.funnelnek.spring.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @ManyToMany(mappedBy = "questions")
    private Collection<Quiz> quizzes;

    private String asks;

    public Question() {

    }

    public Integer getId() {
        return id;
    }

    public String asks() {
        return asks;
    }

    public Collection<Quiz> getQuiz() {
        return quizzes;
    }

    public void setAsks(String asks) {
        this.asks = asks;
    }

    public void setQuiz(Collection<Quiz> quiz) {
        this.quizzes = quiz;
    }
}
