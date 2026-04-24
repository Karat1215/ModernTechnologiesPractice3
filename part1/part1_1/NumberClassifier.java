package part1.part1_1;

public class NumberClassifier {

    public static String classify(int number) {
        if (number < 0) {
            return "отрицательное";
        } else if (number == 0) {
            return "ноль";
        } else if (number >= 1 && number <= 9) {
            return "однозначное";
        } else if (number >= 10 && number <= 99) {
            return "двузначное";
        } else if (number >= 100 && number <= 999) {
            return "трёхзначное";
        } else {
            return "большое";
        }
    }

    public static void main(String[] args) {
        int[] numbers = {-5, 0, 7, 42, 100, 1000, -999};

        for (int num : numbers) {
            System.out.println(num + " -> " + classify(num));
        }
    }
}