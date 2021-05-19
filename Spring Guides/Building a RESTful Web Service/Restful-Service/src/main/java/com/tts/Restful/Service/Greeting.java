package com.tts.Restful.Service;


//This service will handle GET requests for /greeting with an optional name param in
//the query string
//This class is a model of the greeting representation

public class Greeting {
    private final long id; //field -- unique identifier for the greeting
    private final String content; //field -- textual representation of the greeting

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
