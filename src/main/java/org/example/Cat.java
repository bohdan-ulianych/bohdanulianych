package org.example;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }


    public boolean isSatiety() {
        return satiety;
    }


    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety = true;
    }
}