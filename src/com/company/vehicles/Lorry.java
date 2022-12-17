package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double loadCapacityLorry;

    public Lorry(double loadCapacityLorry) {
        this.loadCapacityLorry = loadCapacityLorry;
    }

    public Lorry(String carBrand, String carCategory, double carWeight, Driver driver, Engine engine, double loadCapacityLorry) {
        super(carBrand, carCategory, carWeight, driver, engine);
        this.loadCapacityLorry = loadCapacityLorry;
    }

    public double getLoadCapacityLorry() {
        return loadCapacityLorry;
    }

    public void setLoadCapacityLorry(double loadCapacityLorry) {
        this.loadCapacityLorry = loadCapacityLorry;
    }


}
