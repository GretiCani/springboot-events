package com.events.event;

import org.springframework.context.ApplicationEvent;

public class EventA  extends ApplicationEvent {

    private String fieldA;
    private String fieldB;

    public EventA(String fieldA,String fieldB){
        super(fieldA);
        this.fieldA = fieldA;
        this.fieldB = fieldB;
    }

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }
}