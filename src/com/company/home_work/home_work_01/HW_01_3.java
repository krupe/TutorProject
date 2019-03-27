package com.company.home_work.home_work_01;
/*
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

public class HW_01_3 {
    public static void main (String[] args){
        int a=100;
        System.out.println("Я буду зарабатывать $"+a+" в час.");
        System.out.format("Я буду зарабатывать $%d в час.",a);


    }
}
