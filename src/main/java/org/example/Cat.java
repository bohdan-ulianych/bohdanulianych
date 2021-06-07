package org.example;

public class Cat implements Sport {
    private String name;
    private int run;
    private int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void canrun() {
        System.out.println("Кот умеет бежать");
    }

    @Override
    public void canjump() {
        System.out.println("Кот умеет прыгать");
    }

    public void showInfo() {
        System.out.println("Кот " + this.name + " может пробежать " + this.run + "км и прыгнуть на " + this.jump + "м");
    }


}
