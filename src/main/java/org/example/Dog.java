package org.example;

public class Dog extends Animal {

    static int countDog;

    Dog(int distRun, int distSwim) {
        super(distRun, distSwim);
        countDog++;
    }
}