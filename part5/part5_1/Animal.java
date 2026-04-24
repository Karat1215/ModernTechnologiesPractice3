package part5.part5_1;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected int energyLevel; // 0-100

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = 50;
    }

    public String getName() { return name; }
    public int getEnergyLevel() { return energyLevel; }

    public void eat(int calories) {
        energyLevel += calories / 10;
        if (energyLevel > 100) energyLevel = 100;
        System.out.println(name + " поел. Энергия: " + energyLevel);
    }

    public void sleep(int hours) {
        energyLevel += hours * 5;
        if (energyLevel > 100) energyLevel = 100;
        System.out.println(name + " поспал " + hours + "ч. Энергия: " + energyLevel);
    }

    public abstract void makeSound();
}