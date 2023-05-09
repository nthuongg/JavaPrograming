package com.Class6;

public class SecondThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Second Thread: " + i);
        }
    }
}
