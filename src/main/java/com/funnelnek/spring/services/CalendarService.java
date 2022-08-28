package com.funnelnek.spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.funnelnek.spring.entities.Calendar;
import com.funnelnek.spring.repositories.CalenderRepository;


@Service
public class CalendarService {
    @Autowired
    private CalenderRepository calendars;

    public Iterable<Calendar> findAll() {
        return calendars.findAll();
    }

    public Iterable<Calendar> findByPriceGreaterThan50() {        
        return calendars.findByPriceGreaterThan(50);
    }

    public Optional<Calendar> findById(Integer id) {
        return calendars.findById(id);
    }
}
