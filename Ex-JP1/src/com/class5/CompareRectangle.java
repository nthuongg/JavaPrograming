package com.class5;

import java.util.Comparator;

public class CompareRectangle implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Rectangle rec1 = (Rectangle) o1;
        Rectangle rec2 = (Rectangle) o2;

        return (int) (rec2.width - rec1.width);
    }
}
