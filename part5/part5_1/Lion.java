package part5.part5_1;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Predator implements Trainable {
    private List<String> commands;

    public Lion(String name, int age, double weight) {
        super(name, age, weight);
        this.commands = new ArrayList<>();
    }

    @Override
    public void makeSound() {
        System.out.println(name + " рычит: P-p-p!");
    }

    public void roar() {
        System.out.println(name + " громко рычит: РРРРР!");
    }

    @Override
    public void train(String command) {
        if (!commands.contains(command)) {
            commands.add(command);
        }
        System.out.println(name + " выучил команду: " + command);
    }

    @Override
    public List<String> listCommands() {
        return new ArrayList<>(commands);
    }
}