package com.bootcampexcercise.module10;

public class Bike implements Vehicle {
    //Custom implementation of bike

    @Override
    public void start() {
        System.out.println("Bike is starting with kick....");
    }
    @Override
    public void stop() {
        System.out.println("Bike is stopping using brakes....");
    }
}
