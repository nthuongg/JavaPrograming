package com.class5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainClass {

    //Overload method
    public int sum(int a, int b) {
        return (a + b);
    }

    public int sum(float a, float b) {
        return (int)(a + b);
    }

    public int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String[] args) {

        List<Rectangle> list = new ArrayList<Rectangle>();
        list.add(new Rectangle(3, 4));
        list.add(new Rectangle(4, 5));
        list.add(new Rectangle(2, 3));

        list.sort(new CompareRectangle());

        for(Rectangle item : list) {
            item.display();
        }


        //Generic
//        List<Shape> list = new ArrayList<Shape>();
//        list.add(new Rectangle(4, 5));
//        list.add(new Triangle(3, 4, 5));
//        list.add(new Circle(5));
//
//        float total = 0;
//        for(Shape item : list ) {
//            total += item.getArea();
//            System.out.println("Area: " + item.getArea());
//        }
//
//        System.out.println("Total area: " + total);
    }
}
