package com.rtwitty.models;

public class VehicleInfo {

    private int VIN;
    private double odometer;
    private double consumption;
    private double oilOdometer;
    private double engineSize;

    void report(VehicleInfo vehicleInfo) {
    }

    public VehicleInfo(int VIN, double odometer, double consumption, double oilOdometer, double engineSize) {
        this.VIN = VIN;
        this.odometer = odometer;
        this.consumption = consumption;
        this.oilOdometer = oilOdometer;
        this.engineSize = engineSize;


    }

    public VehicleInfo() {
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getOilOdometer() {
        return oilOdometer;
    }

    public void setOilOdometer(double oilOdometer) {
        this.oilOdometer = oilOdometer;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "VIN = " + VIN +
                ", odometer= " + odometer +
                ", consumption= " + consumption +
                ", oil odometer= " + oilOdometer +
                ", engeine size = " + engineSize +
                '}';
    }
}