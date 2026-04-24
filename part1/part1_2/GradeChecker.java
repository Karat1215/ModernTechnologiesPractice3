package part1.part1_2;

public class GradeChecker {

    // Классический switch
    public static String getGradeClassic(int score) {
        switch (score / 10) {
            case 10:
            case 9:
                return "Отлично (A)";
            case 8:
                return "Хорошо (B)";
            case 7:
                return "Удовлетворительно (C)";
            case 6:
                return "Слабо (D)";
            default:
                return "Неудовлетворительно (F)";
        }
    }

    // Стрелочный switch (Java 14+)
    public static String getGradeArrow(int score) {
        return switch (score / 10) {
            case 10, 9 -> "Отлично (A)";
            case 8 -> "Хорошо (B)";
            case 7 -> "Удовлетворительно (C)";
            case 6 -> "Слабо (D)";
            default -> "Неудовлетворительно (F)";
        };
    }

    public static void main(String[] args) {
        int[] scores = {95, 85, 73, 62, 45, 100, 0};

        System.out.println("=== Классический switch ===");
        for (int score : scores) {
            System.out.println(score + " -> " + getGradeClassic(score));
        }

        System.out.println("\n=== Стрелочный switch ===");
        for (int score : scores) {
            System.out.println(score + " -> " + getGradeArrow(score));
        }
    }
}