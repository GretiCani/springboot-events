package com.events.listener;

import com.events.event.EventA;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerA implements ApplicationListener<EventA> {

    @Override
    public void onApplicationEvent(EventA eventA) {
        System.err.println("Event listener A");
        System.err.println(eventA.getFieldA());
        System.err.println(eventA.getFieldB());
    }
}
