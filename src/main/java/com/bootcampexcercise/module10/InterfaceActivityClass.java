package com.bootcampexcercise.module10;

public class InterfaceActivityClass {
    //Main method
    public static void main(String[] args) {
        //Call bike method
        Vehicle myBike= new Bike();
        System.out.println("Testing Bike....");
        myBike.start();
        myBike.stop();

        //Call car method
        Vehicle myCar= new Car();
        System.out.println("Testing Car....");
        myCar.start();
        myCar.stop();
    }
}

/* Output is:
Testing Bike....
Bike is starting with kick....
Bike is stopping using brakes....
Testing Car....
Car is starting with key....
Car is stopping using brake padel....
 */
