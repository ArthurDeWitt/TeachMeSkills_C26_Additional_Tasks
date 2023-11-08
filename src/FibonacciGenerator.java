import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        // Ввод ограничений с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers to generate (max. 100): ");
        int limit = scanner.nextByte();

        // Проверка условий при вводе ограничений
        if (limit <= 0 || limit > 100) {
            System.out.println("The limit must be in the range of 1 to 100.");
            return;
        }

        // Создание массива для хранения чисел
        long[] fibonacciNumbers = new long[limit];
        fibonacciNumbers[0] = 0; // Первое число
        fibonacciNumbers[1] = 1; // Второе число

        // Создание цикла для генерации чисел Фибоначчи
        for (int i = 2; i < limit; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Вывод результата
        System.out.println("Result: ");
        for (int i = 0; i < limit; i++) {
            System.out.println(fibonacciNumbers[i]);
        }
    }
}

