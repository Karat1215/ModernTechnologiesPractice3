package part4.part4_1;

public class DiscountCalculator {

    // 1. По типу клиента
    public static double calculateDiscount(double price, String customerType) {
        return switch (customerType.toLowerCase()) {
            case "vip" -> price * 0.30;
            case "regular" -> price * 0.10;
            case "new" -> price * 0.05;
            default -> 0;
        };
    }

    // 2. По количеству покупок
    public static double calculateDiscount(double price, int purchaseCount) {
        if (purchaseCount >= 100) return price * 0.20;
        if (purchaseCount >= 50) return price * 0.15;
        if (purchaseCount >= 10) return price * 0.10;
        return 0;
    }

    // 3. По промокоду + первый заказ
    public static double calculateDiscount(double price, String promoCode, boolean isFirstOrder) {
        double discount = 0;
        if ("SAVE10".equals(promoCode)) discount = price * 0.10;
        if ("SAVE20".equals(promoCode)) discount = price * 0.20;
        if (isFirstOrder) discount += price * 0.05;
        return Math.min(discount, price * 0.50);
    }

    // 4. По возрасту клиента (дополнительная перегрузка)
    public static double calculateDiscount(double price, int age, boolean isStudent) {
        double discount = 0;
        if (age >= 60) discount = price * 0.15;
        else if (age <= 18) discount = price * 0.10;
        if (isStudent) discount += price * 0.05;
        return Math.min(discount, price * 0.30);
    }

    public static void main(String[] args) {
        double price = 10000.0;

        System.out.println("Скидка VIP-клиента: " + calculateDiscount(price, "vip") + " руб.");
        System.out.println("Скидка за 75 покупок: " + calculateDiscount(price, 75) + " руб.");
        System.out.println("Скидка SAVE20 + первый заказ: " + calculateDiscount(price, "SAVE20", true) + " руб.");
        System.out.println("Скидка пенсионеру: " + calculateDiscount(price, 65, false) + " руб.");
        System.out.println("Скидка студенту: " + calculateDiscount(price, 20, true) + " руб.");
    }
}