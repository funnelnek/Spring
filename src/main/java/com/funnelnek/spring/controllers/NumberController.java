package com.funnelnek.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/numbers")
public class NumberController {

    @GetMapping("/{number}")
    public String calculate(@PathVariable Integer number) {
        String output =  "Given the number: " + number + "\n";
        output += "Multiplied by 2: " + number * 2 + "\n";
        output += "Divided by 2: " + number / 2 + "\n";

        return output;
    }
}
