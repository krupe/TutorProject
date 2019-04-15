package com.company.home_work.home_work_04;
//Реализовать метод compare(int a).
//Метод должен выводить строку на экран "Число меньше 5",
// если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр
// метода больше 5 - и, и выводить строку "Число равно 5", если параметр метода равен 5 - и.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_01 {
    public static void main(String[] args) throws IOException {
        int a=input();
        compare(a);

    }
    public static int input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bf.readLine());
    }

public static void compare(int a){
        if(a<5){
            System.out.print("Число меньше 5");
        }else if(a>5){
            System.out.print("Число больше 5");
        }else if(a==5){
            System.out.print("Число равно 5");
        }

}




}
