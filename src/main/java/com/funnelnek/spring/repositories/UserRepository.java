package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.funnelnek.spring.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    
}
