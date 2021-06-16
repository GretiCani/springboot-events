package com.events;


import com.events.event.EventA;
import com.events.event.EventB;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootApplication
public class SpringbootEventsApplication implements CommandLineRunner {


    private final ApplicationEventPublisher applicationEventPublisher;

    public SpringbootEventsApplication(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEventsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        EventA eventA = new EventA("String A from event A","String B from event A");
        EventB eventB = new EventB("String A from event B","String B from event B");
        applicationEventPublisher.publishEvent(eventA);
        applicationEventPublisher.publishEvent(eventB);
    }
}
