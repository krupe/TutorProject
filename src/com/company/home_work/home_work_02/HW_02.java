package com.company.home_work.home_work_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Ввести с клавиатуры три числа, вывести на экран максимальное из них.
*/
public class HW_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter num:");
        String str= bf.readLine();
        int num1=Integer.parseInt(str);

        System.out.println("Enter num2:");
        String str1=bf.readLine();
        int num2=Integer.parseInt(str1);

        System.out.println("Enter num3:");
        String str2= bf.readLine();
        int num3=Integer.parseInt(str2);
// TODO: 28.03.2019
        if(num1>num2 && num3>num2){
            System.out.println(num3);
        } else if(num1>num2 && num3<num2){
            System.out.println(num1);
        } else if(num3<num2 && num2>num1){
            System.out.println(num2);
        }
    }
}
