package com.example.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
    String message;
    public HelloWorldBean(String helloWorld) {
        this.message = helloWorld;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean [" +
                "message='" + message + '\'' +
                ']';
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
