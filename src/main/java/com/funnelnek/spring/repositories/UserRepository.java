package com.funnelnek.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import com.funnelnek.spring.entities.User;


public interface UserRepository extends CrudRepository<User, Integer> {
    
}
