package org.example;

public class HomeCat extends Cat {
    static int homeCat;
    public HomeCat(String name) {
        super(name, 0, "Домашний кот");
        homeCat++;
    }
}
