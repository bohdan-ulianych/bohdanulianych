package org.example;

public class Robot implements Sport {
    private String name;
    private int run;
    private int jump;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public void showInfo() {
        System.out.println("Робот " + this.name + " может пробежать " + this.run + "км и прыгнуть на " + this.jump + "м");
    }

    @Override
    public void canrun() {
        System.out.println("Робот умеет бежать");
    }

    @Override
    public void canjump() {
        System.out.println("Робот умеет прыгать");
    }
}
