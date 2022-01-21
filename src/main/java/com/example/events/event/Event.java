package com.example.events.event;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {

    private final String texto;

    public Event(Object source, String texto) {
        super(source);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
