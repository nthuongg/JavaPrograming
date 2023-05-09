package com.Class6;

public class MainClass {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        ft.start();

        SecondThread st = new SecondThread();
        st.start();
    }


}
