import java.util.Scanner;

public class SquareFigures {
    public static void main(String[] args) {
        // Создание переменной для хранения вычислений площади
        double square = 0;
        // Создание переменных для хранения длины, ширины, радиуса, сторон треугольника
        double length, width, radius, side1, side2, side3;
        // Инициализация числа Пи
        double pi = Math.PI;
        // Инициализация ввода кода фигуры
        byte indexOfFigure;
        System.out.println("Select code of a figure: Rectangle - 1; Circle - 2; Triangle - 3: ");
        Scanner scanner = new Scanner(System.in);
        indexOfFigure = scanner.nextByte();

        switch (indexOfFigure) {
            // Прямоугольник
            case 1:
                // Ввод длины и ширины прямоугольника
                System.out.println("Enter the length of the rectangle");
                Scanner scanner1 = new Scanner(System.in);
                length = scanner1.nextDouble();
                System.out.println("Enter the width of the rectangle");
                Scanner scanner2 = new Scanner(System.in);
                width = scanner2.nextDouble();
                // Расчёт площади прямоугольника
                square = length * width;
                // Проверка на 0 и отрицательные значения
                if (length<=0 || width<=0){
                    System.out.println("Enter positive values");
                    return;
                }
                System.out.println("Square of rectangle is: " + square);
                return;
            // Круг
            case 2:
                // Ввод радиуса круга
                System.out.println("Enter the value of the circle radius");
                Scanner scanner3 = new Scanner(System.in);
                radius = scanner3.nextDouble();
                // Проверка на 0 и отрицательные значения
                if (radius <= 0){
                    System.out.println("Enter positive values");
                    return;
                }
                // Расчёт площади круга
                square = pi * radius * radius;
                System.out.println("Square of rectangle is: " + square);
                return;
            // Треугольник
            case 3:
                // Ввод сторон треугольника
                System.out.println("Enter the first side of the triangle");
                Scanner scanner4 = new Scanner(System.in);
                side1 = scanner4.nextDouble();
                System.out.println("Enter the second side of the triangle");
                Scanner scanner5 = new Scanner(System.in);
                side2 = scanner5.nextDouble();
                System.out.println("Enter the third side of the triangle");
                Scanner scanner6 = new Scanner(System.in);
                side3 = scanner6.nextDouble();
                // Проверка на 0 и отрицательные значения
                if (side1 <= 0 || side2 <=0 || side3 <= 0){
                    System.out.println("Enter positive values");
                    return;
                }
                /*
                 Проверка существования такого треугольника
                 (Если сумма двух любых сторон меньше третьей, то такого треугольника не существует)
                 */
                if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
                    // Инициализация расчёта полупериметра для треугольника
                    double p = (side1 + side2 + side3) / 2;
                    // Расчёт площади прямоугольника по формуле Герона
                    square = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
                    System.out.println("Square of triangle = " + square);
                } else {
                    System.out.println("Such a triangle doesn't exist");
                }
                return;
            default:
                System.out.println("Wrong code of figure");
        }
    }
}

