package org.example;

public abstract class  Animal {

private int distRun, distSwim;

    public Animal(int distRun, int distSwim) {
        this.distRun = distRun;
        this.distSwim = distSwim;

    }

    public int getDistRun() {
        return distRun;
    }

    public int getDistSwim() {
        return distSwim;
    }
}


