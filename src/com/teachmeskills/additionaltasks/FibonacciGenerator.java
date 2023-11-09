package com.teachmeskills.additionaltasks;

import java.util.Scanner;
import java.math.BigInteger;

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
        BigInteger[] fibonacciNumbers = new BigInteger[limit];
        fibonacciNumbers[0] = BigInteger.valueOf(0); // Задаём первое число Фибоначчи
        fibonacciNumbers[1] = BigInteger.valueOf(1); //  Задаём второе число Фибоначчи

        // Создание цикла для генерации чисел Фибоначчи
        for (int i = 2; i < limit; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1].add(fibonacciNumbers[i - 2]);
        }

        // Вывод результата
        System.out.println("Result: ");
        for (int i = 0; i < limit; i++) {
            System.out.println(fibonacciNumbers[i]);
        }
    }
}

