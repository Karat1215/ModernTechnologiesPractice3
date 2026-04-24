package part3.part3_1.model;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double fuelLevel;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelLevel = 1.0;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getFuelLevel() { return fuelLevel; }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel < 0) this.fuelLevel = 0;
        else if (fuelLevel > 1) this.fuelLevel = 1;
        else this.fuelLevel = fuelLevel;
    }

    public abstract double getFuelConsumption();
    public abstract String getType();

    public double calculateFuelNeeded(double distanceKm) {
        return distanceKm / 100 * getFuelConsumption();
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}