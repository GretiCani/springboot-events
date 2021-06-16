package com.events.listener;

import com.events.event.EventB;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerB implements ApplicationListener<EventB> {

    @Override
    public void onApplicationEvent(EventB eventB) {
        System.err.println("Event listener B");
        System.err.println(eventB.getFieldA());
        System.err.println(eventB.getFieldB());
    }
}
