package com.company.home_work.home_work_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
*/
public class HW_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter:");
         String str= bf.readLine();
         int num1= Integer.parseInt(str);

         System.out.println("Enter:");
         String str1= bf.readLine();
         int num2= Integer.parseInt(str1);

         System.out.println("Enter:");
         int num3= Integer.parseInt(bf.readLine());

         if (num1>num3 && num2>num3){
             System.out.println(num2);
         } else if(num2>num1 && num1>num3){
             System.out.println(num1);
         } else if(num3<num1 &&  num2>num1){
             System.out.println(num3);
         }
    }

}
