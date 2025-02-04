package kz.kaznu.delya.HW1;

import java.util.Scanner;

public class MainApp {
    public static void main() {
        greetings();
        checkSign(4, 6, -2);
        selectColor();
        compareNumbers(33, 34);
        addOrSubtractAndPrint(6, 5, false);
    }

    public static void greetings() {
        System.out.print("Hello\n world\n from\n java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }

    public static void selectColor() {
        Scanner color = new Scanner(System.in);
        System.out.println("Введите число: ");
        int data = color.nextInt();
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println("result=" + initValue + "+" + delta);
        } else {
            System.out.println("result=" + initValue + "-" + delta);
        }
    }
}

