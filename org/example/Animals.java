package org.example;


public abstract class Animals {
    static int animalCount = 0;
    String name;
    static int count;

    public Animals(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int lenght);

    public abstract void swim(int lenght);





}
