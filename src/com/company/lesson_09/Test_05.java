package com.company.lesson_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести 5 строк с клавиатуры и записать их в массив
public class Test_05 {
    public static void main(String[] args) throws IOException {

        String[]array=new String[5];

        for(int i=0;i<array.length;i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter line: ");
            String st = reader.readLine();
            array[i]=st;

        }
        for(int i=0;i<array.length;i++){

            System.out.println(array[i]);
        }


    }
}
