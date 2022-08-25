package com.funnelnek.spring.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funnelnek.spring.entities.Vocabulary;
import com.funnelnek.spring.repositories.VocabularyRepository;



@RestController
@RequestMapping("api/vocabs")
public class VocabularyController {
    private VocabularyRepository vocabs;    
    

    public VocabularyController(VocabularyRepository vocabs) {
        this.vocabs = vocabs;
    }

    @GetMapping("")
    public Iterable<Vocabulary> allVocabularies() {
        return vocabs.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Vocabulary> findById(@PathVariable("id") Integer id) {
        return vocabs.findById(id);
    }
}
