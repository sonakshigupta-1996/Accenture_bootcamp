package com.bootcampexcercise.module10;

public class Car implements Vehicle {
    //Custom implementation of car

    @Override
    public void start() {
        System.out.println("Car is starting with key....");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping using brake padel....");
    }
}
