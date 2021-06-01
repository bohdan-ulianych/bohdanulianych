package org.example;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        printThreeWordsprintThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();

    }

    public static void printThreeWordsprintThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSign() {
        int a = 2;
        int b = 5;
        int c = b + a;
        if (c >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 150;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 7;
        if (a >= b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }
}

