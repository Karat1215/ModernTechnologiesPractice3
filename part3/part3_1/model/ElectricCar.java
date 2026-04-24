package part3.part3_1.model;

import part3.part3_1.interfaces.Electric;

public class ElectricCar extends Car implements Electric {
    private double batteryLevel;
    private double maxRangeKm;

    public ElectricCar(String brand, String model, int year, int doors, boolean automatic, double maxRangeKm) {
        super(brand, model, year, doors, automatic);
        this.batteryLevel = 100.0;
        this.maxRangeKm = maxRangeKm;
    }

    @Override
    public double getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public double getRangeKm() {
        return maxRangeKm * (batteryLevel / 100);
    }

    @Override
    public void charge(double hours) {
        batteryLevel += hours * 20;
        if (batteryLevel > 100) batteryLevel = 100;
    }

    @Override
    public double getFuelConsumption() {
        return 0;
    }

    @Override
    public String getType() {
        return "Электромобиль";
    }
}