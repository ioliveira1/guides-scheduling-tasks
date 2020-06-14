package com.ioliveira.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTasks {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public String reportCurrentTime() {
        System.out.println("The time is " + dateFormat.format(new Date()));
        return "The time is " + dateFormat.format(new Date());
    }

}
