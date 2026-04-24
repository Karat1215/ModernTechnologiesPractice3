package part3.part3_2;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final String owner;
    private int failedAttempts;
    private boolean blocked;
    private final String pin;

    public BankAccount(String accountNumber, String owner, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.pin = pin;
        this.balance = initialBalance;
        this.failedAttempts = 0;
        this.blocked = false;
    }

    public void withdraw(String enteredPin, double amount) {
        if (blocked) {
            System.out.println("Счёт заблокирован! Операция невозможна.");
            return;
        }

        if (!enteredPin.equals(pin)) {
            failedAttempts++;
            System.out.println("Неверный PIN. Попыток: " + failedAttempts + "/3");
            if (failedAttempts >= 3) {
                blocked = true;
                System.out.println("Счёт ЗАБЛОКИРОВАН!");
            }
            return;
        }

        failedAttempts = 0;

        if (amount <= 0) {
            System.out.println("Сумма должна быть положительной");
            return;
        }

        if (amount > balance) {
            System.out.println("Недостаточно средств. Доступно: " + getMaskedBalance());
            return;
        }

        balance -= amount;
        System.out.println("Снято " + amount + "₽. Баланс: " + getMaskedBalance());
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма должна быть положительной");
            return;
        }
        balance += amount;
        System.out.println("Зачислено " + amount + "₽. Баланс: " + getMaskedBalance());
    }

    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }

    public String getMaskedBalance() {
        if (balance > 100000) {
            return "******";
        }
        return String.format("%.2f", balance) + "₽";
    }

    @Override
    public String toString() {
        return "Счёт " + accountNumber + " | Владелец: " + owner + " | " +
                (blocked ? "[ЗАБЛОКИРОВАН]" : "Баланс: " + getMaskedBalance());
    }
}