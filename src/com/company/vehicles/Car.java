package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    private String carBrand;
    private String carCategory;
    private double carWeight;
    private Driver driver;
    private Engine engine;

//    Lorry lorry;
//    SportCar sportCar;


    public Car() {
    }
    public Car(String carBrand, String carCategory, double carWeight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carCategory = carCategory;
        this.carWeight = carWeight;
        this.driver = driver;
        this.engine = engine;
    }





    public void start(){
        System.out.println("lets go");
    }
    public void stop(){
        System.out.println("STOP");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "\nCar brand: " + carBrand +
                "\nCar category:" + carCategory +
                "\nCar weight: " + carWeight +
                "\nDriver: " + driver +
                "\nEngine power: " + engine;
    }


}
