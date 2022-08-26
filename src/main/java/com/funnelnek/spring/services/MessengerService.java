package com.funnelnek.spring.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;



@Service
public class MessengerService {

    public String timestamp(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  

        return isValid(message) ? message + "\n " + dtf.format(now) :  null;
    }

    private boolean isValid(String message) {
        Pattern re = Pattern.compile("insert|drop|update|alter|create", Pattern.CASE_INSENSITIVE);
        return !re.matcher(message).find();
    }
}
