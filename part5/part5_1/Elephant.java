package part5.part5_1;

public class Elephant extends Herbivore {
    public Elephant(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " трубит: Tyyyyt!");
    }

    public void trumpet() {
        System.out.println(name + " издаёт громкий звук: ТУУУУУ!");
    }
}