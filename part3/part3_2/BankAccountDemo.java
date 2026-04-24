package part3.part3_2;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456", "Иван Петров", "1234", 150000);

        System.out.println("=== Начальное состояние ===");
        System.out.println(acc);

        System.out.println("\n=== Попытка снять с неверным PIN (3 раза) ===");
        acc.withdraw("1111", 1000);
        acc.withdraw("2222", 1000);
        acc.withdraw("3333", 1000);

        System.out.println("\n=== Состояние после неверных попыток ===");
        System.out.println(acc);

        System.out.println("\n=== Попытка снять с правильным PIN ===");
        acc.withdraw("1234", 50000);

        System.out.println("\n=== Пополнение счёта ===");
        acc.deposit(20000);

        System.out.println("\n=== Попытка снять больше баланса ===");
        acc.withdraw("1234", 200000);

        System.out.println("\n=== Финальное состояние ===");
        System.out.println(acc);
    }
}