package sync;

import java.util.Random;

public class CharProvider extends Thread {
    CharObject charObject;

    public CharProvider(CharObject c) {
        this.charObject = c;
    }

    @Override
    public void run() {
        //Create random Char
        while(true) {

            try {
                //synchronized Shared Resource
                synchronized (this.charObject) {
                    if(charObject.isFree) {
                        charObject.wait();
                    }

                    Random random = new Random();
                    int nRan = random.nextInt(26);
                    char ch = (char) (nRan + 97);

                    this.charObject.ch = ch;
                    System.out.println( this.charObject.ch);

                    //notify to other Thread
                    charObject.isFree = true;
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