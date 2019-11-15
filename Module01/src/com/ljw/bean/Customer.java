package com.ljw.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Customer {
    public static void main(String[] args) {
        System.out.printf("Custemer");
        ArrayList list= new ArrayList();

    }
    public void m(){
        int num=10;
        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

