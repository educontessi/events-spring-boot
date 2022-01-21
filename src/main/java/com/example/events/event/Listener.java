package com.example.events.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @EventListener
    public void onApplicationEvent(Event event) {
        System.out.println("Sincrono: " + event.getTexto());
    }
}
