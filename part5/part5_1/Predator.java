package part5.part5_1;

public abstract class Predator extends Animal {
    public Predator(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void hunt() {
        energyLevel += 30;
        if (energyLevel > 100) energyLevel = 100;
        weight -= 0.5;
        System.out.println(name + " охотился. Энергия: " + energyLevel + ", Вес: " + weight);
    }
}