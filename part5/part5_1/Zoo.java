package part5.part5_1;

import java.util.*;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
        System.out.println("В зоопарк добавлен: " + a.name);
    }

    public void feedAll() {
        System.out.println("\n=== Кормление всех животных ===");
        for (Animal a : animals) {
            a.eat(50);
        }
    }

    public void makeNoise() {
        System.out.println("\n=== Все животные издают звуки ===");
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    public List<Animal> getHungryAnimals() {
        List<Animal> hungry = new ArrayList<>();
        for (Animal a : animals) {
            if (a.energyLevel < 30) {
                hungry.add(a);
            }
        }
        return hungry;
    }

    public Optional<Animal> findAnimal(String name) {
        for (Animal a : animals) {
            if (a.name.equalsIgnoreCase(name)) {
                return Optional.of(a);
            }
        }
        return Optional.empty();
    }

    public void showAll() {
        System.out.println("\n=== Список животных ===");
        for (Animal a : animals) {
            System.out.println(a.name + " (" + a.getClass().getSimpleName() + ") - Энергия: " + a.energyLevel);
        }
    }
}