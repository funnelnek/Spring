package com.funnelnek.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funnelnek.spring.entities.Calendar;
import com.funnelnek.spring.services.CalendarService;
import com.funnelnek.spring.specifications.criterias.CalendarPriceCriteria;


@RestController
@RequestMapping("/api/calendars")
public class CalendarController {
    @Autowired
    private CalendarService service;

    public CalendarController() {}

    @GetMapping("")
    public Iterable<Calendar> findAll(Optional<CalendarPriceCriteria> criteria) {
        return service.findAll();        
    }

    @GetMapping(value = "", params = "price[gte]=50")
    public Iterable<Calendar> findByPriceGreaterThan50() {
        return service.findByPriceGreaterThan50();
    }
}
