package part1.part1_3;

public class ObjectDescriber {

    public static String describe(Object obj) {
        return switch (obj) {
            case null -> "Это null";
            case Integer i when i > 0 -> "Положительное целое число: " + i;
            case Integer i -> "Не положительное целое число: " + i;
            case String s when s.isEmpty() -> "Пустая строка";
            case String s -> "Непустая строка: \"" + s + "\"";
            case Double d -> "Дробное число: " + d;
            case int[] arr -> "Массив целых чисел длины " + arr.length;
            default -> "Объект неизвестного типа: " + obj.getClass().getSimpleName();
        };
    }

    public static void main(String[] args) {
        Object[] testObjects = {null, 42, -5, "", "Привет", 3.14, new int[]{1, 2, 3}, true};

        for (Object obj : testObjects) {
            System.out.println(describe(obj));
        }
    }
}