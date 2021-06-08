package org.example;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /////////////////task1
        String mas[] = {"alaal", "1235", "bubu", "aga", "agy"};
        Integer mas1[] = {125, 258, 225, 558, 55, 8};
        System.out.print("[");
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ,");
        }
        System.out.println("]");
        System.out.println("Change 4 and 3 array`s elements...");
        changeArr(mas1, 3, 2);
        System.out.println(Arrays.toString(mas1));
        System.out.println("");
        ///////////////////////////////////////////////////////////task 2
        //////создание елементов
        System.out.println("Task 3");
        System.out.println("Boxes info...");
        int countOfOrangesInBox1 = 3;
        int countOfOrangesInBox2 = 15;
        int countOfApplesInBox = 8;
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        ////наполнение коробок
        for (int i = 0; i < countOfOrangesInBox1; i++) {
            orangeBox1.add(new Orange());
        }
        for (int i = 0; i < countOfOrangesInBox2; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < countOfApplesInBox; i++) {
            appleBox.add(new Apple());
        }
        ////информация о наполнении коробок
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
        ///вывод и сравнение весов коробок
        System.out.println("Boxes weight...");
        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float appleWeight = appleBox.getWeight();
        System.out.println("Weight box 1 with oranges: " + orange1Weight + "kg");
        System.out.println("Weight box 2 with oranges: " + orange2Weight + "kg");
        System.out.println("Weight box with apples: " + appleWeight + "kg");
        System.out.println("Compare boxes...");
        System.out.println("Weight orangeBox1 more than appleBox? - " + orangeBox1.compare(appleBox));
        System.out.println("Weight orangeBox2 more than appleBox? - " + orangeBox2.compare(appleBox));
        ///////пересыпание фруктов
        System.out.println("Moving oranges from orangeBox1 to orangeBox2...");
        orangeBox1.moveAt(orangeBox2);
        ///orangeBox1.moveAt(appleBox); - ошибка если ссыпать яблока и апельсины. организовать через трай-кетч?
        //////информация о коробках после пересыпания
        System.out.println("Boxes info...");
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }


    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }


    public static <T> void changeArr(T[] array, int ind1, int ind2) {
        T buffer = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = buffer;
    }
}


