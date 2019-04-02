package com.company.home_work.home_work_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* программист.]
Пример текста:
Света программист. // 10 раз
…
*/
public class HW_05 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");

        String st= bf.readLine();


        for(int i=1; i <= 10; i++){
            System.out.println(st+" programmer.");
        }
    }


}
