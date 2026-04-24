package part2.part2_2;

public class Fibonacci {

    // Итеративный через while
    public static int fibIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        int i = 2;
        while (i <= n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return b;
    }

    // Через for
    public static int fibFor(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Числа Фибоначчи F(0)..F(15):");
        for (int i = 0; i <= 15; i++) {
            System.out.println("F(" + i + ") = " + fibFor(i));
        }

        // Первое число > 1000
        int n = 0;
        while (fibFor(n) <= 1000) {
            n++;
        }
        System.out.println("\nПервое число Фибоначчи > 1000: F(" + n + ") = " + fibFor(n));
    }
}