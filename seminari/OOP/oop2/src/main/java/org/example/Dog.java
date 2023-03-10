package org.example;

public class Dog extends Animals{
    static int dogCount;
    public Dog(String name) {
        super(name, 500, 10, "Собака");
        dogCount++;
    }
}
