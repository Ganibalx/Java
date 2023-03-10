package org.example;

public abstract class Animals {
    protected String name;
    protected int maxRunDist;
    protected int maxSwimDist;
    protected String type;
    static int count;

    public Animals(String name, int maxRunDist, int maxSwimDist, String type) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
        this.type = type;
        count++;
    }

    public void run(int dist){
        if(dist<=maxRunDist){
            System.out.println(name + " может пробежать "+ dist);
        }
        else System.out.println(name + " не может пробежать "+ dist);
    }

    public void swim(int dist){
        if (maxSwimDist==0) System.out.println(name + " не умеет плавать");
        else{
            if(dist<=maxSwimDist) System.out.println(name + " может проплыть "+ dist);
            else System.out.println(name + " не может проплыть "+ dist);
            }
    }
}