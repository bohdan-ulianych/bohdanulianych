package org.example;


public class App {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String mass[][] = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String mass1[][] = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "ячейка 1.1", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String mass2[][] = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String mass3[][] = new String[][]{
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"1", "2", "3"},
                {"5", "2", "3"}};
        try {
            try {
                int a = checkArr(mass);
                System.out.println("Сумма компонентов массива: " + a);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не 4х4!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка при приоброзовании массива. Обратите внимание на ячейку: [" + e.i + "][" + e.j + "]");
        }
    }


    public static int checkArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < arr[i].length; j++) {
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    summ = summ + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return summ;
    }
}








