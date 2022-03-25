package com.company;

public class ShowRoom {
    private final Service service;
    private final Factory factory;
    public ShowRoom(Factory factory, Service service) {
        this.factory = factory;
        this.service = service;
    }
}
