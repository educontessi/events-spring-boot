package com.example.events.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public Publisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishEvent(final String texto) {
        Event event = new Event(this, texto);
        applicationEventPublisher.publishEvent(event);
    }
}
