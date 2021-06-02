package org.example;


public class App {
    public static int year = 2000;
    public static int len = 6;
    public static int initialValue = 1;

    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(firstTask());
        System.out.println("");

        System.out.println("Задание 2");
        int value = -2;
        secondTask(value);
        System.out.println("");

        System.out.println("Задание 3");
        int value1 = -2;
        System.out.println(thirdTask(value1));
        System.out.println("");

        System.out.println("Задание 4");
        fourTask();
        System.out.println("");

        System.out.println("Задание 5");
        if (fiveTask() == true) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
        System.out.println("");

        System.out.println("Задание 6");
        int array1[] = {1, 0, 0, 1, 0, 1, 0, 0};
        System.out.print("Массив до изменения [");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ",");
        }
        System.out.println("]");
        System.out.print("Массив после изменения [");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else array1[i] = 1;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ",");
        }
        System.out.println("]");
        System.out.println("");

        System.out.println("Задание 7");
        System.out.print("[");
        int array2[] = new int[100];
        for (int i = 1; i < array2.length; i++) {
            array2[i] = i;
        }
        for (int i = 1; i < array2.length; i++) {
            System.out.print(array2[i] + ",");
        }
        System.out.println("]");
        System.out.println("");

        System.out.println("Задание 8");
        int array3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Массив до изменения [");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ",");
        }
        System.out.println("]");
        System.out.print("Массив после изменения [");
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ",");
        }
        System.out.println("]");
        System.out.println();


        System.out.println("Задание 8.1");
        int array4[][] = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        System.out.println("Массив до: ");
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array4[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (array4[i] == array4[j]) {
                    array4[i][j] = 1;
                }
            }
        }
        System.out.println("Массив после: ");
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array4[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");

        System.out.println("Задание 9");
        System.out.print("Массив, длинной в " + len + " и заполненный только " + initialValue + " : ");
        System.out.print("[");
        int array6[] = nineTask(len, initialValue);
        for (int i = 0; i < len; i++) {
            System.out.print(array6[i] + ",");
        }
        System.out.println("]");
        System.out.println("");

        System.out.println("Задание 9.1");
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -9};
        int min = arr1[0];
        int max = arr1[0];
        System.out.print("В массиве: [ ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        }
        System.out.print("]");
                for (int i = 0; i < arr1.length; i++) {
            min = (min < arr1[i]) ? min : arr1[i];
            max = (max > arr1[i]) ? max : arr1[i];
        }
        System.out.println("минимальный елемент: " + min + " максимальный -  " + max);
        System.out.println("");

        System.out.println("Задание 10");
        int array7[] = {5, 3, 3, 7, 4};
        System.out.print("В массиве: [ ");
        for (int i = 0; i < array7.length; i++) {
            System.out.print(array7[i] + ",");
        }
        System.out.print("]");
        if (tenTask(array7) == true) {
            System.out.println(" найдена одинаковая сумма");
        } else {
            System.out.println(" одинаковая сумма не найдена");
        }
        System.out.println("");

        System.out.println("Задание 11");
        elevenTask(new int[]{1, 2, 3, 4}, 2);


    }


    public static boolean firstTask() {
        int a = 12;
        int b = 5;
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }


    public static void secondTask(int value) {
        if (value >= 0) {
            System.out.println("Число " + value + " положительное");
        } else {
            System.out.println("Число " + value + " отрицательное");
        }
    }


    public static boolean thirdTask(int value1) {
        if (value1 >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void fourTask() {
        int d = 5;
        String st = "строка";
        for (int i = 0; i < d; i++) {
            System.out.println(st);
        }
    }


    public static boolean fiveTask() {
        if ((year % 4 == 0) && year % 100 != 0) {
            return true;
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] nineTask(int len, int initialValue) {
        int[] array5 = new int[len];
        for (int i = 0; i < len; i++) {
            array5[i] = initialValue;
        }
        return array5;

    }

    public static boolean tenTask(int[] arr) {
        boolean balance = false;
        int arrsumm = 0;
        for (int i = 0; i < arr.length; i++) {
            arrsumm += arr[i];
        }
        int rightSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSumm += arr[i];
            if (rightSumm == arrsumm - rightSumm) {
                balance = true;
            }
        }
        return balance;
    }

    public static void elevenTask(int[] arr2, int n) {
        System.out.print("Массив до изменения: [ ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("Сдвиг на " + n + " позиции");
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr2[arr2.length - 1];
                for (int j = arr2.length - 1; j > 0; j--) {
                    arr2[j] = arr2[j - 1];
                }
                arr2[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int tmp = arr2[0];
                for (int j = 0; j < arr2.length - 1; j++) {
                    arr2[j] = arr2[j + 1];
                }
                arr2[arr2.length - 1] = tmp;
            }
        }
        System.out.print("Массив после изменения: [ ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }
        System.out.print("]");
    }


}


