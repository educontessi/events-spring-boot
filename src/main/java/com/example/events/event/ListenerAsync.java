package com.example.events.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Async
public class ListenerAsync {

    @EventListener
    public void onApplicationEvent(Event event) {
        System.out.println("Assincrono: " + event.getTexto());
    }


}
