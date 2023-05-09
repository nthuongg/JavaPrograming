package com.sync;

public class CharComsumer extends Thread {
    CharObject charObject;

    public CharComsumer(CharObject c) {
        this.charObject = c;
    }

    @Override
    public void run() {
        //Create random Char
        while(true) {
            try {
                synchronized (this.charObject) {
                    if(!charObject.isFree) {
                        charObject.wait();
                    }

                    String str = ""+ this.charObject.ch; //Shared Resource
                    str = str.toUpperCase();

                    System.out.println("--------Comsumer: " + str);

                    charObject.isFree = false;
                    charObject.notify();
                    pause();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    void pause() {
        try {
            Thread.sleep(400);
        } catch (Exception e) {
        }
    }

}
