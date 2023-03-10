package org.example;

public class Cat extends Animals{
    static int catCount;

    public Cat(String name, int maxSwimDist, String type) {
        super(name, 200, maxSwimDist, type);
        catCount++;
    }
}
