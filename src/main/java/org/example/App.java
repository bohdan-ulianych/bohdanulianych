package org.example;


public class App {
    public static void main(String[] args) throws MyArraySizeException {
        String mass[][] = new String[][]{{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        String mass1[][] = new String[][]{{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        try {
            checkArr(mass1);

        } catch (MyArraySizeException e) {
            System.out.println("Подан масив другого размера");
        }


    }


    public static void checkArr(String[][] arr) throws MyArraySizeException {
        if (arr.length == 4) {
            System.out.println("Подали масив размером 4х4");
        } else {
            throw new MyArraySizeException();
        }
    }
}








