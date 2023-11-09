package com.teachmeskills.additionaltasks;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод числа
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            // Инициализация счётчика
            int sum = 0;
            // Ввод переменной сохранения исходного числа
            int saveNumber = number;

            while (saveNumber != 0){
                int digit = saveNumber % 10;
                sum += digit;
                saveNumber /= 10;
            }
            System.out.println("The sum of the digits of a number" + number + "is equal to " + sum);
        }
}
