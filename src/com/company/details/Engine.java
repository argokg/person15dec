package com.company.details;

public class Engine {
    private int enginePower;
    private String engineManufacturer;






    public Engine() {
    }

    public Engine(int enginePower, String engineManufacturer) {
        this.enginePower = enginePower;
        this.engineManufacturer = engineManufacturer;
    }






    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    public void setEngineManufacturer(String engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    @Override
    public String toString() {
        return  enginePower +
                "\nManufacturer: " + engineManufacturer;
    }
}
