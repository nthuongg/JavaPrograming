package com.class5;

public class Circle extends Shape implements IColor {

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * this.radius * this.radius;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public void fillColor() {
        System.out.println("Fill color to Circle");
    }
}
