/*
Даны вещественные числа a, b, c ( 0
a ). Выяснить, имеет ли уравнение
2 0
ax bx c вещественные корни. Если такие корни имеются, то найти их.
В противном случае ответом должно служить сообщение, что вещественных
корней нет.

 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введи три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double d = (b * b) - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("вещественных корней 2: " + x1 + " и " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("вещественных корней 1: " + x);
        } else {
            System.out.println("вещественных корней нет");
        }


    }

}