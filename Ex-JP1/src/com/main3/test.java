package com.main3;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //Khởi tạo 1 array
        list.add("nguyen"); //Thêm phần tử
        list.add("thi");
        list.add("huong");
        list.add("t2210m");
        list.remove("thi"); // Xóa 1 phần tử
        System.out.println(list.get(0)); // Truy cập phần tử đầu tiên
        list.set(0, "aptech"); // Thay đổi phần tử đầu tiên thành aptech
        Collections.sort(list); // Sắp xếp 1 ArrayList của chuỗi
        System.out.println(list.size()); // Để biết số phần tử có trong 1 ArayList
        for (int i = 0; i < list.size(); i++) {  // Lặp ArrayList
            System.out.println(list.get(i));
        }
        //hoặc
        for (String i : list) {
            System.out.println(i);
        }


    }
}
