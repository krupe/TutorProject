package com.company.home_work.home_work_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести 5 чисел с клавиатуры и записать их в массив
// Вывести содержимое массива в консоль
public class HW_01 {
    public static void main(String[] args) throws IOException {
        int array[]=new int[5];

        for (int i = 0; i < array.length; i++) {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number: ");
            int a= Integer.parseInt(bf.readLine());
            array[i]=a;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);

        }

    }


}
