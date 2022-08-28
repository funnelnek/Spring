package com.funnelnek.spring.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.funnelnek.spring.entities.Calendar;


@Repository
public interface CalenderRepository extends CrudRepository<Calendar, Integer>, JpaSpecificationExecutor<Calendar> {
    public Iterable<Calendar> findByPriceGreaterThan(double price);
}
