package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class Fruit {
    private float weight;

    Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
