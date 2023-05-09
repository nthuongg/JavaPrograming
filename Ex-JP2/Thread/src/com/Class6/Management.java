package com.Class6;

class Parent {

}

public class Management extends Parent implements Runnable  {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Runnable running " + i);
        }
    }
}

