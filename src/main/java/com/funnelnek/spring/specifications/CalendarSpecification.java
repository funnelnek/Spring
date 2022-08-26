package com.funnelnek.spring.specifications;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.funnelnek.spring.entities.Calendar;

public class CalendarSpecification {
    public static Specification<Calendar> findByPriceGreaterThan(String price) {
        return (Root<Calendar> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            return builder.greaterThan(root.get("price"), price);
        };
    }
}
