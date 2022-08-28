package com.funnelnek.spring.specifications;

import java.util.Map;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.funnelnek.spring.entities.Calendar;

public class CalendarSpecification {
    public static Specification<Calendar> findByPrice(Map<String, Double> criteria) {
        return (Root<Calendar> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            String operator = null;
            Double value = null;

            for(Map.Entry<String, Double> filter: criteria.entrySet()) {
                operator = filter.getKey();
                value = filter.getValue();
            }

            switch (operator) {
                case "ne":
                    return builder.notEqual(root.get("prive"), value);
                case "lt":
                    return builder.lessThan(root.get("prive"), value);
                case "lte":
                    return builder.lessThanOrEqualTo(root.get("prive"), value);
                case "gt":
                return builder.greaterThan(root.get("prive"), value);
                case "gte":
                    return builder.greaterThanOrEqualTo(root.get("prive"), value);
                default:
                    return builder.equal(root.get("price"), value);
            }
        };
    }
}
