package com.example.events;

import com.example.events.event.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EventsApplication.class, args);
    }

    @Autowired
    Publisher publisher;

    @Override
    public void run(String... args) {
        for (int i = 0; i < 10; i++) {
            publisher.publishEvent("Texto " + i);
        }
    }

}
