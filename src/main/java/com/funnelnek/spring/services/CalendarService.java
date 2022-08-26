package com.funnelnek.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.funnelnek.spring.entities.Calendar;
import com.funnelnek.spring.repositories.CalenderRepository;


@Service
public class CalendarService {
    @Autowired
    private CalenderRepository calendars;

    public Iterable<Calendar> findEventsByPriceGreaterThan(double price) {
        return calendars.findByPriceGreaterThan(price);
    }

    public Iterable<Calendar> findAll() {
        return calendars.findAll();
    }

    public Iterable<Calendar> findAll(Specification<Calendar> spec) {
        return calendars.findAll(spec);
    }
}
