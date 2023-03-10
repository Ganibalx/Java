package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Category {
    String name;
    Product[] array;

    public Category(String name, Product[] array) {
        this.name = name;
        this.array = array;
    }

    public void buy(Product[] product) {
        int i = 0;
        int q = 0;
        for (Product a : this.array) {
            for (Product o : product) {
                if (a.name.equals(o.name)) i++;
            }
            if (i == 0) q++;
            i=0;
        }
        Product[] newArray = new Product[q];
        q = 0;
        for (Product k : this.array) {
            for (Product j : product) {
                if (k.name.equals(j.name)) q++;
            }
            if (q == 0 ){
                newArray[i] = k;
                i++;
                }
            q = 0;
            }
        this.array = newArray;

    }

    public void print() {
        for (Product a : this.array) {
            if (a != null) System.out.println(a.name);
        }
    }
}
