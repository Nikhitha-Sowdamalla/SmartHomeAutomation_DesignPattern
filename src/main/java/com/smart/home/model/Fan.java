package com.smart.home.model;

public class Fan implements Device {
    @Override
    public void turnOn() { System.out.println("Fan is ON"); }

    @Override
    public void turnOff() { System.out.println("Fan is OFF"); }
}
