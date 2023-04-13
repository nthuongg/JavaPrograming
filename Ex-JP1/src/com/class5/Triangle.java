package com.class5;

public class Triangle extends Shape {
    float a;
    float b;
    float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float getArea() {
        float p = (a+b+c) / 2;
        return (float) Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    @Override
    public float getPerimeter() {
        return 0;
    }
}
