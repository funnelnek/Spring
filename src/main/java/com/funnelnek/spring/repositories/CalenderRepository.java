package com.funnelnek.spring.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.funnelnek.spring.entities.Calendar;

public interface CalenderRepository extends CrudRepository<Calendar, Integer>, JpaSpecificationExecutor<Calendar> {
    public Iterable<Calendar> findByPriceGreaterThan(double price);
}
