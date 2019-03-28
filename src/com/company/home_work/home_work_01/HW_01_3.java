package com.company.home_work.home_work_01;
/*
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class HW_01_3 {
    public static void main (String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int number =Integer.parseInt(bf.readLine());
        System.out.println("Я буду зарабатывать $"+number+" в час.");



    }
}
