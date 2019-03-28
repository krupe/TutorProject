package com.company.home_work.home_work_02;
/*
    Ввести с клавиатуры три числа, вывести на экран максимальное из них.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number1:");
        int num1 =Integer.parseInt(bf.readLine());
        System.out.println("Enter number2:");
        int num2 =Integer.parseInt(bf.readLine());

        if(num1>num2){
            System.out.println(num2);
        } else{
            System.out.println(num1);
        }

    }
}
