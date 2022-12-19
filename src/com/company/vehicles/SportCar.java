package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private int maxSpeedSportCar;

    public SportCar(int maxSpeedSportCar) {
        this.maxSpeedSportCar = maxSpeedSportCar;
    }
    public SportCar(String carBrand, String carCategory, double carWeight, Driver driver, Engine engine, int maxSpeedSportCar) {
        super(carBrand, carCategory, carWeight, driver, engine);
        this.maxSpeedSportCar = maxSpeedSportCar;
    }

    public int getMaxSpeedSportCar() {
        return maxSpeedSportCar;
    }
    public void setMaxSpeedSportCar(int maxSpeedSportCar) {
        this.maxSpeedSportCar = maxSpeedSportCar;
    }

    @Override
    public String toString() {
        return "\nCar brand: " + carBrand +
                "\nCar category:" + carCategory +
                "\nCar weight: " + carWeight +
                "\nDriver: " + driver +
                "\nEngine power: " + engine+
                "\nMax speed: " + maxSpeedSportCar;
    }

}
