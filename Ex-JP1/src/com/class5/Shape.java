package com.class5;

public abstract class Shape {
    String color;
    int id;

    public abstract float getArea();

    public abstract float getPerimeter();

    public void display() {
        System.out.println("Shape");
    }
}
