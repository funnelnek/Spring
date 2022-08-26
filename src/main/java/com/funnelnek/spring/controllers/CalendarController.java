package com.funnelnek.spring.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.funnelnek.spring.entities.Calendar;
import com.funnelnek.spring.services.CalendarService;
import com.funnelnek.spring.specifications.CalendarSpecification;


@RestController
@RequestMapping("api/calendars")
public class CalendarController {
    @Autowired
    private CalendarService service;

    public CalendarController() {}

    @GetMapping("")
    public Iterable<Calendar> findAll(@RequestParam(required = false) Map<String, Object> query) {
        if (query == null || query.isEmpty()) {          
            return service.findAll();
        }


        return service.findAll(CalendarSpecification.findByPriceGreaterThan((String) query.get("price")));
    }
}
