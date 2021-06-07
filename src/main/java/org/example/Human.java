package org.example;

public class Human implements Sport {
    private String name;
    private int run;
    private int jump;

    public Human(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public void showInfo() {
        System.out.println("Человек " + this.name + " может пробежать " + this.run + "км и прыгнуть на " + this.jump + "м");
    }

    @Override
    public void canrun() {
        System.out.println("Человек умеет бежать");
    }

    @Override
    public void canjump() {
        System.out.println("Человек умеет прыгать");
    }
}
