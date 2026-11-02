package com.java.Assignment2;

class Vehicle {
    void start() {
        System.out.println("Vehicle Started");
    }

    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {
    void displayType() {
        System.out.println("Type: Car");
    }
}

class Bike extends Vehicle {
    void displayType() {
        System.out.println("Type: Bike");
    }
}

public class VehicleDetails {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayType();
        car.start();
        car.stop();

        System.out.println();

        Bike bike = new Bike();
        bike.displayType();
        bike.start();
        bike.stop();
    }
}