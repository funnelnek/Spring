package com.funnelnek.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funnelnek.spring.services.MessengerService;


@RestController
@RequestMapping("api/messages")
public class MessengerController {
    
    @Autowired
    private MessengerService service;

    public MessengerController() {
        
    }

    @PostMapping("")
    public String message(@RequestBody String message) {
        return service.timestamp(message);
    }
}
