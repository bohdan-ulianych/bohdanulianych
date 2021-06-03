package org.example;

public class Cat extends Animal {
    static int countCat;

    Cat(int distRun, int distSwim) {
        super(distRun, distSwim);
        countCat++;
    }
}