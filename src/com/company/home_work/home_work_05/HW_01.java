package com.company.home_work.home_work_05;
/*
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввести строку:");
        String st = bf.readLine();
        System.out.println("Ввести число:");
        int num1 = Integer.parseInt(bf.readLine());

        int i = 1;
        while (i < 3) {
            System.out.println(st);
            i++;

        }


    }
}
