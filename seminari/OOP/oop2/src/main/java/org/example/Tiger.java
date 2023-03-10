package org.example;

public class Tiger extends Cat {
    static int tigerCount;
    public Tiger(String name, int maxSwimDist) {
        super(name, maxSwimDist, "Tiger");
        tigerCount++;
    }
}
