package com.funnelnek.spring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Vocabulary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @ManyToOne
    private Category category;
    private String word;
    private String definition;

    public Vocabulary() {

    }
    
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }    
    
    public Integer getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
