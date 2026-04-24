package part5.part5_1;

import java.util.Optional;

public class ZooDemo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion simba = new Lion("Симба", 5, 150);
        Elephant dumbo = new Elephant("Дамбо", 10, 3000);

        zoo.addAnimal(simba);
        zoo.addAnimal(dumbo);
        zoo.showAll();

        zoo.makeNoise();

        System.out.println("\n=== Лев тренируется ===");
        simba.train("Сидеть");
        simba.train("Лежать");
        System.out.println("Команды льва: " + simba.listCommands());

        System.out.println("\n=== Лев охотится ===");
        simba.hunt();

        System.out.println("\n=== Слон пасётся ===");
        dumbo.graze();

        zoo.feedAll();

        System.out.println("\n=== Голодные животные (энергия < 30) ===");
        for (Animal a : zoo.getHungryAnimals()) {
            System.out.println(a.name + " - энергия " + a.getEnergyLevel());
        }

        System.out.println("\n=== Поиск животного ===");
        Optional<Animal> found = zoo.findAnimal("Симба");
        if (found.isPresent()) {
            System.out.println("Найдено: " + found.get().name);
            if (found.get() instanceof Lion) {
                ((Lion) found.get()).roar();
            }
        }

        Optional<Animal> notFound = zoo.findAnimal("Нет");
        System.out.println("Поиск 'Нет': " + (notFound.isEmpty() ? "Не найдено" : "Найдено"));
    }
}