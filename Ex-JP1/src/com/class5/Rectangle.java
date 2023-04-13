package com.class5;

public class Rectangle extends Shape {

    float width;
    float length;

    Rectangle() {

    }

    Rectangle( float l , float w ) {
        this.length = l;
        this.width = w;
    }

    @Override
    public float getArea() {
        return this.length * this.width;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    public void display() {
        System.out.println("Width = " + this.width + ", Lengh = " + this.length);
    }

//    @Override
//    public int compareTo(Object o) {
//        Rectangle rec = (Rectangle) o;
//        return (int) (this.width - rec.width);
//    }
}
